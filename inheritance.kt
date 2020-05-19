// inheritance example


// problem with kotlin and in kotlin
// every class is public and final in nature so 
// to perform inheritance in it we require 
// open keyword
fun main(args: Array<String>)
{
    var dog = dog()
    dog.breed= "labra"
    dog.color= "golden"
    dog.brak()
    dog.eat()
    
    var cat = Cat()
    cat.breed= "persian"
    
   
}
// open makes our class accessable to othr class
open class animal
{
    var color: String = ""
    
    fun eat()
    {
        println("EAT")
    }
}

// you also need to define 
// class name followed by () ie constructor
 class dog: animal()
{
    var breed: String = ""
    fun brak()
    {
        println("BARK")
    }
}
class Cat: animal()
{
    var age: Int = -1
    fun meaoow()
    {
        println("Meaooow")
    }
}