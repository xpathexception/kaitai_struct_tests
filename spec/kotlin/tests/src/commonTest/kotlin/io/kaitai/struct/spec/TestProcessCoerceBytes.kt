// Autogenerated from KST: please remove this line if doing any edits by hand!

package io.kaitai.struct.spec

import io.kaitai.struct.typing.*
import io.kaitai.struct.testformats.ProcessCoerceBytes
import kotlin.test.*
import okio.FileSystem
import okio.Path.Companion.toPath
import okio.SYSTEM

class TestProcessCoerceBytes {
    val SRC_DIR = FileSystem.SYSTEM.canonicalize("../../../src/".toPath(true))

    @Test
    fun testProcessCoerceBytes() {
        val path = SRC_DIR.resolve("process_coerce_bytes.bin").toString()
        val r: ProcessCoerceBytes = ProcessCoerceBytes.fromFile(path)

        assertEquals(actual = r.records()[0].flag(), expected = 0)
        assertEquals(actual = r.records()[0].buf(), expected = byteArrayOf(65, 65, 65, 65))
        assertEquals(actual = r.records()[1].flag(), expected = 1)
        assertEquals(actual = r.records()[1].buf(), expected = byteArrayOf(66, 66, 66, 66))
    }
}
