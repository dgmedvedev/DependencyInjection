package com.demo.dependencyinjection.example2.data.datasource

import com.demo.dependencyinjection.example2.data.network.ExampleApiService

class ExampleRemoteDataSourceImpl(
    private val apiService: ExampleApiService
) : ExampleRemoteDataSource {

    override fun method() {
        apiService.method()
    }
}