package me.joseTellez

fun main() {
    //Lambdas BASICOOOOOOO
    val myLambda: (String,Int) ->Unit={ myName,age->
        println("Informacion de ${myName}, tiene ${age} años.")
    }

    myLambda("jose",20)

    val myLamb: (Int,Int) ->Int={ num1,num2->
         num1+num2
    }

    println(myLamb(2,20))


    //LAMBDAS ORDEN SUPERIOS    - una lambda con una lambda adentro
    val lambdaSumar:(Int,Int)->Int={num1,num2->num1+num2}

    operar(25,5){num1,num2->
        num1+num2
    }
}

fun operar(num1:Int,num2:Int, lambda:(Int,Int)->Int):Int{
    return lambda(num1,num2)
}



fun printInf(myName:String,age:Int):Unit{
    println("Informacion de ${myName}, tiene ${age} años.")
}

fun sumarEdades(num1:Int,num2:Int):Int{
    return num1+num2
}