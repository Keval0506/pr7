package com.example.pr7

import android.media.MediaController2
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.WindowCompat

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        WindowCompat.setDecorFitsSystemWindows(window,false)
        super.onCreate(savedInstanceState)

        binding =ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initVideoPlayer()
        binding.btnSwitch.setOnClickListener {
            Intent(this,YoutubeActivity::class.java).also { startActivities(it) }
        }
    }
    private fun initVideoPlayer()
    {
        val mediaController = MediaController(this)
        val uri: Uri.parse("android.resource:/"+ packageName +"/" + R.rae.the +)
    }
}