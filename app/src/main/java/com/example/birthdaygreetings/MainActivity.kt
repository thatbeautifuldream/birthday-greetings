package com.example.birthdaygreetings

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun createBirthdayCard(view: View) {
        Toast.makeText(this, "So, you clicked, ay? 🙄", Toast.LENGTH_LONG).show()
    }
}