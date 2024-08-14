// Autogenerated from KST: please remove this line if doing any edits by hand!

package io.kaitai.struct.spec

import io.kaitai.struct.typing.*
import io.kaitai.struct.testformats.Enum0
import kotlin.test.*
import okio.FileSystem
import okio.Path.Companion.toPath
import okio.SYSTEM

class TestEnum0 {
    val SRC_DIR = FileSystem.SYSTEM.canonicalize("../../../src/".toPath(true))

    @Test
    fun testEnum0() {
        val path = SRC_DIR.resolve("enum_0.bin").toString()
        val r: Enum0 = Enum0.fromFile(path)

        assertEquals(actual = r.pet1(), expected = Enum0.Animal.CAT)
        assertEquals(actual = r.pet2(), expected = Enum0.Animal.CHICKEN)
    }
}
