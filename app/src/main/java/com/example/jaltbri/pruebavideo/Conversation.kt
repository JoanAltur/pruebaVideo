package com.example.jaltbri.pruebavideo

import java.sql.Timestamp
import java.time.Instant
import java.time.format.DateTimeFormatter

class Conversation {
//    val messages : ArrayList<Map<Int, String>>? = ArrayList()
    data class Message(val id: Int, val text: String="",val timestamp:Timestamp){

    }
    val messages : ArrayList<Message>? = ArrayList()
    fun nuevoMensaje(message: Message){
        messages?.add(message)
    }


}