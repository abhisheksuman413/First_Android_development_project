package com.fps69.firstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.fps69.firstapp.databinding.ActivityWebviewBinding

class Webview : AppCompatActivity() {
    private lateinit var binding: ActivityWebviewBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityWebviewBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()


        binding.Webview.loadUrl("https://abhisheksuman413.github.io/Digital-Clock/")

    }
}