package com.example.ioasyscamp.common

import androidx.fragment.app.Fragment

fun Fragment.changeStatusBarColor(color: Int) {
    activity?.changeStatusBarColor(color)
}