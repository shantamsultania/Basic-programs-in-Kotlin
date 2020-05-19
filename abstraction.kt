// abstract class in kotlin
// abstract class is declared with the help of abstract keyword
// why we  make abstarct class
// this is made with the idea in mind to hide the details
//  from the user and show only the usefull details 

fun main(args: Array<String>)
{
   var obj = area()
   print(obj.lenght)
}
abstract class values 
{
    abstract var lenght:Int
    var breath = 0
}
class area : values()
{
    override var lenght = 10
    var breath1 = 20
}
class perameter :values()
{
    override var lenght = 30
    var breath1 = 40
}