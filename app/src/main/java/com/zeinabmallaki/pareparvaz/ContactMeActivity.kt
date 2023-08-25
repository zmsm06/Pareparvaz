package com.zeinabmallaki.pareparvaz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.zeinabmallaki.pareparvaz.databinding.ActivityContactMeBinding

class ContactMeActivity : AppCompatActivity() {

    lateinit var binding: ActivityContactMeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityContactMeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }
    override fun onSupportNavigateUp(): Boolean {
        finish()
        return true
    }
}