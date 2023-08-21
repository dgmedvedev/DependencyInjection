package com.demo.dependencyinjection

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.demo.dependencyinjection.example1.Activity
import com.demo.dependencyinjection.example2.presentation.ExampleViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var viewModel: ExampleViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // example1
        val activity = Activity()
        activity.computer.toString()

        // example2
        viewModel.method()
    }
}