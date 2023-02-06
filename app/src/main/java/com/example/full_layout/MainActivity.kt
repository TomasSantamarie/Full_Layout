package com.example.full_layout

import android.content.Intent
import android.graphics.Color
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.full_layout.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        var llamada="No se puede llamar, inserte número de teléfono"
        var url = "https://www.youtube.com/"
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.imageButton3.setOnClickListener{
            val nuevaVista2 = Intent(this, Navigate::class.java)
            startActivity(nuevaVista2)
        }

        binding.imageButton4.setOnClickListener{
            Toast.makeText(this, llamada, Toast.LENGTH_SHORT).show()
        }

        binding.imageButton5.setOnClickListener{
            val i = Intent(Intent.ACTION_VIEW, Uri.parse(url))
            startActivity(i)
        }

        binding.imageButton6.setOnClickListener{
            binding.imageButton6.setBackgroundColor(Color.BLACK)
        }

        binding.imageButton7.setOnClickListener{
            val b = Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/gonjim967"))
            startActivity(b)
        }

        binding.imageButton8.setOnClickListener{
            binding.imageButton8.setImageResource(R.drawable.youtube)
        }
    }
}