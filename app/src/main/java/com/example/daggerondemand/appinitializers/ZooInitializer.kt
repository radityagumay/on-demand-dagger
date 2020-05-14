package com.example.daggerondemand.appinitializers

import android.app.Application
import android.util.Log
import com.example.core.AssignableInitializer
import javax.inject.Inject

class ZooInitializer @Inject constructor() : AssignableInitializer {
    override val shouldAssign: Boolean
        get() = false

    override fun init(app: Application) {
        Log.d("init", "ZooInitializer should init $shouldAssign")
    }
}