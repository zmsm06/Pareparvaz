package com.zeinabmallaki.pareparvaz

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import com.zeinabmallaki.pareparvaz.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {


    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        title = "پرپرواز"


        binding.btnAshura.setOnClickListener {
            val intent = Intent(this, AshuraActivity::class.java)
            startActivity(intent)
        }

        binding.btnAleyasin.setOnClickListener {
            val intent2 = Intent(this, AleYasinActivity::class.java)
            startActivity(intent2)
        }

        binding.btnFaraj.setOnClickListener {
            val intent3 = Intent(this, FarajActivity::class.java)
            startActivity(intent3)
        }


    }



    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
         menuInflater.inflate(R.menu.main_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.about_menu-> {
                startActivity(Intent(this, AboutMeActivity::class.java ))
             true }

            R.id.contact_menu->{
                startActivity(Intent(this,ContactMeActivity::class.java ))
             true
            } else -> false
        }
    }



    }







