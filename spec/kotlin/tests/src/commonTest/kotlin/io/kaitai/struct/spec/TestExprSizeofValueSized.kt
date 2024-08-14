// Autogenerated from KST: please remove this line if doing any edits by hand!

package io.kaitai.struct.spec

import io.kaitai.struct.typing.*
import io.kaitai.struct.testformats.ExprSizeofValueSized
import kotlin.test.*
import okio.FileSystem
import okio.Path.Companion.toPath
import okio.SYSTEM

class TestExprSizeofValueSized {
    val SRC_DIR = FileSystem.SYSTEM.canonicalize("../../../src/".toPath(true))

    @Test
    fun testExprSizeofValueSized() {
        val path = SRC_DIR.resolve("fixed_struct.bin").toString()
        val r: ExprSizeofValueSized = ExprSizeofValueSized.fromFile(path)

        assertEquals(actual = r.selfSizeof(), expected = 12 + 2)
        assertEquals(actual = r.sizeofBlock(), expected = 12)
        assertEquals(actual = r.sizeofBlockA(), expected = 1)
        assertEquals(actual = r.sizeofBlockB(), expected = 4)
        assertEquals(actual = r.sizeofBlockC(), expected = 2)
    }
}