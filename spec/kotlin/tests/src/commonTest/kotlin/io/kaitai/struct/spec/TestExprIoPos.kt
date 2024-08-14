// Autogenerated from KST: please remove this line if doing any edits by hand!

package io.kaitai.struct.spec

import io.kaitai.struct.typing.*
import io.kaitai.struct.testformats.ExprIoPos
import kotlin.test.*
import okio.FileSystem
import okio.Path.Companion.toPath
import okio.SYSTEM

class TestExprIoPos {
    val SRC_DIR = FileSystem.SYSTEM.canonicalize("../../../src/".toPath(true))

    @Test
    fun testExprIoPos() {
        val path = SRC_DIR.resolve("expr_io_pos.bin").toString()
        val r: ExprIoPos = ExprIoPos.fromFile(path)

        assertEquals(actual = r.substream1().myStr(), expected = "CURIOSITY")
        assertEquals(actual = r.substream1().body(), expected = byteArrayOf(17, 34, 51, 68))
        assertEquals(actual = r.substream1().number(), expected = 66)
        assertEquals(actual = r.substream2().myStr(), expected = "KILLED")
        assertEquals(actual = r.substream2().body(), expected = byteArrayOf(97, 32, 99, 97, 116))
        assertEquals(actual = r.substream2().number(), expected = 103)
    }
}