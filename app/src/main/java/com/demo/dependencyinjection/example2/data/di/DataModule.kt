package com.demo.dependencyinjection.example2.data.di

import com.demo.dependencyinjection.example2.data.datasource.ExampleLocalDataSource
import com.demo.dependencyinjection.example2.data.datasource.ExampleLocalDataSourceImpl
import com.demo.dependencyinjection.example2.data.datasource.ExampleRemoteDataSource
import com.demo.dependencyinjection.example2.data.datasource.ExampleRemoteDataSourceImpl
import dagger.Module
import dagger.Provides

@Module
class DataModule {

    @Provides
    fun provideLocalDataSource(impl: ExampleLocalDataSourceImpl): ExampleLocalDataSource {
        return impl
    }

    @Provides
    fun provideRemoveDataSource(impl: ExampleRemoteDataSourceImpl): ExampleRemoteDataSource {
        return impl
    }
}