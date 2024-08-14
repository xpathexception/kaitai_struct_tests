// Autogenerated from KST: please remove this line if doing any edits by hand!

package io.kaitai.struct.spec

import io.kaitai.struct.typing.*
import io.kaitai.struct.testformats.Integers
import kotlin.test.*
import okio.FileSystem
import okio.Path.Companion.toPath
import okio.SYSTEM

class TestIntegers {
    val SRC_DIR = FileSystem.SYSTEM.canonicalize("../../../src/".toPath(true))

    @Test
    fun testIntegers() {
        val path = SRC_DIR.resolve("fixed_struct.bin").toString()
        val r: Integers = Integers.fromFile(path)

        assertEquals(actual = r.uint8(), expected = 255)
        assertEquals(actual = r.uint16(), expected = 65535)
        assertEquals(actual = r.uint32(), expected = 4294967295)
        assertEquals(actual = r.uint64(), expected = 18446744073709551615U.toLong())
        assertEquals(actual = r.sint8(), expected = -1)
        assertEquals(actual = r.sint16(), expected = -1)
        assertEquals(actual = r.sint32(), expected = -1)
        assertEquals(actual = r.sint64(), expected = -1)
        assertEquals(actual = r.uint16le(), expected = 66)
        assertEquals(actual = r.uint32le(), expected = 66)
        assertEquals(actual = r.uint64le(), expected = 66)
        assertEquals(actual = r.sint16le(), expected = -66)
        assertEquals(actual = r.sint32le(), expected = -66)
        assertEquals(actual = r.sint64le(), expected = -66)
        assertEquals(actual = r.uint16be(), expected = 66)
        assertEquals(actual = r.uint32be(), expected = 66)
        assertEquals(actual = r.uint64be(), expected = 66)
        assertEquals(actual = r.sint16be(), expected = -66)
        assertEquals(actual = r.sint32be(), expected = -66)
        assertEquals(actual = r.sint64be(), expected = -66)
    }
}