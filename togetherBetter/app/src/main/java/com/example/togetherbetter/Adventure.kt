package com.example.togetherbetter

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.content.ContextCompat

class Adventure : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_adventure)
    }
    home3.setOnClickListener(object: View.OnClickListener {
        override fun onClick(view: View): Unit {
            // Handler code here.
            val intent = Intent(this, MainActivity::class.java);
            ContextCompat.startActivity(intent);
        }
    })
    button8.setOnClickListener(object: View.OnClickListener {
        override fun onClick(view: View): Unit {
            // Handler code here.
            val intent = Intent(this, ComingSoon::class.java);
            ContextCompat.startActivity(intent);
        }
    })
    button9.setOnClickListener(object: View.OnClickListener {
        override fun onClick(view: View): Unit {
            // Handler code here.
            val intent = Intent(this, ComingSoon::class.java);
            ContextCompat.startActivity(intent);
        }
    })
    button10.setOnClickListener(object: View.OnClickListener {
        override fun onClick(view: View): Unit {
            // Handler code here.
            val intent = Intent(this, ComingSoon::class.java);
            ContextCompat.startActivity(intent);
        }
    })
    button11.setOnClickListener(object: View.OnClickListener {
        override fun onClick(view: View): Unit {
            // Handler code here.
            val intent = Intent(this, ComingSoon::class.java);
            ContextCompat.startActivity(intent);
        }
    })
}