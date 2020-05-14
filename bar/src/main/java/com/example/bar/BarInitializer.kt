package com.example.bar

import android.app.Application
import android.util.Log
import com.example.core.AssignableInitializer
import javax.inject.Inject

class BarInitializer @Inject constructor() : AssignableInitializer {
    override val shouldAssign: Boolean
        get() = true

    override fun init(app: Application) {
        Log.d("init", "BarInitializer")
    }
}