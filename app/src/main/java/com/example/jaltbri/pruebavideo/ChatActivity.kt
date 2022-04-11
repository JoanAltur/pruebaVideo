package com.example.jaltbri.pruebavideo

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.jaltbri.pruebavideo.databinding.ActivityChatBinding
import androidx.recyclerview.widget.RecyclerView

class ChatActivity : AppCompatActivity() {
    private lateinit var binding : ActivityChatBinding
    private lateinit var recyclerView: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityChatBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        recyclerView = binding.conversationRecycler
        recyclerView.layoutManager=LinearLayoutManager(this)
        val data = ArrayList<MessagesViewModel>()

        for (i in 1..20){
            if(i % 2 == 0)
                data.add(MessagesViewModel("mensaje num: $i",java.sql.Timestamp(System.currentTimeMillis()), 1))
            else
                data.add(MessagesViewModel("mensaje num: $i",java.sql.Timestamp(System.currentTimeMillis()),2))
        }
        val adapter = CustomAdapter(data)

        recyclerView.adapter = adapter
    }
}