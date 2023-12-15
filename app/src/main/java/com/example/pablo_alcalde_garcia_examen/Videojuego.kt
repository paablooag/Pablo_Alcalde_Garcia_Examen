package com.example.pablo_alcalde_garcia_examen

class Videojuego(var nombre:String,
                 var plataforma:String,
                 var ano_salida:Int){

    override fun toString(): String {
        return "Nombre juego: $nombre Plataforma: $plataforma Año salida: $ano_salida"
    }

   fun filtrarJuego(lista: MutableList<Videojuego>): List<Videojuego> {
       return lista.filter { it.nombre in ano_salida.toString() }
   }

    fun mapaJuegos(lista: MutableList<Videojuego>): List<Videojuego> {
        return lista.filter { it.plataforma in nombre }
    }

    fun plataformas(lista: MutableList<Videojuego>): MutableList<String> {
        var plataforma2= mutableListOf<String>()
        lista.forEach{
            if (it.plataforma !in it.nombre){
                plataforma2[ano_salida] = nombre
            }
        }

        return plataforma2
    }

}
fun main(){
//    var lista = mutableListOf<Equipo>(
//        Videojuego("GTA VI", "PS5", 1992),
//        Videojuego("FIFA 23", "PC", 1999),
//        Videojuego("NBA 2K22", "PS4", 2001)
//    )

}
