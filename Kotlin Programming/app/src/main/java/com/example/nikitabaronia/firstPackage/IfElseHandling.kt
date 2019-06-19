package com.example.nikitabaronia.firstPackage

fun main(array: Array<String>){

    //Advanatge of If/Else : they can be assigned some Values

    var a = 4;
    var b = 10


    var maxValue: Int = if (a > b)  //assign var a values from if/else
        a
    else
        b

    println(maxValue)

    //Switch case in Kotlin is done by when

    var y : String

    val x = 2
    when(x){  //switch case
        1 -> println("1 is printed")
        2 -> println("2 is printed")

        0,3-> println("This will handle multiple conditions")  //handle multiple conditions

        in 1..10 -> println("This will print values in Range of 1 to 10")
        else -> println("This is default")  //like default in JAVA

    }

   // assign when's OutPut a values
    var str2 = when(x){  //switch case
        1 -> "1 is printed"
        2 -> "2 is printed"

        0,3-> "This will handle multiple conditions" //handle multiple conditions

        in 1..10 -> "This will print values in Range of 1 to 10"
        else -> "This is default" //like default in JAVA

    }

    print(str2)
}