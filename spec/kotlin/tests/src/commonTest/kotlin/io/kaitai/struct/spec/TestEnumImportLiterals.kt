// Autogenerated from KST: please remove this line if doing any edits by hand!

package io.kaitai.struct.spec

import io.kaitai.struct.typing.*
import io.kaitai.struct.testformats.EnumImportLiterals
import io.kaitai.struct.testformats.EnumDeep
import kotlin.test.*
import okio.FileSystem
import okio.Path.Companion.toPath
import okio.SYSTEM

class TestEnumImportLiterals {
    val SRC_DIR = FileSystem.SYSTEM.canonicalize("../../../src/".toPath(true))

    @Test
    fun testEnumImportLiterals() {
        val path = SRC_DIR.resolve("enum_0.bin").toString()
        val r: EnumImportLiterals = EnumImportLiterals.fromFile(path)

        assertEquals(actual = r.pet1ToI(), expected = 7)
        assertEquals(actual = r.pet1Eq(), expected = true)
        assertEquals(actual = r.pet2(), expected = EnumDeep.Container1.Container2.Animal.HARE)
    }
}
