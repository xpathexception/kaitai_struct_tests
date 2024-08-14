package io.kaitai.struct.testformats

import io.kaitai.struct.CustomDecoder

class MyCustomFx(
    key: Int,
    flag: Boolean,
    someBytes: ByteArray?,
) : CustomDecoder {
    private val key = if (flag) key else -key

    override fun decode(src: ByteArray): ByteArray {
        val dst = ByteArray(src.size)
        for (i in src.indices) dst[i] = (src[i] + key).toByte()
        return dst
    }
}
