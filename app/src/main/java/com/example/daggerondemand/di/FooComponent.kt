package com.example.daggerondemand.di

import com.example.daggerondemand.FooApplication
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        FooModule::class
    ]
)
interface FooComponent {

    fun inject(app: FooApplication)

    @Component.Factory
    interface Factory {
        fun create(@BindsInstance application: FooApplication): FooComponent
    }
}