// Autogenerated from KST: please remove this line if doing any edits by hand!

package io.kaitai.struct.spec

import io.kaitai.struct.typing.*
import io.kaitai.struct.testformats.BitsSignedShiftB32Le
import kotlin.test.*
import okio.FileSystem
import okio.Path.Companion.toPath
import okio.SYSTEM

class TestBitsSignedShiftB32Le {
    val SRC_DIR = FileSystem.SYSTEM.canonicalize("../../../src/".toPath(true))

    @Test
    fun testBitsSignedShiftB32Le() {
        val path = SRC_DIR.resolve("bits_signed_shift_b32_le.bin").toString()
        val r: BitsSignedShiftB32Le = BitsSignedShiftB32Le.fromFile(path)

        assertEquals(actual = r.a(), expected = 0)
        assertEquals(actual = r.b(), expected = 255)
    }
}