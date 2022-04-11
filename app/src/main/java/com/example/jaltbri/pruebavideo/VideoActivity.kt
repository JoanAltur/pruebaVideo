package com.example.jaltbri.pruebavideo

import android.Manifest
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import androidx.core.app.ActivityCompat
import com.amazonaws.services.chime.sdk.meetings.session.*
import com.amazonaws.services.chime.sdk.meetings.utils.logger.ConsoleLogger
import com.example.jaltbri.pruebavideo.databinding.ActivityApartadoVideoBinding
import com.google.gson.Gson
import com.amazonaws.services.chime.sdk.*


class VideoActivity : AppCompatActivity() {
    //variables de la vista
    lateinit var binding : ActivityApartadoVideoBinding
    lateinit var button: Button

    //variables de chimei
    private val PERMISSION_REQUEST_CODE = 1
    private val PERMISSIONS = arrayOf(
        Manifest.permission.MODIFY_AUDIO_SETTINGS,
        Manifest.permission.RECORD_AUDIO,
        Manifest.permission.CAMERA)

    val attendee = ""
    val meetingUrl = ""//TODO aqui va la url del post hecho a serverless demo de aws
    val meetingId = ""

    val attendeeName = java.net.URLEncoder.encode(attendee, "utf-8");
    val region = java.net.URLEncoder.encode("us-east-1", "utf-8");
    val title = java.net.URLEncoder.encode(meetingId, "utf-8");
    val url = "${meetingUrl}join?title=$title&name=$attendeeName&region=$region";

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityApartadoVideoBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        ActivityCompat.requestPermissions(this, PERMISSIONS, PERMISSION_REQUEST_CODE)
        button = binding.button2
        button.setOnClickListener(View.OnClickListener {

        })
    }
    // Data stucture that maps to the HTTP response.
    data class JoinMeetingResponse(
        @SerializedName("JoinInfo") val joinInfo: MeetingInfo)

    data class MeetingInfo(
        @SerializedName("Meeting") val meetingResponse: MeetingResponse,
        @SerializedName("Attendee") val attendeeResponse: AttendeeResponse)

    data class MeetingResponse(
        @SerializedName("Meeting") val meeting: Meeting)

    data class AttendeeResponse(
        @SerializedName("Attendee") val attendee: Attendee)

    // Deserialize the response to object.
//    val joinMeetingResponse = Gson().fromJson(
//        response.toString(),
//        JoinMeetingResponse::class.java
//    )
//
//    // Construct configuration using the meeting response.
//    val configuration = MeetingSessionConfiguration(
//        CreateMeetingResponse(joinMeetingResponse.joinInfo.meetingResponse.meeting),
//        CreateAttendeeResponse(joinMeetingResponse.joinInfo.attendeeResponse.attendee)
//    )
//
//    // Create a default meeting seesion.
//    val meetingSession = DefaultMeetingSession(configuration, ConsoleLogger(), applicationContext)

}