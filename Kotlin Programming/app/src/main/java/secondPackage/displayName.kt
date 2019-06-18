package secondPackage


/*
* In Kotlin, constructor is declared with class
*
* */
class displayName(var name : String){

    fun display(){
        print("Hi I am called from another Package ${name}")
    }
}