// Autogenerated from KST: please remove this line if doing any edits by hand!

package io.kaitai.struct.spec

import io.kaitai.struct.typing.*
import io.kaitai.struct.testformats.ProcessRotate
import kotlin.test.*
import okio.FileSystem
import okio.Path.Companion.toPath
import okio.SYSTEM

class TestProcessRotate {
    val SRC_DIR = FileSystem.SYSTEM.canonicalize("../../../src/".toPath(true))

    @Test
    fun testProcessRotate() {
        val path = SRC_DIR.resolve("process_rotate.bin").toString()
        val r: ProcessRotate = ProcessRotate.fromFile(path)

        assertEquals(actual = r.buf1(), expected = byteArrayOf(72, 101, 108, 108, 111))
        assertEquals(actual = r.buf2(), expected = byteArrayOf(87, 111, 114, 108, 100))
        assertEquals(actual = r.buf3(), expected = byteArrayOf(84, 104, 101, 114, 101))
    }
}
