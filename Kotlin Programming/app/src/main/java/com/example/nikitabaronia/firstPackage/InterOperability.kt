@file:JvmName("myfile")  //this way you create a specific name of class while JVM loads
package com.example.nikitabaronia.firstPackage

import myjava.myFirstClass


fun void (array: Array<String>){

   //call java function
   var area = myFirstClass.getArea(4,7)
   System.out.println(area)
}


 fun addSum(a:Int, b:Int):Int{
  return a+b;
}