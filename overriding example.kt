//  overriding example
//  there are certain rules that we need to follow 
//  


fun main(args: Array<String>)
{
    var dog = dog()
    var cat = Cat()
    dog.eat()
    cat.eat()
    
   
}
// open makes our class accessable to othr class
open class animal
{
    var color: String = ""
     
    // to override use open here
    open fun eat()
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
    //you also need to apply ovverride here 
     override fun eat()
    {
     println("Dog is eating")   
    }
}
class Cat: animal()
{
    var age: Int = -1
    fun meaoow()
    {
        println("Meaooow")
    }
  //you also need to apply ovverride here 
    override fun eat()
    {
     println("cat is eating")   
    }
}