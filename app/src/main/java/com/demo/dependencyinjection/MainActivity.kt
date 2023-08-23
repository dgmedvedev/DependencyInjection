package com.demo.dependencyinjection

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.demo.dependencyinjection.example2.data.di.DaggerApplicationComponent
import com.demo.dependencyinjection.example2.presentation.ExampleViewModel
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var viewModel: ExampleViewModel

    private val component = DaggerApplicationComponent.create()

    override fun onCreate(savedInstanceState: Bundle?) {
        component.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // example1
//        val activity = Activity()
//        activity.computer.toString()

        // example2
        viewModel.method()
    }
}