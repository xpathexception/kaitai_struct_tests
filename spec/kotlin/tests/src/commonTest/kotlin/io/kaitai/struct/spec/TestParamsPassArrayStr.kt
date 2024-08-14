// Autogenerated from KST: please remove this line if doing any edits by hand!

package io.kaitai.struct.spec

import io.kaitai.struct.typing.*
import io.kaitai.struct.testformats.ParamsPassArrayStr
import kotlin.test.*
import okio.FileSystem
import okio.Path.Companion.toPath
import okio.SYSTEM

class TestParamsPassArrayStr {
    val SRC_DIR = FileSystem.SYSTEM.canonicalize("../../../src/".toPath(true))

    @Test
    fun testParamsPassArrayStr() {
        val path = SRC_DIR.resolve("term_strz.bin").toString()
        val r: ParamsPassArrayStr = ParamsPassArrayStr.fromFile(path)

        assertEquals(actual = r.passStrArray().strs().size, expected = 3)
        assertEquals(actual = r.passStrArray().strs()[0], expected = "fo")
        assertEquals(actual = r.passStrArray().strs()[1], expected = "o|")
        assertEquals(actual = r.passStrArray().strs()[2], expected = "ba")
        assertEquals(actual = r.passStrArrayCalc().strs().size, expected = 2)
        assertEquals(actual = r.passStrArrayCalc().strs()[0], expected = "aB")
        assertEquals(actual = r.passStrArrayCalc().strs()[1], expected = "Cd")
    }
}