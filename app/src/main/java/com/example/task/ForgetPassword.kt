package com.example.task

import android.os.Bundle
import android.view.MenuItem
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.task.databinding.ActivityForgetPasswordBinding

class ForgetPassword : AppCompatActivity() {
    private lateinit var binding:ActivityForgetPasswordBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityForgetPasswordBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.title= "Forget Password"
        supportActionBar?.setDisplayHomeAsUpEnabled(true)


        fun onOptionsItemSelected(item: MenuItem): Boolean {
            // handle arrow click here
            if (item.itemId == android.R.id.home) {
                finish() // close this activity and return to preview activity (if there is any)
            }

            return super.onOptionsItemSelected(item)
        }

    }
}