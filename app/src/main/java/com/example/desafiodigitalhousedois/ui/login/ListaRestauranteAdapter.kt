package com.example.desafiodigitalhousedois.ui.login

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.desafiodigitalhousedois.R
import kotlinx.android.synthetic.main.inf_restaurante.view.*

class ListaRestauranteAdapter (
      val context: Context,
      private val restaurants: ArrayList<Restaurante>): RecyclerView.Adapter<ListaRestauranteAdapter.RestaurantViewHolder>() {

      class RestaurantViewHolder(val view: View) : RecyclerView.ViewHolder(view) {
            val cvRestaurant : CardView = view.cvRestaurante
            val ivRestaurant : ImageView = view.ivRestaurant
            val tvRestaurantName : TextView = view.tvRestauranteNome
            val tvRestaurantAddress : TextView = view.tvRestauranteEndereço
            val tvRestaurantClosingHour : TextView = view.tvRestauranteHorario
      }

      override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RestaurantViewHolder {
            val view = LayoutInflater.from(parent.context).inflate(R.layout.inf_restaurante, parent, false)
            return RestaurantViewHolder(view)
      }

      override fun getItemCount() = restaurants.size

      override fun onBindViewHolder(holder: RestaurantViewHolder, position: Int) {
            val restaurant = restaurants.get(position)

            holder.ivRestaurant.setImageResource(restaurant.imagem)
            holder.tvRestaurantName.text = restaurant.nome
            holder.tvRestaurantAddress.text = restaurant.endereco
            holder.tvRestaurantClosingHour.text = "Fecha às ${restaurant.horas}"

            holder.cvRestaurant.setOnClickListener {
                  context.startActivity(
                        Intent(context, Menu::class.java).putExtra("restaurant", restaurant)
                  )
            }
      }
}