// Autogenerated from KST: please remove this line if doing any edits by hand!

package io.kaitai.struct.spec

import io.kaitai.struct.typing.*
import io.kaitai.struct.testformats.SwitchManualStr
import kotlin.test.*
import okio.FileSystem
import okio.Path.Companion.toPath
import okio.SYSTEM

class TestSwitchManualStr {
    val SRC_DIR = FileSystem.SYSTEM.canonicalize("../../../src/".toPath(true))

    @Test
    fun testSwitchManualStr() {
        val path = SRC_DIR.resolve("switch_opcodes.bin").toString()
        val r: SwitchManualStr = SwitchManualStr.fromFile(path)

        assertEquals(actual = r.opcodes().size, expected = 4)
        assertEquals(actual = r.opcodes()[0].code(), expected = "S")
        assertEquals(actual = (r.opcodes()[0].body() as SwitchManualStr.Opcode.Strval) /* generic cast */.value(), expected = "foobar")
        assertEquals(actual = r.opcodes()[1].code(), expected = "I")
        assertEquals(actual = (r.opcodes()[1].body() as SwitchManualStr.Opcode.Intval) /* generic cast */.value(), expected = 66)
        assertEquals(actual = r.opcodes()[2].code(), expected = "I")
        assertEquals(actual = (r.opcodes()[2].body() as SwitchManualStr.Opcode.Intval) /* generic cast */.value(), expected = 55)
        assertEquals(actual = r.opcodes()[3].code(), expected = "S")
        assertEquals(actual = (r.opcodes()[3].body() as SwitchManualStr.Opcode.Strval) /* generic cast */.value(), expected = "")
    }
}
