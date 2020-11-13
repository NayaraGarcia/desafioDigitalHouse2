package com.example.desafiodigitalhousedois.ui.login

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.desafiodigitalhousedois.R

class ListaRestaurante : AppCompatActivity() {
private val restaurante : ArrayList<Restaurante> = getRestaurante ()

    fun getRestaurante() : ArrayList<Restaurante> {
        return arrayListOf(
            Restaurante(1, "Tony Roma's", "Av. Lavandisca, 717 - Indianópolis, São Paulo", "22:00", R.drawable.image1, getDishes()),
            Restaurante(2, "Aoyama - Moema", "Alameda dos Arapanés, 532 - Moema", "00:00", R.drawable.image4, getDishes()),
            Restaurante(3, "Outback - Moema", "Av. Moaci, 187, 187 - Moema, São Paulo", "00:00", R.drawable.image5, getDishes()),
            Restaurante(4, "Sí Señor!", "Alameda Jauaperi, 626 - Moema", "01:00", R.drawable.image3, getDishes())
        )
    }

    fun getDishes() : ArrayList<Pratos> {
        val dish = Pratos(1, "Salada com molho Gengibre", R.drawable.image4, "Sed ut perspiciatis, unde omnis iste natus error sit voluptatem accusant doloremque laudantium, totam rem aperiam eaque ipsa, quae ab illo inventore veritalis.")
        return ArrayList(
            generateSequence { dish }.take(10).toMutableList()
        )
    }
}