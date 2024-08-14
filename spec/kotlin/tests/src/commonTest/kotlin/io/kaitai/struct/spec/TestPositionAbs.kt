// Autogenerated from KST: please remove this line if doing any edits by hand!

package io.kaitai.struct.spec

import io.kaitai.struct.typing.*
import io.kaitai.struct.testformats.PositionAbs
import kotlin.test.*
import okio.FileSystem
import okio.Path.Companion.toPath
import okio.SYSTEM

class TestPositionAbs {
    val SRC_DIR = FileSystem.SYSTEM.canonicalize("../../../src/".toPath(true))

    @Test
    fun testPositionAbs() {
        val path = SRC_DIR.resolve("position_abs.bin").toString()
        val r: PositionAbs = PositionAbs.fromFile(path)

        assertEquals(actual = r.indexOffset(), expected = 32)
        assertEquals(actual = r.index().entry(), expected = "foo")
    }
}
