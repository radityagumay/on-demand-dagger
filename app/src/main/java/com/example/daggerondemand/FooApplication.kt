package com.example.daggerondemand

import com.example.daggerondemand.appinitializers.AppInitializers
import com.example.daggerondemand.di.DaggerFooComponent
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication
import javax.inject.Inject

class FooApplication : DaggerApplication() {

    @field:Inject
    internal lateinit var appInitializers: AppInitializers

    override fun onCreate() {
        super.onCreate()
        appInitializers.init(this)
    }

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        return DaggerFooComponent.factory().create(this)
    }
}