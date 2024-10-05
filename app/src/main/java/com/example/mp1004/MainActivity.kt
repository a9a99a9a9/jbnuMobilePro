package com.example.mp1004

import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.mp1004.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var idx = 0

        binding.button.setOnClickListener {
            if (idx == 0) {
                binding.imageView.visibility = View.VISIBLE
                binding.imageView2.visibility = View.INVISIBLE
                binding.imageView3.visibility = View.INVISIBLE
                idx = 1
            } else if (idx == 1) {
                binding.imageView.visibility = View.INVISIBLE
                binding.imageView2.visibility = View.VISIBLE
                binding.imageView3.visibility = View.INVISIBLE
                idx = 2
            }
            else if (idx == 2) {
                binding.imageView.visibility = View.INVISIBLE
                binding.imageView2.visibility = View.INVISIBLE
                binding.imageView3.visibility = View.INVISIBLE
                idx = 0
            }
        }
    }
}