package com.example.desafiodigitalhousedois.ui.login

import java.io.Serializable

class Restaurante (
    val id: Int, val nome: String, val endereco: String,
    val horas: String, val imagem : Int, val pratos : ArrayList<Pratos>) : Serializable