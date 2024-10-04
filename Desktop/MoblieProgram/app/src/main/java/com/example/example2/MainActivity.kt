package com.example.example2

import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var idx = 0

        binding.button.setOnClickListener{
            if(idx == 0) {
                binding.imageView.visibility = View.INVISIBLE
                binding.imageView2.visibility = View.VISIBLE
                idx = 1
            }
            else if(idx == 1){
                binding.imageView.visibility = View.INVISIBLE
                binding.imageView.visibility = View.VISIBLE
                idx = 0
            }

        }
        }
    }
}