package com.example.task

import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.task.databinding.ActivityConfirmpinBinding

class ConfirmPin : AppCompatActivity() {
    private lateinit var binding:ActivityConfirmpinBinding
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        val binding=ActivityConfirmpinBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //customized to action bar
        supportActionBar?.setBackgroundDrawable(ColorDrawable(Color.WHITE))
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title= "Create New Pin"
        supportActionBar?.elevation=0F


        binding.btnContinue.setOnClickListener {
            val intent=Intent(this,FingerPrint::class.java)
            startActivity(intent)
        }

    }
}