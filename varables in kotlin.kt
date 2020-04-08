fun main(args : Array<String>)
{
   
   // var 
   var string1 = "hello World"
   var number1 = 10 
   var decimal1 = 10.98
   
   var newstring : String 
   newstring = "hello "
   
     print(string1 + " " + number1 + " " + decimal1 + " " + newstring + " ")
   
   println(" ")
   
   
   // val
   val string2 = "hello user"
   val number2 = 11
   val decimal2= 11.98
   val newstring2 : String
   newstring2 = "hello...."
   println(string2+ " " + number2 + " " + decimal2 + " " + newstring2 )
   
   // now there are two types of variable declaration in kotlin var and val the data in var can be changes with respect to time but the data in val cannot be changed 
   
   //example 
   
   println(" ")
   string1 = "hello new world"
   print(string1)
   
   //but when your try it with val i.e string2 you will get an error
   // string2 = "hello new user" // error val cannot be reassigned
   
 
   
  
}