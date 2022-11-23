package com.example.login

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.annotation.RequiresApi
import org.w3c.dom.Text


class MainActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.M)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val email = findViewById<EditText>(R.id.email)
        val password = findViewById<EditText>(R.id.pass)
        val login = findViewById<Button>(R.id.login)
        val loginText = findViewById<TextView>(R.id.loginText)

        findViewById<Button>(R.id.login).setOnClickListener {

            var mail = email.text.toString()
            var pas = password.text.toString()
            if (mail == ""){
                Toast.makeText(this,"Enter your Email",Toast.LENGTH_LONG).show()
            }
            else if (pas == ""){
                Toast.makeText(this, "Enter your password", Toast.LENGTH_LONG).show()
            }
            else{
                loginText.setTextColor(getColor(R.color.mix))
            }

        }

    }

}