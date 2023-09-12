package com.demo.dependencyinjection.example2

import android.app.Application
import com.demo.dependencyinjection.example2.data.di.DaggerApplicationComponent

class ExampleApp : Application() {
    val component by lazy {
        DaggerApplicationComponent.factory()
            .create(this, System.currentTimeMillis())
    }
}