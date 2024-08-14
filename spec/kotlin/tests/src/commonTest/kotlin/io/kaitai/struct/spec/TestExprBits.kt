// Autogenerated from KST: please remove this line if doing any edits by hand!

package io.kaitai.struct.spec

import io.kaitai.struct.typing.*
import io.kaitai.struct.testformats.ExprBits
import kotlin.test.*
import okio.FileSystem
import okio.Path.Companion.toPath
import okio.SYSTEM

class TestExprBits {
    val SRC_DIR = FileSystem.SYSTEM.canonicalize("../../../src/".toPath(true))

    @Test
    fun testExprBits() {
        val path = SRC_DIR.resolve("switch_opcodes.bin").toString()
        val r: ExprBits = ExprBits.fromFile(path)

        assertEquals(actual = r.a(), expected = 2)
        assertEquals(actual = r.enumSeq(), expected = ExprBits.Items.FOO)
        assertEquals(actual = r.byteSize(), expected = byteArrayOf(102, 111))
        assertEquals(actual = r.repeatExpr().size, expected = 2)
        assertEquals(actual = r.repeatExpr()[0], expected = 111)
        assertEquals(actual = r.repeatExpr()[1], expected = 98)
        assertEquals(actual = r.switchOnType(), expected = 97)
        assertEquals(actual = r.switchOnEndian().foo(), expected = 29184)
        assertEquals(actual = r.enumInst(), expected = ExprBits.Items.BAR)
        assertEquals(actual = r.instPos(), expected = 111)
    }
}