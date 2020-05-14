package com.example.core

import android.app.Application

interface AppInitializer {
    fun init(app: Application)
}

interface AssignableInitializer: AppInitializer {
    val shouldAssign: Boolean
}