package com.example.jaltbri.pruebavideo

import android.content.Intent
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.graphics.Picture
import android.media.MediaMetadataRetriever
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.example.jaltbri.pruebavideo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {


    private lateinit var binding : ActivityMainBinding
    lateinit var video: Button
    lateinit var chat: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        video = binding.button1
        chat = binding.button3
        video.setOnClickListener(View.OnClickListener {

            startActivity(Intent(this, VideoActivity::class.java))
        })
        chat.setOnClickListener(View.OnClickListener {

            startActivity(Intent(this, ChatActivity::class.java))
        })
        val d: MutableList<Int> ?= mutableListOf<Int>(1,2,3)

    }

}