// range in kotlin

fun main(args : Array<String>)
{
    // This will give us an range of 1,2,3,4,5,6,7..10
    
    val r1 = 1..10
  
  for(i in r1)
  {
      print(i)
      
  }
  
  
  // To check if number present in range or not 
  var ispresent = 11 in r1
  print(ispresent)
  
   
}