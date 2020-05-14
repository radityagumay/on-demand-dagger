package com.example.daggerondemand.di

import com.example.bar.di.BarModule
import com.example.daggerondemand.FooApplication
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        AndroidSupportInjectionModule::class,
        FooModule::class,
        BarModule::class
    ]
)
interface FooComponent : AndroidInjector<FooApplication> {

    @Component.Factory
    interface Factory {
        fun create(@BindsInstance application: FooApplication): FooComponent
    }
}