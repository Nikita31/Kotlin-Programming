package com.example.nikitabaronia.firstPackage


/**
 *
 * This is learn function definition, handling
 */


fun calculateArea(length:Int, Breadth:Int) : Int{  // : Int is the returnType of the function which has two args
   return  length*Breadth
}

fun calculateArea(length:Int, Breadth:Int, Width:Int) : Unit{  // : Unit is the returnType (void()) of the function which has three args
    print(length*Breadth*Width)
}

//fucntions as Expressions

fun main (args: Array<String>){
  //call the method
    var larger = add(2,7)
    print("Larger number is $larger")
}

fun add (a:Int, b:Int): Int = if (a>b) a  else b  //function is expressed as calculation Expression