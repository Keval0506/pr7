package com.example.pr7

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.WindowCompat

class YoutubeActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        WindowCompat.setDecorFitsSystemWindows(window,false)
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initYoutubePlayer()
        binding.btnSwitch.setOnClickListener {
            Intent(this,MainActivity::class.java).also { startActivities(it) }
        }
    }
    private webSettings:: WebSetting = binding.youtubeWebView.settings
    webSettings.javaScriptEnabled = true
    webSettings.loadWithOverviewMode = true
    webSettings.useWidViewPort = true
    binding.YoutubeWebView.loadurl(url:"https://www.youtube.com/embed/$youtubrId")
}
