package com.example.servicesapp


import android.app.Service
import android.content.Intent
import android.media.MediaPlayer
import android.os.IBinder
import android.provider.MediaStore.Audio.Media
import android.provider.Settings

class MyService:Service() {

    lateinit var mediaPlayer: MediaPlayer

    override fun onBind(p0: Intent?): IBinder? {
        return null
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        mediaPlayer = MediaPlayer.create(
            this,
            Settings.System.DEFAULT_RINGTONE_URI
        )

        mediaPlayer.start()

        return START_STICKY
    }

    override fun onDestroy() {
        super.onDestroy()

        mediaPlayer.stop()
    }
}