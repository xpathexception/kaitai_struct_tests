// Autogenerated from KST: please remove this line if doing any edits by hand!

package io.kaitai.struct.spec

import io.kaitai.struct.typing.*
import io.kaitai.struct.testformats.RepeatUntilSized
import kotlin.test.*
import okio.FileSystem
import okio.Path.Companion.toPath
import okio.SYSTEM

class TestRepeatUntilSized {
    val SRC_DIR = FileSystem.SYSTEM.canonicalize("../../../src/".toPath(true))

    @Test
    fun testRepeatUntilSized() {
        val path = SRC_DIR.resolve("repeat_until_process.bin").toString()
        val r: RepeatUntilSized = RepeatUntilSized.fromFile(path)

        assertEquals(actual = r.records().size, expected = 3)
        assertEquals(actual = r.records()[0].marker(), expected = 232)
        assertEquals(actual = r.records()[0].body(), expected = 2863311546)
        assertEquals(actual = r.records()[1].marker(), expected = 250)
        assertEquals(actual = r.records()[1].body(), expected = 2863315102)
        assertEquals(actual = r.records()[2].marker(), expected = 170)
        assertEquals(actual = r.records()[2].body(), expected = 1431655765)
    }
}
