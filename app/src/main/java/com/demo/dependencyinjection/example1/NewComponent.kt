package com.demo.dependencyinjection.example1

import dagger.Component

@Component
interface NewComponent {

    fun inject(activity: Activity)
}