package com.example.baccus.jugador

import android.text.Editable

class Jugador(nombre: String) {
    private var nombre: String? = null
    private var puntos: Number? = null

     init  {
        this.nombre = nombre
        this.puntos = 0
    }

    fun getNombre(): String? {
        return nombre
    }

    fun setNombre(nombre: String?) {
        this.nombre = nombre
    }

    fun getPuntos(): Number? {
        return puntos
    }

    fun setPuntos(puntos: Number?) {
        this.puntos = puntos
    }
}