// Autogenerated from KST: please remove this line if doing any edits by hand!

package io.kaitai.struct.spec

import io.kaitai.struct.typing.*
import io.kaitai.struct.testformats.DefaultEndianMod
import kotlin.test.*
import okio.FileSystem
import okio.Path.Companion.toPath
import okio.SYSTEM

class TestDefaultEndianMod {
    val SRC_DIR = FileSystem.SYSTEM.canonicalize("../../../src/".toPath(true))

    @Test
    fun testDefaultEndianMod() {
        val path = SRC_DIR.resolve("fixed_struct.bin").toString()
        val r: DefaultEndianMod = DefaultEndianMod.fromFile(path)

        assertEquals(actual = r.main().one(), expected = 1262698832)
        assertEquals(actual = r.main().nest().two(), expected = -52947)
        assertEquals(actual = r.main().nestBe().two(), expected = 1346454347)
    }
}