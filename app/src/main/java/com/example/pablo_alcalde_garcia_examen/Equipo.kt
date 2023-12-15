package com.example.pablo_alcalde_garcia_examen


class Equipo (var nombre:String, var pais:String){
        fun championsLeague(equipos:List<Equipo>){
            for (i in equipos.indices){
                val random = equipos.shuffled()
                println("Equipo: "+random[i] +"Jugara contra "+random[i])
            }
        }
}

fun main(){
    var lista = mutableListOf<Equipo>(
        Equipo("Madrid", "España"),
        Equipo("Betis", "España"),
        Equipo("Barcelona", "España"),
        Equipo("Gerona", "España"),

        Equipo("ASd", "Eslovaquia"),
        Equipo("QWe", "Eslovaquia"),
        Equipo("MadHSADFrid", "Eslovaquia"),
        Equipo("ZCV", "Eslovaquia"),

        Equipo("POkjdhafkjhsd", "Finlandia"),
        Equipo("Abfdg", "Finlandia"),
        Equipo("Vsdgsdf", "Finlandia"),
        Equipo("QWRsdgs", "Finlandia"),

        Equipo("Pñsdflkj", "Noruega"),
        Equipo("Pahgsdhad", "Noruega"),
        Equipo("Afsdfvv", "Noruega"),
        Equipo("Aqdreqe", "Noruega")
    )


}