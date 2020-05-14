package com.example.bar.di

import com.example.bar.BarActivity
import com.example.bar.BarMessage
import com.example.bar.BarMessageImpl
import dagger.Binds
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class BarModule {
    @Binds
    abstract fun bindsBarMessage(message: BarMessageImpl): BarMessage

    @get:ContributesAndroidInjector
    abstract val splashActivity: BarActivity
}