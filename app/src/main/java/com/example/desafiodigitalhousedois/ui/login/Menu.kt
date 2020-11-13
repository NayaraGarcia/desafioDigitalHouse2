package com.example.desafiodigitalhousedois.ui.login

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import com.example.desafiodigitalhousedois.R
import kotlinx.android.synthetic.main.activity_menu.*
import kotlinx.android.synthetic.main.activity_register.*
import kotlinx.android.synthetic.main.activity_register.toolbar
import kotlinx.android.synthetic.main.imagem_topo.*

class Menu: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayShowTitleEnabled(false)

        val restaurant = intent.getSerializableExtra("restaurante") as Restaurante

        tvTopoMenu.text = restaurant.nome
        ivTopoMenu.setImageResource(restaurant.imagem)

        rvPratos.adapter = MenuAdapter(this, restaurant.pratos)
        rvPratos.layoutManager = GridLayoutManager(this, 2)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}