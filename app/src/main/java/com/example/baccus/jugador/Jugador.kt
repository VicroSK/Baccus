package com.example.baccus.jugador

import android.os.Parcel
import android.os.Parcelable

class Jugador(nombre: String?) : Parcelable {
    private var nombre: String? = null
    private var puntos: Int? = null

    constructor(parcel: Parcel) : this(
        nombre = parcel.readString()
    ){}

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

    fun getPuntos(): Int? {
        return puntos
    }

    fun setPuntos(puntos: Int?) {
        this.puntos = puntos
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(nombre)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Jugador> {
        override fun createFromParcel(parcel: Parcel): Jugador {
            return Jugador(parcel)
        }

        override fun newArray(size: Int): Array<Jugador?> {
            return arrayOfNulls(size)
        }
    }
}