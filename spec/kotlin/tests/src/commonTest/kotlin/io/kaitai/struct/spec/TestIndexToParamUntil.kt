// Autogenerated from KST: please remove this line if doing any edits by hand!

package io.kaitai.struct.spec

import io.kaitai.struct.typing.*
import io.kaitai.struct.testformats.IndexToParamUntil
import kotlin.test.*
import okio.FileSystem
import okio.Path.Companion.toPath
import okio.SYSTEM

class TestIndexToParamUntil {
    val SRC_DIR = FileSystem.SYSTEM.canonicalize("../../../src/".toPath(true))

    @Test
    fun testIndexToParamUntil() {
        val path = SRC_DIR.resolve("index_sizes.bin").toString()
        val r: IndexToParamUntil = IndexToParamUntil.fromFile(path)

        assertEquals(actual = r.qty(), expected = 3)
        assertEquals(actual = r.sizes()[0], expected = 1)
        assertEquals(actual = r.sizes()[1], expected = 8)
        assertEquals(actual = r.sizes()[2], expected = 4)
        assertEquals(actual = r.blocks()[0].buf(), expected = "A")
        assertEquals(actual = r.blocks()[1].buf(), expected = "BBBBBBBB")
        assertEquals(actual = r.blocks()[2].buf(), expected = "CCCC")
    }
}
