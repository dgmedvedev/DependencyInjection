package com.demo.dependencyinjection.example2.data.di

import androidx.lifecycle.ViewModel
import com.demo.dependencyinjection.example2.presentation.ExampleViewModel
import com.demo.dependencyinjection.example2.presentation.ExampleViewModel2
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap
import dagger.multibindings.StringKey

@Module
interface ViewModelModule {

    @IntoMap
    @ViewModelKey(ExampleViewModel::class)
    @Binds
    fun bindExampleViewModel(viewModel: ExampleViewModel): ViewModel

    @IntoMap
    @ViewModelKey(ExampleViewModel2::class)
    @Binds
    fun bindExampleViewModel2(viewModel: ExampleViewModel2): ViewModel
}