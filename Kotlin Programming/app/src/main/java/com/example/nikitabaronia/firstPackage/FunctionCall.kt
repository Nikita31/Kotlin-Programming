package com.example.nikitabaronia.firstPackage

import secondPackage.displayName

fun main(array: Array<String>) {
    var myString: String //declaring as String

    myString = "Hi this is function calling tutorial"

    //call the printName fn and pass the value
    printName(myString)

    //calling a method inside of a class
    //create object of class #display
    var displayObj = display()
    displayObj.displayName(myString) //method called

    //assign through class object
    var displayNameObj = displayNameWithoutVar()
    displayNameObj.name = "nikita baronia" //asigned name a value
    displayNameObj.displayName()  //call the displayName method without passing any variable

    //if we want to print name in main method without calling method
    println("Hi I am called from main method " + displayNameObj.name)

    // $ is an identifier which will extract values from class var

    //make sure you use curly brackets else it will print hashValue of class
    println("Hi I am called inside brackets ${displayNameObj.name}")

    //create obj of a class from another package
    var obj2 = displayName("Hi passing value to cons")
    obj2.display()

}

//create a function to print name
fun printName(name: String) { // syntax is {{varName : dataType }}
    println(name)
}

//declare a class and create a method inside it
class display {

    //declare function
    fun displayName(name: String) {
        println("Hi I am inside a class " + name)
    }
}

//declare a class and create a method inside it
class displayNameWithoutVar {

    var name: String = ""
    //declare function
    fun displayName() {
        println("Hi I am inside a class" + name)
    }
}