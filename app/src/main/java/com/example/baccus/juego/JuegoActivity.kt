package com.example.baccus.juego

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.baccus.R
import com.example.baccus.jugador.Jugador

class JuegoActivity : AppCompatActivity() {

    private var jugadores: ArrayList<Jugador>? = null;
    private var posicion : Int? = null
    //Botones
    private var btAnadirPunto : Button? = null
    private var btOtroJuego : Button? = null
    //Textos
    private var textJugador : TextView? = null
    private var textTipoJuego : TextView? = null
    private var textDescripJuego : TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_juego)
        posicion = 0
        jugadores = intent.getSerializableExtra("jugadores") as ArrayList<Jugador>?
        btAnadirPunto = findViewById(R.id.btAnadirPunto) as Button
        btOtroJuego = findViewById(R.id.btOtroJuego) as Button
        textJugador = findViewById(R.id.textJugador) as TextView
        textTipoJuego = findViewById(R.id.textTipoJuego) as TextView
        textDescripJuego = findViewById(R.id.textDescripJuego) as TextView
        btAnadirPunto!!.setOnClickListener{
            jugadores?.get(posicion!!)!!.setPuntos(jugadores?.get(posicion!!)!!.getPuntos()?.plus(1))
        }
        btOtroJuego!!.setOnClickListener{
            //Cambiamos de juego
            System.out.println("Otro")
        }
    }
}