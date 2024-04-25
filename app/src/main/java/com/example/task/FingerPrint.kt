package com.example.task

import android.app.Dialog
import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.Window
import androidx.appcompat.app.AppCompatActivity
import com.example.task.databinding.ActivityFingerPrintBinding

class FingerPrint : AppCompatActivity() {
    private lateinit var binding:ActivityFingerPrintBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding=ActivityFingerPrintBinding.inflate(layoutInflater)

        setContentView(binding.root)

        //customized to action bar arrow and info
        supportActionBar?.setBackgroundDrawable(ColorDrawable(Color.WHITE))
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title= "Set Your Fingerprint"
        supportActionBar?.elevation=0F

        //click and show alert box and go to home screen
        binding.btnContinue.setOnClickListener {


            //move to home screen after a few time
            Handler(Looper.getMainLooper()).postDelayed(
                {
                    //call function of custom dialog box
                    showAlert()
                },3000
            )
        }
    }


    //function for build custom dialog box
    private fun showAlert() {
        val dialog= Dialog(this)

        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
        dialog.setCancelable(false)
        dialog.setContentView(R.layout.alert_new_password)
        dialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        dialog.show()
    }
}