package io.kaitai.struct.spec

import io.kaitai.struct.typing.*
import kotlin.test.assertContentEquals
import kotlin.test.assertEquals

inline fun assertEquals(actual: Byte?, expected: Int) {
    assertEquals(actual = actual, expected = expected.toByte())
}

inline fun assertEquals(actual: Short?, expected: Int) {
    assertEquals(actual = actual, expected = expected.toShort())
}

inline fun assertEquals(actual: Int?, expected: Long) {
    assertEquals(actual = actual, expected = expected.toInt())
}

inline fun assertEquals(actual: ByteArray, expected: ByteArray) {
    assertContentEquals(actual = actual, expected = expected)
}

inline fun assertEquals(actual: Float, expected: Double, absoluteTolerance: Double) {
    assertEquals(actual = actual, expected = expected.toFloat(), absoluteTolerance = absoluteTolerance)
}

inline fun assertEquals(actual: Float, expected: Float, absoluteTolerance: Double) {
    assertEquals(actual = actual, expected = expected, absoluteTolerance = absoluteTolerance.toFloat())
}

inline fun assertEquals(actual: IdentifiableEnum, expected: IntS8) {
    assertEquals(actual = actual.id, expected = expected)
}
