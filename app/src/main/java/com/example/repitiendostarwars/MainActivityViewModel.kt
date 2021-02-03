package com.example.repitiendostarwars

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.delay

class MainActivityViewModel : ViewModel() {

    private val films = mutableListOf(
        Film(1, "La Amenaza Fantasma", "1999"),
        Film(2, "El Ataque de los Clones", "2002"),
        Film(3, "La Venganza de los Sith", "2005"),
        Film(4, "Una Nueva Esperanza", "1977"),
        Film(5, "El Imperio Contraataca", "1980"),
        Film(6, "El Retorno del Jedi", "aaaa")
    )

    suspend fun getFilms(): MutableList<Film> {
        delay(2000)
        return films
    }


    suspend fun getOldFilms() : MutableList<Film> {
        delay(2000)
        return films.subList(3,6)
    }

    suspend fun getNewFilms() : MutableList<Film> {
        delay(2000)
        return films.subList(0,3)
    }
}