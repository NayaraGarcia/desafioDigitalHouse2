package com.example.desafiodigitalhousedois.ui.login

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_register.*
import android.content.Intent as Intent1

class Register : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        btn_register_dois.transformationMethod = Senha()
        confirmar_password.transformationMethod = Senha()


        btn_register_dois.setOnClickListener {
            startActivity(
                Intent1(this, LisaRestaurantAdapter::class.java)
            )
        }
    }
}

