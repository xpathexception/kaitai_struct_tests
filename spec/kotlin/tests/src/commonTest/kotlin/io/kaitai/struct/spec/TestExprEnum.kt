// Autogenerated from KST: please remove this line if doing any edits by hand!

package io.kaitai.struct.spec

import io.kaitai.struct.typing.*
import io.kaitai.struct.testformats.ExprEnum
import kotlin.test.*
import okio.FileSystem
import okio.Path.Companion.toPath
import okio.SYSTEM

class TestExprEnum {
    val SRC_DIR = FileSystem.SYSTEM.canonicalize("../../../src/".toPath(true))

    @Test
    fun testExprEnum() {
        val path = SRC_DIR.resolve("term_strz.bin").toString()
        val r: ExprEnum = ExprEnum.fromFile(path)

        assertEquals(actual = r.constDog(), expected = ExprEnum.Animal.DOG)
        assertEquals(actual = r.derivedBoom(), expected = ExprEnum.Animal.BOOM)
        assertEquals(actual = r.derivedDog(), expected = ExprEnum.Animal.DOG)
    }
}