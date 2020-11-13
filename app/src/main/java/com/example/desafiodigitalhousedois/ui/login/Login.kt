package com.example.desafiodigitalhousedois.ui.login

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.desafiodigitalhousedois.R
import kotlinx.android.synthetic.main.activity_login.*
import kotlinx.android.synthetic.main.activity_register.*

class Login : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        inputPassword.transformationMethod = Senha()

        btn_login.setOnClickListener {
            startActivity(Intent(this, LisaRestaurantAdapter::class.java))


            btn_register.setOnClickListener {
                startActivity(
                    Intent(
                        this,
                        LisaRestaurantAdapter::class.java
                    )
                )
            }


        }
    }

}