package com.vinit.toaster_library

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.vinit.toaster.Toaster

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Toaster().toast(this, "Test message")
    }
}