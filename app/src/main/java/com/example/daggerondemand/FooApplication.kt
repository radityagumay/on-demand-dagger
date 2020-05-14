package com.example.daggerondemand

import android.app.Application
import com.example.daggerondemand.appinitializers.AppInitializers
import com.example.daggerondemand.di.DaggerFooComponent
import javax.inject.Inject

class FooApplication : Application() {

    @field:Inject
    internal lateinit var appInitializers: AppInitializers

    override fun onCreate() {
        super.onCreate()
        DaggerFooComponent.factory().create(this).inject(this)
        appInitializers.init(this)
    }
}