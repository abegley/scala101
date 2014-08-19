package scratch

/**
 * Created by abegley on 19/08/2014.
 * Recipe 9.2 You want to pass a function around like a variable, just like
 * you pass String, Int, and other variables around in an object-oriented programming language.
 */
object FunctionsAsVariables extends App {
  //The following code defines a function literal that
  //takes an Int parameter and returns a value that is twice the amount of the Int that is passed in:
  (i:Int) => {i * 2}

  //As mentioned in Recipe 9.1 , you can think of the = > symbol as a transformer. In this case, the
  //function transforms the Int value i to an Int value that is twice the value of i.
  //You can now assign that function literal to a variable:
  val double = (i:Int) => {i * 2}

  //The variable double is an instance, just like an instance of a String, Int, or other type, but in this
  //case, it's an instance of a function, known as a 'function value'.  You can not invoke double just like
  //you'd call a method:
  double(5)   //10
  double(10)  //20

  //Beyond just invoking double like this, you can also pass it to any method (or function) that takes a function
  //parameter with its signature. For instance, because the map method of a sequence is a generic method that
  //takes an input parameter of type A and returns a type B, you can pass the double method into the map
  //method of an Int sequence.
  val list = List.range(1,5)
  println("elements in list")
  list.foreach(println(_))
  println("elements in list doubled")
  list.map(double).foreach(println(_))




}
