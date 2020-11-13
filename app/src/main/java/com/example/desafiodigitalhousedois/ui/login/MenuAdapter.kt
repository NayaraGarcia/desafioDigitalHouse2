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
import kotlinx.android.synthetic.main.activity_menu.*
import kotlinx.android.synthetic.main.pratos.view.*

class MenuAdapter (
    private val context: Context,
    private val dishes : ArrayList<Pratos>) : RecyclerView.Adapter<MenuAdapter.DishViewHolder>() {

    class DishViewHolder(val view: View) : RecyclerView.ViewHolder(view) {
        val cvDish : CardView = view.cvPrato
        val ivDish : ImageView = view.ivPrato
        val tvDishName : TextView = view.tvPrato
    }

    override fun getItemCount() = dishes.size

    override fun onBindViewHolder(holder: DishViewHolder, position: Int) {
        val dish = dishes.get(position)
        holder.ivDish.setImageResource(dish.image)
        holder.tvDishName.text = dish.name

        holder.cvDish.setOnClickListener{
            context.startActivity(
                Intent(context, PratosRestaurante::class.java)
                    .putExtra("dish", dish)
            )
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DishViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.pratos, parent, false)
        return DishViewHolder(view)
    }
}