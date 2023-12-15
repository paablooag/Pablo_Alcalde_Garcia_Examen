package com.example.pablo_alcalde_garcia_examen

open class Circunferencia(var radio:Double, var centro: Double, var punto: Double) {

//    constructor(centro:Double, punto:Double):this(){
//
//    }
    fun longitud():Double{
        var lon=2*Math.PI*radio
        return lon
    }
    override fun toString(): String {
        return "Longitud: ${longitud()} Radio: ${this.radio} Centro: $centro Punto: $punto"
    }
}

class Circulo(radio:Double, var colorCirculo:String):Circunferencia() {
        fun area():Double{
            var area= Math.PI*(radio*radio)
            return area
        }


    override fun toString(): String {
        return "Area: ${area()}"
    }

}

fun main(){
    var circulo = Circunferencia(4.0, 2.0, 0.8)
    println(circulo.longitud())
}
