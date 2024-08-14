// Autogenerated from KST: please remove this line if doing any edits by hand!

package io.kaitai.struct.spec

import io.kaitai.struct.typing.*
import io.kaitai.struct.testformats.DefaultBitEndianMod
import kotlin.test.*
import okio.FileSystem
import okio.Path.Companion.toPath
import okio.SYSTEM

class TestDefaultBitEndianMod {
    val SRC_DIR = FileSystem.SYSTEM.canonicalize("../../../src/".toPath(true))

    @Test
    fun testDefaultBitEndianMod() {
        val path = SRC_DIR.resolve("fixed_struct.bin").toString()
        val r: DefaultBitEndianMod = DefaultBitEndianMod.fromFile(path)

        assertEquals(actual = r.main().one(), expected = 336)
        assertEquals(actual = r.main().two(), expected = 8608)
        assertEquals(actual = r.main().nest().two(), expected = 11595)
        assertEquals(actual = r.main().nestBe().two(), expected = 12799)
    }
}