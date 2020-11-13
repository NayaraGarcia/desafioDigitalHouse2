package com.example.desafiodigitalhousedois.ui.login

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.desafiodigitalhousedois.R
import kotlinx.android.synthetic.main.activity_login.*
import kotlinx.android.synthetic.main.activity_register.*
import kotlinx.android.synthetic.main.activity_login.inputPassword as inputPassword1

class Login : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        inputPassword.transformationMethod = Senha()

        btnLogin.setOnClickListener {
            startActivity(Intent(this, ListaRestaurante ::class.java))


            btnRegister.setOnClickListener {
                startActivity(
                    Intent(
                        this,
                        Register ::class.java
                    )
                )
            }


        }
    }

}