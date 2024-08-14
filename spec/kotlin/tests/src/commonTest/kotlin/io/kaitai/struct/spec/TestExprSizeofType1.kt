// Autogenerated from KST: please remove this line if doing any edits by hand!

package io.kaitai.struct.spec

import io.kaitai.struct.typing.*
import io.kaitai.struct.testformats.ExprSizeofType1
import kotlin.test.*
import okio.FileSystem
import okio.Path.Companion.toPath
import okio.SYSTEM

class TestExprSizeofType1 {
    val SRC_DIR = FileSystem.SYSTEM.canonicalize("../../../src/".toPath(true))

    @Test
    fun testExprSizeofType1() {
        val path = SRC_DIR.resolve("fixed_struct.bin").toString()
        val r: ExprSizeofType1 = ExprSizeofType1.fromFile(path)

        assertEquals(actual = r.sizeofBlock(), expected = ((1 + 4) + 2) + 4)
        assertEquals(actual = r.sizeofSubblock(), expected = 4)
    }
}