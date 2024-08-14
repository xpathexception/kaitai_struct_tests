// Autogenerated from KST: please remove this line if doing any edits by hand!

package io.kaitai.struct.spec

import io.kaitai.struct.typing.*
import io.kaitai.struct.testformats.IfInstances
import kotlin.test.*
import okio.FileSystem
import okio.Path.Companion.toPath
import okio.SYSTEM

class TestIfInstances {
    val SRC_DIR = FileSystem.SYSTEM.canonicalize("../../../src/".toPath(true))

    @Test
    fun testIfInstances() {
        val path = SRC_DIR.resolve("fixed_struct.bin").toString()
        val r: IfInstances = IfInstances.fromFile(path)

        assertNull(r.neverHappens())
    }
}
