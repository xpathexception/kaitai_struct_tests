// Autogenerated from KST: please remove this line if doing any edits by hand!

package io.kaitai.struct.spec

import io.kaitai.struct.typing.*
import io.kaitai.struct.testformats.DefaultEndianExprInherited
import kotlin.test.*
import okio.FileSystem
import okio.Path.Companion.toPath
import okio.SYSTEM

class TestDefaultEndianExprInherited {
    val SRC_DIR = FileSystem.SYSTEM.canonicalize("../../../src/".toPath(true))

    @Test
    fun testDefaultEndianExprInherited() {
        val path = SRC_DIR.resolve("endian_expr.bin").toString()
        val r: DefaultEndianExprInherited = DefaultEndianExprInherited.fromFile(path)

        assertEquals(actual = r.docs()[0].indicator(), expected = byteArrayOf(73, 73))
        assertEquals(actual = r.docs()[0].main().insides().someInt(), expected = 66)
        assertEquals(actual = r.docs()[0].main().insides().more().someInt1(), expected = 16896)
        assertEquals(actual = r.docs()[0].main().insides().more().someInt2(), expected = 66)
        assertEquals(actual = r.docs()[0].main().insides().more().someInst(), expected = 66)
        assertEquals(actual = r.docs()[1].indicator(), expected = byteArrayOf(77, 77))
        assertEquals(actual = r.docs()[1].main().insides().someInt(), expected = 66)
        assertEquals(actual = r.docs()[1].main().insides().more().someInt1(), expected = 66)
        assertEquals(actual = r.docs()[1].main().insides().more().someInt2(), expected = 16896)
        assertEquals(actual = r.docs()[1].main().insides().more().someInst(), expected = 1107296256)
        assertEquals(actual = r.docs()[2].indicator(), expected = byteArrayOf(88, 88))
        assertEquals(actual = r.docs()[2].main().insides().someInt(), expected = 66)
        assertEquals(actual = r.docs()[2].main().insides().more().someInt1(), expected = 66)
        assertEquals(actual = r.docs()[2].main().insides().more().someInt2(), expected = 16896)
        assertEquals(actual = r.docs()[2].main().insides().more().someInst(), expected = 1107296256)
    }
}
