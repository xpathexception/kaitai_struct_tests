// Autogenerated from KST: please remove this line if doing any edits by hand!

package io.kaitai.struct.spec

import io.kaitai.struct.typing.*
import io.kaitai.struct.testformats.EnumToI
import kotlin.test.*
import okio.FileSystem
import okio.Path.Companion.toPath
import okio.SYSTEM

class TestEnumToI {
    val SRC_DIR = FileSystem.SYSTEM.canonicalize("../../../src/".toPath(true))

    @Test
    fun testEnumToI() {
        val path = SRC_DIR.resolve("enum_0.bin").toString()
        val r: EnumToI = EnumToI.fromFile(path)

        assertEquals(actual = r.pet1(), expected = EnumToI.Animal.CAT)
        assertEquals(actual = r.pet2(), expected = EnumToI.Animal.CHICKEN)
        assertEquals(actual = r.pet1I(), expected = 7)
        assertEquals(actual = r.pet1IToS(), expected = "7")
        assertEquals(actual = r.pet1Mod(), expected = 32775)
        assertEquals(actual = r.oneLtTwo(), expected = true)
        assertEquals(actual = r.pet1EqInt(), expected = true)
        assertEquals(actual = r.pet2EqInt(), expected = false)
    }
}