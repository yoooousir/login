package com.example.profileapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.logintoprofile.R

class Login : AppCompatActivity() {
    private lateinit var sign: TextView

    override fun onPostCreate(savedInstanceState: Bundle?) {
        super.onPostCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)

        // 회원가입 버튼
        sign = findViewById(R.id.signup)

        // 회원가입 버튼 클릭 시, 회원가입 페이지로 이동
        sign.setOnClickListener {
            val intent = Intent(this, Signup::class.java)
            startActivity(intent)
        }
    }
}