package com.demo.dependencyinjection.example1

class Component {
    fun inject(activity: Activity) {
        activity.keyboard = Keyboard()
    }
}