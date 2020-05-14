package com.example.bar

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import dagger.android.AndroidInjection
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasAndroidInjector
import javax.inject.Inject

class BarActivity : AppCompatActivity(), HasAndroidInjector {

    @field:Inject
    internal lateinit var androidInjector: DispatchingAndroidInjector<Any>

    @field:Inject
    internal lateinit var barMessage: BarMessage

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.bar_activity)
        findViewById<TextView>(R.id.foobar).text = barMessage.message
    }

    override fun androidInjector(): AndroidInjector<Any> = androidInjector
}