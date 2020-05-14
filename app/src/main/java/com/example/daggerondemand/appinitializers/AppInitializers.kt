package com.example.daggerondemand.appinitializers

import android.app.Application
import com.example.core.AssignableInitializer
import javax.inject.Inject

class AppInitializers @Inject constructor(
    private val initializers: Set<@JvmSuppressWildcards AssignableInitializer>
) {
    fun init(application: Application) {
        initializers.forEach {
            if (it.shouldAssign) {
                it.init(application)
            }
        }
    }
}
