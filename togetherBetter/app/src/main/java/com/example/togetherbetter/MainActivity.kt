package com.example.togetherbetter

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.content.ContextCompat.startActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    button2.setOnClickListener(object: View.OnClickListener {
        override fun onClick(view: View): Unit {
            // Handler code here.
            val intent = Intent(this, Adventure::class.java);
            startActivity(intent);
        }
    })
    button1.setOnClickListener(object: View.OnClickListener {
        override fun onClick(view: View): Unit {
            // Handler code here.
            val intent = Intent(this, Podcasts::class.java);
            startActivity(intent);
        }
        })
    button3.setOnClickListener(object: View.OnClickListener {
        override fun onClick(view: View): Unit {
            // Handler code here.
            val intent = Intent(this, ComingSoon::class.java);
            startActivity(intent);
        }
    })
    }


    private fun goAdventure(intent: Any) {

    }
    public fun goPodcasts(intent: Any){

    }
}

class view {

}
