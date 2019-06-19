package com.example.nikitabaronia.firstPackage

fun main(array: Array<String>) {

    //Ranges are helpful in Kotlin for Loops

    /*
    * Ranges handling and definition for Int
    * */
    //Declare a var range from 1 to 5
    var r1 = 1..5  //it will have 1 2 3 4 5 in ascending order

    var r2 = 8 downTo 1 //downTo will print descending order 8 7 6 ... 1

    var r3 = 10 downTo 1 step 2 //this will print alternate number, one can step/skip any number of steps

    /*
   * Ranges handling and definition for Strings
   * */

    var r4 = "a".."z" //this will print "a" ..... "z"

    /*
    * Ranges handling and definition for Characters
    * */

    var r5 = 'a'..'z' //this will print 'a' ..... 'z'

    //check if a letter is present in a range
    var isPresent = 'c' in r5 //this will either true or false

}