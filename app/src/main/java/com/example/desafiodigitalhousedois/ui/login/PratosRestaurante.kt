package com.example.desafiodigitalhousedois.ui.login

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.desafiodigitalhousedois.R
import kotlinx.android.synthetic.main.imagem_topo.*
import kotlinx.android.synthetic.main.inf_pratos.*

class PratosRestaurante: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.inf_pratos)
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayShowTitleEnabled(false)

        var dish = intent.getSerializableExtra("dish") as Pratos

        ivTopoMenu.setImageResource(dish.image)
        tvTopoMenu.text = dish.name
        tvPratoInfo.text = dish.description

    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}