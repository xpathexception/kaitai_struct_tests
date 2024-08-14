// Autogenerated from KST: please remove this line if doing any edits by hand!

package io.kaitai.struct.spec

import io.kaitai.struct.typing.*
import io.kaitai.struct.testformats.SwitchIntegers
import kotlin.test.*
import okio.FileSystem
import okio.Path.Companion.toPath
import okio.SYSTEM

class TestSwitchIntegers {
    val SRC_DIR = FileSystem.SYSTEM.canonicalize("../../../src/".toPath(true))

    @Test
    fun testSwitchIntegers() {
        val path = SRC_DIR.resolve("switch_integers.bin").toString()
        val r: SwitchIntegers = SwitchIntegers.fromFile(path)

        assertEquals(actual = r.opcodes().size, expected = 4)
        assertEquals(actual = r.opcodes()[0].code(), expected = 1)
        assertEquals(actual = r.opcodes()[0].body(), expected = 7)
        assertEquals(actual = r.opcodes()[1].code(), expected = 2)
        assertEquals(actual = r.opcodes()[1].body(), expected = 16448)
        assertEquals(actual = r.opcodes()[2].code(), expected = 4)
        assertEquals(actual = r.opcodes()[2].body(), expected = 4919)
        assertEquals(actual = r.opcodes()[3].code(), expected = 8)
        assertEquals(actual = r.opcodes()[3].body(), expected = 4919)
    }
}
