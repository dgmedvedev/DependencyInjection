package com.demo.dependencyinjection.example2.data.di

import com.demo.dependencyinjection.MainActivity
import dagger.Component

@Component(modules = [DataModule::class, DomainModule::class, ContextModule::class])
interface ApplicationComponent {
    fun inject(activity: MainActivity)
}