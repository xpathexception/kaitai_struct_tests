// Autogenerated from KST: please remove this line if doing any edits by hand!

package io.kaitai.struct.spec

import io.kaitai.struct.typing.*
import io.kaitai.struct.testformats.StrEos
import kotlin.test.*
import okio.FileSystem
import okio.Path.Companion.toPath
import okio.SYSTEM

class TestStrEos {
    val SRC_DIR = FileSystem.SYSTEM.canonicalize("../../../src/".toPath(true))

    @Test
    fun testStrEos() {
        val path = SRC_DIR.resolve("term_strz.bin").toString()
        val r: StrEos = StrEos.fromFile(path)

        assertEquals(actual = r.str(), expected = "foo|bar|baz@")
    }
}