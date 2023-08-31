package com.demo.dependencyinjection.example2.data.di

import android.content.Context
import com.demo.dependencyinjection.MainActivity
import dagger.BindsInstance
import dagger.Component

@Component(modules = [DataModule::class, DomainModule::class])
interface ApplicationComponent {
    fun inject(activity: MainActivity)

    @Component.Builder
    interface ApplicationComponentBuilder {

        @BindsInstance
        fun context(context: Context): ApplicationComponentBuilder

        @BindsInstance
        fun timeMillis(currentTime: Long): ApplicationComponentBuilder

        fun build(): ApplicationComponent
    }
}