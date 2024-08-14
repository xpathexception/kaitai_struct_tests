// Autogenerated from KST: please remove this line if doing any edits by hand!

package io.kaitai.struct.spec

import io.kaitai.struct.typing.*
import io.kaitai.struct.testformats.SwitchManualEnum
import kotlin.test.*
import okio.FileSystem
import okio.Path.Companion.toPath
import okio.SYSTEM

class TestSwitchManualEnum {
    val SRC_DIR = FileSystem.SYSTEM.canonicalize("../../../src/".toPath(true))

    @Test
    fun testSwitchManualEnum() {
        val path = SRC_DIR.resolve("switch_opcodes.bin").toString()
        val r: SwitchManualEnum = SwitchManualEnum.fromFile(path)

        assertEquals(actual = r.opcodes().size, expected = 4)
        assertEquals(actual = r.opcodes()[0].code(), expected = SwitchManualEnum.Opcode.CodeEnum.STRVAL)
        assertEquals(actual = (r.opcodes()[0].body() as SwitchManualEnum.Opcode.Strval) /* generic cast */.value(), expected = "foobar")
        assertEquals(actual = r.opcodes()[1].code(), expected = SwitchManualEnum.Opcode.CodeEnum.INTVAL)
        assertEquals(actual = (r.opcodes()[1].body() as SwitchManualEnum.Opcode.Intval) /* generic cast */.value(), expected = 66)
        assertEquals(actual = r.opcodes()[2].code(), expected = SwitchManualEnum.Opcode.CodeEnum.INTVAL)
        assertEquals(actual = (r.opcodes()[2].body() as SwitchManualEnum.Opcode.Intval) /* generic cast */.value(), expected = 55)
        assertEquals(actual = r.opcodes()[3].code(), expected = SwitchManualEnum.Opcode.CodeEnum.STRVAL)
        assertEquals(actual = (r.opcodes()[3].body() as SwitchManualEnum.Opcode.Strval) /* generic cast */.value(), expected = "")
    }
}
