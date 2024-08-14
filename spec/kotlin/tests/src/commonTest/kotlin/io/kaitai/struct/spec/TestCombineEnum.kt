// Autogenerated from KST: please remove this line if doing any edits by hand!

package io.kaitai.struct.spec

import io.kaitai.struct.typing.*
import io.kaitai.struct.testformats.CombineEnum
import kotlin.test.*
import okio.FileSystem
import okio.Path.Companion.toPath
import okio.SYSTEM

class TestCombineEnum {
    val SRC_DIR = FileSystem.SYSTEM.canonicalize("../../../src/".toPath(true))

    @Test
    fun testCombineEnum() {
        val path = SRC_DIR.resolve("enum_0.bin").toString()
        val r: CombineEnum = CombineEnum.fromFile(path)

        assertEquals(actual = r.enumU4(), expected = CombineEnum.Animal.PIG)
        assertEquals(actual = r.enumU2(), expected = CombineEnum.Animal.HORSE)
        assertEquals(actual = r.enumU4U2(), expected = CombineEnum.Animal.HORSE)
    }
}