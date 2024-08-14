// Autogenerated from KST: please remove this line if doing any edits by hand!

package io.kaitai.struct.spec

import io.kaitai.struct.typing.*
import io.kaitai.struct.testformats.ValidFailRangeStr
import kotlin.test.*
import io.kaitai.struct.KaitaiStream
import okio.FileSystem
import okio.Path.Companion.toPath
import okio.SYSTEM

class TestValidFailRangeStr {
    val SRC_DIR = FileSystem.SYSTEM.canonicalize("../../../src/".toPath(true))

    @Test
    fun testValidFailRangeStr() {
        assertFailsWith(KaitaiStream.ValidationGreaterThanError::class) {
            val path = SRC_DIR.resolve("fixed_struct.bin").toString()
            ValidFailRangeStr.fromFile(path)
        }
    }
}
