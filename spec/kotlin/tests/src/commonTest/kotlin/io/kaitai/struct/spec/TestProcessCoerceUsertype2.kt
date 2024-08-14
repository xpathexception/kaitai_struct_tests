// Autogenerated from KST: please remove this line if doing any edits by hand!

package io.kaitai.struct.spec

import io.kaitai.struct.typing.*
import io.kaitai.struct.testformats.ProcessCoerceUsertype2
import kotlin.test.*
import okio.FileSystem
import okio.Path.Companion.toPath
import okio.SYSTEM

class TestProcessCoerceUsertype2 {
    val SRC_DIR = FileSystem.SYSTEM.canonicalize("../../../src/".toPath(true))

    @Test
    fun testProcessCoerceUsertype2() {
        val path = SRC_DIR.resolve("process_coerce_bytes.bin").toString()
        val r: ProcessCoerceUsertype2 = ProcessCoerceUsertype2.fromFile(path)

        assertEquals(actual = r.records()[0].flag(), expected = 0)
        assertEquals(actual = r.records()[0].buf().value(), expected = 1094795585)
        assertEquals(actual = r.records()[1].flag(), expected = 1)
        assertEquals(actual = r.records()[1].buf().value(), expected = 1111638594)
    }
}
