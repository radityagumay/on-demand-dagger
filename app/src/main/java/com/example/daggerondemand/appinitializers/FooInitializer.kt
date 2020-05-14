package com.example.daggerondemand.appinitializers

import android.app.Application
import android.util.Log
import com.example.core.AssignableInitializer
import javax.inject.Inject

class FooInitializer @Inject constructor() : AssignableInitializer {
    override val shouldAssign: Boolean
        get() = true

    override fun init(app: Application) {
        Log.d("init", "FooInitializer should init $shouldAssign")
    }
}