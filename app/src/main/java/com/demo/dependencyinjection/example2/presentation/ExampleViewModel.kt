package com.demo.dependencyinjection.example2.presentation

import com.demo.dependencyinjection.example2.domain.ExampleUseCase

class ExampleViewModel(
    private val useCase: ExampleUseCase
) {

    fun method() {
        useCase()
    }
}