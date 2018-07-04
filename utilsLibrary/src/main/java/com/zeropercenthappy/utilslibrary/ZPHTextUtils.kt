package com.zeropercenthappy.utilslibrary

import android.text.TextUtils

object ZPHTextUtils {
    fun notEmpty(vararg values: String): Boolean {
        for (value in values) {
            if (TextUtils.isEmpty(value)) {
                return false
            }
        }
        return true
    }
}