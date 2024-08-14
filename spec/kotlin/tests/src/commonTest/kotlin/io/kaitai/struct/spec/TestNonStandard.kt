// Autogenerated from KST: please remove this line if doing any edits by hand!

package io.kaitai.struct.spec

import io.kaitai.struct.typing.*
import io.kaitai.struct.testformats.NonStandard
import kotlin.test.*
import okio.FileSystem
import okio.Path.Companion.toPath
import okio.SYSTEM

class TestNonStandard {
    val SRC_DIR = FileSystem.SYSTEM.canonicalize("../../../src/".toPath(true))

    @Test
    fun testNonStandard() {
        val path = SRC_DIR.resolve("fixed_struct.bin").toString()
        val r: NonStandard = NonStandard.fromFile(path)

        assertEquals(actual = r.foo(), expected = 80)
    }
}