package com.demo.dependencyinjection.example2.data.di

import com.demo.dependencyinjection.example2.data.datasource.ExampleLocalDataSource
import com.demo.dependencyinjection.example2.data.datasource.ExampleLocalDataSourceImpl
import com.demo.dependencyinjection.example2.data.datasource.ExampleRemoteDataSource
import com.demo.dependencyinjection.example2.data.datasource.ExampleRemoteDataSourceImpl
import dagger.Binds
import dagger.Module

@Module
interface DataModule {
    @ApplicationScope
    @Binds
    fun bindLocalDataSource(impl: ExampleLocalDataSourceImpl): ExampleLocalDataSource

    @ApplicationScope
    @Binds
    fun bindRemoveDataSource(impl: ExampleRemoteDataSourceImpl): ExampleRemoteDataSource
}