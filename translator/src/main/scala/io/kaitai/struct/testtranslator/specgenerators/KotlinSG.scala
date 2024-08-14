package io.kaitai.struct.testtranslator.specgenerators

import io.kaitai.struct.datatype.{DataType, KSError}
import io.kaitai.struct.exprlang.Ast
import io.kaitai.struct.languages.KotlinCompiler
import io.kaitai.struct.testtranslator.{Main, TestEquals, TestSpec}
import io.kaitai.struct.translators.KotlinTranslator
import io.kaitai.struct.{ClassTypeProvider, RuntimeConfig}

class KotlinSG(spec: TestSpec, provider: ClassTypeProvider) extends BaseGenerator(spec) {
  val config = RuntimeConfig()
  val className = KotlinCompiler.type2class(spec.id)
  val compiler = new KotlinCompiler(provider, config)
  val translator = compiler.translator

  importList.add("io.kaitai.struct.typing.*")
  importList.add(s"io.kaitai.struct.testformats.$className")
  spec.extraImports.foreach(entry =>
    importList.add(s"io.kaitai.struct.testformats.${KotlinCompiler.type2class(entry)}")
  )

  importList.add("kotlin.test.*")

  def sourcesDir(): String = {
    "../../../src/"
  }

  override def fileName(name: String): String = s"tests/src/commonTest/kotlin/io/kaitai/struct/spec/Test$className.kt"

  override def header(): Unit = {
    out.puts
    out.puts(s"class Test$className {")
    out.inc
    out.puts(s"val SRC_DIR = FileSystem.SYSTEM.canonicalize(\"${sourcesDir()}\".toPath(true))")
    out.puts
  }

  override def runParse(): Unit = {
    out.puts("@Test")
    runParseCommon()
  }

  override def runParseExpectError(exception: KSError): Unit = {
    importList.add("io.kaitai.struct.KaitaiStream")
    importList.add("okio.FileSystem")
    importList.add("okio.Path.Companion.toPath")
    importList.add("okio.SYSTEM")

    out.puts("@Test")
    out.puts(s"fun test$className() {")
    out.inc
    out.puts(s"assertFailsWith(${compiler.ksErrorName(exception)}::class) {")
    out.inc
    out.puts(s"val path = SRC_DIR.resolve(\"${spec.data}\").toString()")
    out.puts(s"$className.fromFile(path)")
    out.dec
    out.puts("}")
  }

  def runParseCommon(): Unit = {
    importList.add("okio.FileSystem")
    importList.add("okio.Path.Companion.toPath")
    importList.add("okio.SYSTEM")

    out.puts(s"fun test$className() {")
    out.inc
    out.puts(s"val path = SRC_DIR.resolve(\"${spec.data}\").toString()")
    out.puts(s"val r: $className = $className.fromFile(path)")
  }

  override def footer(): Unit = {
    out.dec
    out.puts("}")
    out.dec
    out.puts("}")
  }

  override def simpleEquality(check: TestEquals): Unit = {
    val actStr = translateAct(check.actual)
    val expStr = translator.translate(check.expected)
    out.puts(s"assertEquals(actual = $actStr, expected = $expStr)")
  }

  override def floatEquality(check: TestEquals): Unit = {
    val actStr = translateAct(check.actual)
    val expStr = translator.translate(check.expected)
    out.puts(s"assertEquals($actStr, $expStr, $FLOAT_DELTA)")
  }

  override def nullAssert(actual: Ast.expr): Unit = {
    val actStr = translateAct(actual)
    out.puts(s"assertNull($actStr)")
  }

  override def trueArrayEquality(check: TestEquals, elType: DataType, elts: Seq[Ast.expr]): Unit = {
    val actStr = translateAct(check.actual)
    val expStr = translator.translate(check.expected)
    out.puts(s"assertContentEquals(actual = $actStr, expected = $expStr)")
  }

  override def testException(actual: Ast.expr, exception: KSError): Unit = {
    importList.add("io.kaitai.struct.KaitaiStream")

    out.puts(s"assertFailsWith(${compiler.ksErrorName(exception)}::class) {")
    out.inc
    out.puts(s"${translateAct(actual)}")
    out.dec
    out.puts("}")
  }

  override def indentStr: String = "    "

  override def results: String = {
    "// " + AUTOGEN_COMMENT + "\n\n" +
      "package io.kaitai.struct.spec\n\n" +
      importList.toList.map((x) => s"import $x").mkString("", "\n", "\n") +
      out.result
  }

  def translateAct(x: Ast.expr) =
    translator.translate(x).replace(Main.INIT_OBJ_NAME + "()", "r")
}
