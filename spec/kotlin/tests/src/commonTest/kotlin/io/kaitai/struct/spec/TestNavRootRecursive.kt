// Autogenerated from KST: please remove this line if doing any edits by hand!

package io.kaitai.struct.spec

import io.kaitai.struct.typing.*
import io.kaitai.struct.testformats.NavRootRecursive
import kotlin.test.*
import okio.FileSystem
import okio.Path.Companion.toPath
import okio.SYSTEM

class TestNavRootRecursive {
    val SRC_DIR = FileSystem.SYSTEM.canonicalize("../../../src/".toPath(true))

    @Test
    fun testNavRootRecursive() {
        val path = SRC_DIR.resolve("enum_negative.bin").toString()
        val r: NavRootRecursive = NavRootRecursive.fromFile(path)

        assertEquals(actual = r.value(), expected = 255)
        assertEquals(actual = r.next().value(), expected = 1)
        assertEquals(actual = r.next().rootValue(), expected = 255)
        assertNull(r.next().next())
    }
}
