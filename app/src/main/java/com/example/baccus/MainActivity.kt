package com.example.baccus

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.example.baccus.juego.JuegoActivity
import com.example.baccus.jugador.Jugador

class MainActivity : AppCompatActivity() {

    private var jugadores: ArrayList<Jugador>? = null;
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
        System.out.println("add")

        textNombre!!.text.clear()
    }

    private fun terminarJugadores() {
        System.out.println("Aqui")
        if (!jugadores.isNullOrEmpty()){
            val intent = Intent(this, JuegoActivity::class.java).apply {
                putExtra("jugadores", jugadores!!)
            }
            startActivity(intent)
        }
    }
}