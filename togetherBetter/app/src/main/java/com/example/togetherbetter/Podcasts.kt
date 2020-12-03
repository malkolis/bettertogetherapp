package com.example.togetherbetter

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.content.ContextCompat.startActivity

class Podcasts : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_podcasts)
    }
    home1.setOnClickListener(object: View.OnClickListener {
        override fun onClick(view: View): Unit {
            // Handler code here.
            val intent = Intent(this, MainActivity::class.java);
            startActivity(intent);
        }

    })
    button4.setOnClickListener(object: View.OnClickListener {
        override fun onClick(view: View): Unit {
            // Handler code here.
            val intent = Intent(this, ComingSoon::class.java);
            startActivity(intent);
        }
    })
    button5.setOnClickListener(object: View.OnClickListener {
        override fun onClick(view: View): Unit {
            // Handler code here.
            val intent = Intent(this, ComingSoon::class.java);
            startActivity(intent);
        }
    })
    button6.setOnClickListener(object: View.OnClickListener {
        override fun onClick(view: View): Unit {
            // Handler code here.
            val intent = Intent(this, ComingSoon::class.java);
            startActivity(intent);
        }
    })
    button7.setOnClickListener(object: View.OnClickListener {
        override fun onClick(view: View): Unit {
            // Handler code here.
            val intent = Intent(this, ComingSoon::class.java);
            startActivity(intent);
        }
    })
}