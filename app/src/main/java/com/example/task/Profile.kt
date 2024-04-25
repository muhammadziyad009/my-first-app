package com.example.task
import android.content.Intent
import android.os.Bundle
import android.text.TextUtils
import android.widget.Toast
import android.widget.Toast.LENGTH_SHORT
import androidx.appcompat.app.AppCompatActivity
import com.example.task.databinding.ActivityProfileBinding

class Profile : AppCompatActivity() {
    private lateinit var binding:ActivityProfileBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding=ActivityProfileBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //action bar ko hide krny k liye
        supportActionBar?.hide()
        //action bar ko hide krny k liye





        //validation yaha se start ki hai
        binding.btnContinue.setOnClickListener {
            val fullname=binding.etFullName.text
            val nickname=binding.etNickName.text
            val dateofbirth=binding.etDateOfBirth.text
            val email=binding.etEmail.text
            val phonenumber=binding.etPhone.text
            val gender=binding.etGeneder.text

            if (TextUtils.isEmpty(fullname))
            {
                binding.etFullName.error="Enter your name"
                binding.etFullName.requestFocus()
            }
            else if (TextUtils.isEmpty(nickname))
            {
                binding.etNickName.error="Enter your nickname"
                binding.etNickName.requestFocus()
            }
            else if (TextUtils.isEmpty(dateofbirth))
            {
                binding.etDateOfBirth.error="Enter your Date of Birth"
                binding.etDateOfBirth.requestFocus()
            }
            else if (TextUtils.isEmpty(email))
            {
                binding.etEmail.error="Enter your Email"
                binding.etEmail.requestFocus()
            }
            else if (TextUtils.isEmpty(phonenumber))
            {
                binding.etPhone.error="Enter your phone Number"
                binding.etPhone.requestFocus()
            }
            else if (TextUtils.isEmpty(gender))
            {
                binding.etGeneder.error="Please select a gender"
                binding.etGeneder.requestFocus()
            }
            else
            {
                val i= Intent(this,ConfirmPin::class.java)
                startActivity(i)
                Toast.makeText(this,"Congratulations",LENGTH_SHORT).show()
            }
        }



    }
}