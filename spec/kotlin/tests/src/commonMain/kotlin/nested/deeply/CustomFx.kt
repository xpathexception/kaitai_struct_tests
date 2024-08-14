package nested.deeply

import io.kaitai.struct.CustomDecoder

class CustomFx(x: Int) : CustomDecoder {
    override fun decode(src: ByteArray): ByteArray {
        val dst = ByteArray(src.size + 2)
        dst[0] = '_'.code.toByte()
        dst[src.size + 1] = '_'.code.toByte()
        src.copyInto(startIndex = 0, destination = dst, destinationOffset = 1, endIndex = src.size)
        return dst
    }
}
