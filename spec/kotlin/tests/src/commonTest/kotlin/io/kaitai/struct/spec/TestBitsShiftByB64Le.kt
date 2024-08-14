// Autogenerated from KST: please remove this line if doing any edits by hand!

package io.kaitai.struct.spec

import io.kaitai.struct.typing.*
import io.kaitai.struct.testformats.BitsShiftByB64Le
import kotlin.test.*
import okio.FileSystem
import okio.Path.Companion.toPath
import okio.SYSTEM

class TestBitsShiftByB64Le {
    val SRC_DIR = FileSystem.SYSTEM.canonicalize("../../../src/".toPath(true))

    @Test
    fun testBitsShiftByB64Le() {
        val path = SRC_DIR.resolve("bits_shift_by_b64_le.bin").toString()
        val r: BitsShiftByB64Le = BitsShiftByB64Le.fromFile(path)

        assertEquals(actual = r.a(), expected = 18446744073709551615U.toLong())
        assertEquals(actual = r.b(), expected = 0)
    }
}