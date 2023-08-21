package com.demo.dependencyinjection.example2.data.datasource

import com.demo.dependencyinjection.example2.data.database.ExampleDatabase

class ExampleLocalDataSourceImpl(
    private val database: ExampleDatabase
) : ExampleLocalDataSource {

    override fun method() {
        database.method()
    }
}