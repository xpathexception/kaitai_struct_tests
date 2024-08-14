// Autogenerated from KST: please remove this line if doing any edits by hand!

package io.kaitai.struct.spec

import io.kaitai.struct.typing.*
import io.kaitai.struct.testformats.NavParentFalse
import kotlin.test.*
import okio.FileSystem
import okio.Path.Companion.toPath
import okio.SYSTEM

class TestNavParentFalse {
    val SRC_DIR = FileSystem.SYSTEM.canonicalize("../../../src/".toPath(true))

    @Test
    fun testNavParentFalse() {
        val path = SRC_DIR.resolve("nav_parent_codes.bin").toString()
        val r: NavParentFalse = NavParentFalse.fromFile(path)

        assertEquals(actual = r.childSize(), expected = 3)
        assertEquals(actual = r.elementA().foo().code(), expected = 73)
        assertEquals(actual = r.elementA().foo().more(), expected = byteArrayOf(49, 50, 51))
        assertEquals(actual = r.elementA().bar().foo().code(), expected = 66)
        assertEquals(actual = r.elementB().foo().code(), expected = 98)
    }
}
