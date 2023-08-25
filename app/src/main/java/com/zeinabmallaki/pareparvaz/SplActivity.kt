package com.zeinabmallaki.pareparvaz

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.animation.AnimationUtils
import com.zeinabmallaki.pareparvaz.databinding.ActivitySplBinding

class SplActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySplBinding
    private lateinit var media: MediaPlayer


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.txtSpl1.startAnimation(anim(R.anim.scal))
        binding.txtSpl3.startAnimation(anim(R.anim.move_bottom))
        binding.imageView2.startAnimation(anim(R.anim.zoom_in))

        media= MediaPlayer.create(this,R.raw.salavat )
        media.start()



        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this@SplActivity, MainActivity::class.java)
            startActivity(intent)
            finish()
        }, 10000)





    }
    private fun anim(animation: Int) = AnimationUtils.loadAnimation(this@SplActivity, animation)

    override fun onStop() {
        if (media.isPlaying)
            media.stop()
        super.onStop()
    }
}