package com.zeropercenthappy.utilslibrary.ext

fun String.toByteSafely(defaultValue: Byte = 0): Byte {
    return try {
        this.toByte()
    } catch (e: Exception) {
        defaultValue
    }
}

fun String.toShortSafely(defaultValue: Short = 0): Short {
    return try {
        this.toShort()
    } catch (e: Exception) {
        defaultValue
    }
}

fun String.toIntSafely(defaultValue: Int = 0): Int {
    return try {
        this.toInt()
    } catch (e: Exception) {
        defaultValue
    }
}

fun String.toLongSafely(defaultValue: Long = 0L): Long {
    return try {
        this.toLong()
    } catch (e: Exception) {
        defaultValue
    }
}

fun String.toFloatSafely(defaultValue: Float = 0f): Float {
    return try {
        this.toFloat()
    } catch (e: Exception) {
        defaultValue
    }
}

fun String.toDoubleSafely(defaultValue: Double = 0.0): Double {
    return try {
        this.toDouble()
    } catch (e: Exception) {
        defaultValue
    }
}