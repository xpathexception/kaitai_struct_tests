// Autogenerated from KST: please remove this line if doing any edits by hand!

package io.kaitai.struct.spec

import io.kaitai.struct.typing.*
import io.kaitai.struct.testformats.TsPacketHeader
import kotlin.test.*
import okio.FileSystem
import okio.Path.Companion.toPath
import okio.SYSTEM

class TestTsPacketHeader {
    val SRC_DIR = FileSystem.SYSTEM.canonicalize("../../../src/".toPath(true))

    @Test
    fun testTsPacketHeader() {
        val path = SRC_DIR.resolve("ts_packet.bin").toString()
        val r: TsPacketHeader = TsPacketHeader.fromFile(path)

        assertEquals(actual = r.syncByte(), expected = 71)
        assertEquals(actual = r.transportErrorIndicator(), expected = false)
        assertEquals(actual = r.payloadUnitStartIndicator(), expected = false)
        assertEquals(actual = r.transportPriority(), expected = true)
        assertEquals(actual = r.pid(), expected = 33)
        assertEquals(actual = r.transportScramblingControl(), expected = 0)
        assertEquals(actual = r.adaptationFieldControl(), expected = TsPacketHeader.AdaptationFieldControlEnum.PAYLOAD_ONLY)
    }
}