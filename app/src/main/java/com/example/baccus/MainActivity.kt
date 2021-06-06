package com.example.baccus

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import com.example.baccus.jugador.Jugador

class MainActivity : AppCompatActivity() {

    var jugadores: ArrayList<Jugador>? = null;
    //Botones
    private var btAnadirJugador : Button? = null
    private var btTerminarJugadores : Button? = null
    //Textos
    private var textNombre : EditText? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        jugadores = ArrayList<Jugador>()
        btAnadirJugador = findViewById(R.id.btAnadirJugador) as Button
        btTerminarJugadores = findViewById(R.id.btTerminarJugadores) as Button
        textNombre = findViewById(R.id.textNombre) as EditText
        btAnadirJugador!!.setOnClickListener {
            anadirJugador()
        }
        btTerminarJugadores!!.setOnClickListener {
            terminarJugadores()
        }
    }

    private fun anadirJugador() {
        if (!textNombre!!.text.isNullOrEmpty()) {
            jugadores?.add(Jugador(textNombre!!.text.toString()))

        }
        textNombre!!.text.clear()
    }

    private fun terminarJugadores() {
        for (jugador in jugadores!!){
            System.out.println(jugador.getNombre())
        }

    }
}