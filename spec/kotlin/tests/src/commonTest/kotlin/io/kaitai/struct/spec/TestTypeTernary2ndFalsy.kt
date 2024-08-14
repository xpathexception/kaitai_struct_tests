// Autogenerated from KST: please remove this line if doing any edits by hand!

package io.kaitai.struct.spec

import io.kaitai.struct.typing.*
import io.kaitai.struct.testformats.TypeTernary2ndFalsy
import kotlin.test.*
import okio.FileSystem
import okio.Path.Companion.toPath
import okio.SYSTEM

class TestTypeTernary2ndFalsy {
    val SRC_DIR = FileSystem.SYSTEM.canonicalize("../../../src/".toPath(true))

    @Test
    fun testTypeTernary2ndFalsy() {
        val path = SRC_DIR.resolve("switch_integers.bin").toString()
        val r: TypeTernary2ndFalsy = TypeTernary2ndFalsy.fromFile(path)

        assertEquals(actual = r.vFalse(), expected = false)
        assertEquals(actual = r.vIntZero(), expected = 0)
        assertEquals(actual = r.vIntNegZero(), expected = 0)
        assertEquals(r.vFloatZero(), 0.0, 1e-6)
        assertEquals(r.vFloatNegZero(), -0.0, 1e-6)
        assertEquals(actual = r.vStrWZero(), expected = "0")
        assertEquals(actual = r.vStrWZero().length, expected = 1)
        assertEquals(actual = r.ut().m(), expected = 7)
        assertNull(r.vNullUt())
        assertEquals(actual = r.vStrEmpty(), expected = "")
        assertEquals(actual = r.vStrEmpty().length, expected = 0)
        assertEquals(actual = r.intArray().size, expected = 2)
        assertEquals(actual = r.vIntArrayEmpty().size, expected = 0)
    }
}
