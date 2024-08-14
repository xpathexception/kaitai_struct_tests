// Autogenerated from KST: please remove this line if doing any edits by hand!

package io.kaitai.struct.spec

import io.kaitai.struct.typing.*
import io.kaitai.struct.testformats.TermU1Val
import kotlin.test.*
import okio.FileSystem
import okio.Path.Companion.toPath
import okio.SYSTEM

class TestTermU1Val {
    val SRC_DIR = FileSystem.SYSTEM.canonicalize("../../../src/".toPath(true))

    @Test
    fun testTermU1Val() {
        val path = SRC_DIR.resolve("str_encodings.bin").toString()
        val r: TermU1Val = TermU1Val.fromFile(path)

        assertEquals(actual = r.foo(), expected = byteArrayOf(10, 0, 83, 111, 109, 101, 32, 65, 83, 67, 73, 73, 15, 0))
        assertEquals(actual = r.bar(), expected = "\u3053\u3093\u306b")
    }
}
