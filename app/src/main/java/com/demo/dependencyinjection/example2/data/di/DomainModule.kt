package com.demo.dependencyinjection.example2.data.di

import com.demo.dependencyinjection.example2.data.repository.ExampleRepositoryImpl
import com.demo.dependencyinjection.example2.domain.ExampleRepository
import dagger.Module
import dagger.Provides

@Module
class DomainModule {

    @Provides
    fun provideRepository(impl: ExampleRepositoryImpl): ExampleRepository {
        return impl
    }
}