package com.example.daggerondemand.di

import com.example.bar.BarInitializer
import com.example.core.AssignableInitializer
import com.example.daggerondemand.appinitializers.FooInitializer
import com.example.daggerondemand.appinitializers.ZooInitializer
import com.example.daggerondemand.appinitializers.ZooKeeperInitializer
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoSet

@Module
abstract class FooModule {
    @Binds
    @IntoSet
    abstract fun bindsBar(binds: BarInitializer): AssignableInitializer

    @Binds
    @IntoSet
    abstract fun bindsFoo(binds: FooInitializer): AssignableInitializer

    @Binds
    @IntoSet
    abstract fun bindsZoo(binds: ZooInitializer): AssignableInitializer

    @Binds
    @IntoSet
    abstract fun bindsZooKeeper(binds: ZooKeeperInitializer): AssignableInitializer
}