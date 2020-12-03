package com.example.togetherbetter

import android.content.Intent
import android.os.Build.ID
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.core.content.ContextCompat.startActivity

class ComingSoon : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_coming_soon)
    }

    Home2.setOnClickListener(object: View.OnClickListener {
        override fun onClick(view: View): Unit {
            // Handler code here.
            val intent = Intent(this, MainActivity::class.java);
            startActivity(intent);
        }
    })
}