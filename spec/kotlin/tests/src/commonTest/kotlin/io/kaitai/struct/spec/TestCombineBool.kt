// Autogenerated from KST: please remove this line if doing any edits by hand!

package io.kaitai.struct.spec

import io.kaitai.struct.typing.*
import io.kaitai.struct.testformats.CombineBool
import kotlin.test.*
import okio.FileSystem
import okio.Path.Companion.toPath
import okio.SYSTEM

class TestCombineBool {
    val SRC_DIR = FileSystem.SYSTEM.canonicalize("../../../src/".toPath(true))

    @Test
    fun testCombineBool() {
        val path = SRC_DIR.resolve("enum_negative.bin").toString()
        val r: CombineBool = CombineBool.fromFile(path)

        assertEquals(actual = r.boolBit(), expected = true)
        assertEquals(actual = r.boolCalcBit(), expected = false)
    }
}
