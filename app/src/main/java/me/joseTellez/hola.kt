package me.josetellez

import androidx.compose.runtime.sourceInformation
import kotlin.random.Random


fun main() {
    println("*************** VARIABLES Y TIPO DE DATOS ***************")
    //hola
    /** dsdadasd
     * dsds
     * ds
     * d**/
    //cuando esta con       "val" es solo lectura, no se puede modificar - con "var" si
    var name: String = "Jose Tellez"
    val age: Int = 26
    val height = 20
    val isLogin = Random.nextBoolean()

    name = "jose"

    var message = "soy ${name} " //el nuevo f string
    println(message)
    message = "soy " + name

    println(message)

    if (age < 18) {
        message += ", soy menor de eda"
    } else if (age < 50) {
        message += ", soy adulto"
    } else {
        message += ", soy mayor."
    }

    //otra forma
    if (age < 18) message += ", soy menor de eda"
    else if (age < 50) message += ", soy adulto"
    else message += ", soy mayor."




    when {
        height < 1.5 -> message += "persona bajita"
        height < 2 -> message += "alto"
        else -> message += "gigante"
    }
    message+="${if(isLogin) "esta logeado " else "no esta logeado"}"
    println(message)
    println("**************** Funciones ****************")

    PrintInformation("javier",20)
    PrintInformation("fabian",30)
    PrintInformation("jose",18)
    PrintInformation(age=18, myName="Jose")
    println((sumar(2,5)))

    println("**************** Listas y Mapas ****************")
    //lista normal pero que no se le pueden cambiar datos - no es mutable
    val listNameProucts = listOf("teclas",true, 10,-1.1,"PC")
    println(listNameProucts)
    //lista normal pero que se le pueden cambiar datos - es mutable
    val listPricesProducts = mutableListOf<Int>(113,214,45,58,742)
    println(listNameProucts)

    //mapas = diccionarios - son los de clase:valor.
    val teclado = mutableMapOf(
        "name" to "teclado",
        "price" to 20500,
        "modelo" to 2025
    )

    val pc = mutableMapOf(
        "name" to "macbook",
        "price" to 2050000,
        "modelo" to 2025
    )
    val list = listOf(teclado,pc)

    for(product in list){
        println(product)
    }



}

//por fuera del main creamos funciones
fun PrintInformation(myName : String, age:Int):Unit{ //Unit es como el void en java pero no es necesario
    println("info usuario de ${myName} y tiene ${age} años")
}

fun sumar(num1:Int,num2:Int) :Int{
    return num1+num2
}