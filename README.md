# on-demand-dagger
on demand dagger initialization


#### Setup

```kotlin
class AppInitializers @Inject constructor(
    private val initializers: Set<@JvmSuppressWildcards AssignableInitializer>
) {
    fun init(application: Application) {
        initializers.forEach {
            //if (it.shouldAssign) {
                  it.init(application)
             //}
        }
    }
}
```

#### Log

D/init: FooInitializer should init true
D/init: BarInitializer should init true
D/init: ZooInitializer should init false
D/init: ZooKeeperInitializer should init false
