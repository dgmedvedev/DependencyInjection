package com.demo.dependencyinjection.example2.data.di

import com.demo.dependencyinjection.example2.data.repository.ExampleRepositoryImpl
import com.demo.dependencyinjection.example2.domain.ExampleRepository
import dagger.Binds
import dagger.Module

@Module
interface DomainModule {
    @Binds
    fun bindRepository(impl: ExampleRepositoryImpl): ExampleRepository
}