package com.example.nikitabaronia.firstPackage

fun main (args :Array<String>){

    val area = findVolume(3,2)
    System.out.println(area)

    //overriding fn args
    val area2 = findVolume(2,5,8)
    System.out.println(area2)

    /*
    In kotlin, one can give args names while calling so that
    if in future we have 4 5 args, we dont need to match the sequence
     */

    //Example
    findArea(length = 2,height = 9, breath = 1)  // this automatically keep the sequence intact

}


//we cam pass default values as args && can override them as well
@JvmOverloads
fun findVolume(length:Int, breath :Int, height: Int=10): Int{
   return length*breath*height;
}

/*
* since java doesn't suppoort default functions
* So we need to annoate them as JVMOverloads which will make my
* func in Kotlin compatible with JAVA file
 */



//we cam pass default values as args && can override them as well
@JvmOverloads
fun findArea(length:Int, breath :Int, height: Int=10): Int{
    return length*breath*height;
}


