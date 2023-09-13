package com.demo.dependencyinjection.example2.data.network

import android.content.Context
import android.util.Log
import com.demo.dependencyinjection.R
import javax.inject.Inject

class ExampleApiService @Inject constructor(
    private val context: Context,
    private val timeMillis: Long
) {

    fun method() {
        Log.d(
            LOG_TAG,
            "ExampleApiService ${context.getString(R.string.app_name)}, time = $timeMillis $this"
        )
    }

    companion object {

        private const val LOG_TAG = "EXAMPLE_TEST"
    }
}