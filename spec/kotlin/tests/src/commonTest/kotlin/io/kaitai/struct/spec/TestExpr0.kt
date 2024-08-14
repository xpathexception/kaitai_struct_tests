// Autogenerated from KST: please remove this line if doing any edits by hand!

package io.kaitai.struct.spec

import io.kaitai.struct.typing.*
import io.kaitai.struct.testformats.Expr0
import kotlin.test.*
import okio.FileSystem
import okio.Path.Companion.toPath
import okio.SYSTEM

class TestExpr0 {
    val SRC_DIR = FileSystem.SYSTEM.canonicalize("../../../src/".toPath(true))

    @Test
    fun testExpr0() {
        val path = SRC_DIR.resolve("str_encodings.bin").toString()
        val r: Expr0 = Expr0.fromFile(path)

        assertEquals(actual = r.mustBeF7(), expected = 247)
        assertEquals(actual = r.mustBeAbc123(), expected = "abc123")
    }
}
