// Autogenerated from KST: please remove this line if doing any edits by hand!

package io.kaitai.struct.spec

import io.kaitai.struct.typing.*
import io.kaitai.struct.testformats.BitsSimple
import kotlin.test.*
import okio.FileSystem
import okio.Path.Companion.toPath
import okio.SYSTEM

class TestBitsSimple {
    val SRC_DIR = FileSystem.SYSTEM.canonicalize("../../../src/".toPath(true))

    @Test
    fun testBitsSimple() {
        val path = SRC_DIR.resolve("fixed_struct.bin").toString()
        val r: BitsSimple = BitsSimple.fromFile(path)

        assertEquals(actual = r.byte1(), expected = 80)
        assertEquals(actual = r.byte2(), expected = 65)
        assertEquals(actual = r.bitsA(), expected = false)
        assertEquals(actual = r.bitsB(), expected = 4)
        assertEquals(actual = r.bitsC(), expected = 3)
        assertEquals(actual = r.largeBits1(), expected = 300)
        assertEquals(actual = r.spacer(), expected = 5)
        assertEquals(actual = r.largeBits2(), expected = 1329)
        assertEquals(actual = r.normalS2(), expected = -1)
        assertEquals(actual = r.byte8910(), expected = 5259587)
        assertEquals(actual = r.byte11To14(), expected = 1261262125)
        assertEquals(actual = r.byte15To19(), expected = 293220057087)
        assertEquals(actual = r.byte20To27(), expected = 18446744073709551615U.toLong())
        assertEquals(actual = r.testIfB1(), expected = 123)
    }
}
