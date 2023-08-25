package com.zeinabmallaki.pareparvaz

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.SeekBar
import com.zeinabmallaki.pareparvaz.databinding.ActivityAshuraBinding

class AshuraActivity: AppCompatActivity() {
    private lateinit var binding: ActivityAshuraBinding
    private var mediaPlayer: MediaPlayer? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAshuraBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        title = "زیارت عاشورا"



        binding.playPauseToggle.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                playMusic()
            } else {
                pauseMusic()
            }
        }

        binding.seekBar.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekbar: SeekBar?, progress: Int, fromUser: Boolean) {
                if (fromUser) {
                    mediaPlayer?.seekTo(progress)
                }
            }

            override fun onStartTrackingTouch(p0: SeekBar?) {}
            override fun onStopTrackingTouch(p0: SeekBar?) {}
        })
    }

    private fun playMusic() {
        if (mediaPlayer == null) {
            mediaPlayer = MediaPlayer.create(this, R.raw.ashura)
            mediaPlayer?.setOnCompletionListener { stopMusic() }
            initSeekBar()
        }

        mediaPlayer?.start()
    }

    private fun pauseMusic() {
        mediaPlayer?.pause()
    }

    private fun stopMusic() {
        mediaPlayer?.stop()
        mediaPlayer?.release()
        mediaPlayer = null
        binding.playPauseToggle.isChecked = false
    }

    private fun initSeekBar() {
        binding.seekBar.max = mediaPlayer?.duration ?: 100

        val handler = Handler(mainLooper)

        handler.postDelayed(object : Runnable {
            override fun run() {
                try {
                    binding.seekBar.progress = mediaPlayer!!.currentPosition
                    handler.postDelayed(this, 1000)
                } catch (e: Exception) {
                    binding.seekBar.progress = 0
                }
            }
        }, 0)
    }

    override fun onStop() {
        super.onStop()
        stopMusic()
    }

    override fun onSupportNavigateUp(): Boolean {
        finish()
        return true
    }
}







