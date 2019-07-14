package com.example.nikitabaronia.firstPackage

fun main(args: Array<String>) {

    //Iterators in Kotlin

    //for Loop
    for (i in 1..10) {  //while 1..10 is a range see @RangeHandling.kt for reference
        println(i)

        if (i % 2 == 0) {  //even numbers
            println(i)
        }

    }

    //while loop
    var x: Int = 1
    while (x <= 10) {
        println(x)
        ++x

//    }

        //do while Loop in Kotlin
        var y: Int = 2

        do {
            println(y)
            y++
        } while (y < 10)

        //break and Continue statements in Kotlin

        for (i in 1..3) {
            for (j in 1..3) {
                println("$i && $j")
                if (i == 2 && j == 2)  //matches the condition and breaks the loop
                    break // this just breaks inner loop not outer Loop
                //so output will be
                /**
                 * 1 && 1
                1 && 2
                1 && 3
                2 && 1
                2 && 2
                3 && 1
                3 && 2
                3 && 3
                 */
            }
        }

        //if one want to break outer loop

        myouterLoop@ for (i in 1..3) {   //name this loop
            for (j in 1..3) {
                println("$i && $j")
                if (i == 2 && j == 2)  //matches the condition and breaks the loop
                    break@myouterLoop         // this just breaks outer loop by finding name
                //so output will be
                /**
                1 && 1
                1 && 2
                1 && 3
                2 && 1
                2 && 2
                 */
            }
        }

        //Same works for CONTINUE

    }
}