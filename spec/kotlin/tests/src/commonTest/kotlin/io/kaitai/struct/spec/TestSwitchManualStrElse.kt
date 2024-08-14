// Autogenerated from KST: please remove this line if doing any edits by hand!

package io.kaitai.struct.spec

import io.kaitai.struct.typing.*
import io.kaitai.struct.testformats.SwitchManualStrElse
import kotlin.test.*
import okio.FileSystem
import okio.Path.Companion.toPath
import okio.SYSTEM

class TestSwitchManualStrElse {
    val SRC_DIR = FileSystem.SYSTEM.canonicalize("../../../src/".toPath(true))

    @Test
    fun testSwitchManualStrElse() {
        val path = SRC_DIR.resolve("switch_opcodes2.bin").toString()
        val r: SwitchManualStrElse = SwitchManualStrElse.fromFile(path)

        assertEquals(actual = r.opcodes().size, expected = 4)
        assertEquals(actual = r.opcodes()[0].code(), expected = "S")
        assertEquals(actual = (r.opcodes()[0].body() as SwitchManualStrElse.Opcode.Strval) /* generic cast */.value(), expected = "foo")
        assertEquals(actual = r.opcodes()[1].code(), expected = "X")
        assertEquals(actual = (r.opcodes()[1].body() as SwitchManualStrElse.Opcode.Noneval) /* generic cast */.filler(), expected = 66)
        assertEquals(actual = r.opcodes()[2].code(), expected = "Y")
        assertEquals(actual = (r.opcodes()[2].body() as SwitchManualStrElse.Opcode.Noneval) /* generic cast */.filler(), expected = 51966)
        assertEquals(actual = r.opcodes()[3].code(), expected = "I")
        assertEquals(actual = (r.opcodes()[3].body() as SwitchManualStrElse.Opcode.Intval) /* generic cast */.value(), expected = 7)
    }
}