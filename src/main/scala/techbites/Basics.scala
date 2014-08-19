package techbites

/*

 */
object Basics extends App {

  /*
  1. Variable declaration and assignment overview
   */
  val name = "Alan"               //val is immutable, cannot reassign
  var favoriteColour = "Blue"     //var is mutable

  //name = "Begley"               //NOT OK - Compiler error - cannot change an immutable reference
  favoriteColour = "Red"          //OK

  /*
  2. Statements and Expressions - an expression has a value, a statement carries out an action
  */
  val result = if(favoriteColour == "Blue") "is blue" else "not blue"   //result : String = is blue

  /*
  3. No distinction between primitive types and class types
   */

  //'1','100','5' is a class with methods (to, *, /, %), see RichInt and RichDouble - these augment the Int and Double java classes
  println(1.to(100))            //two parameters, one implicit, one explicit
  println(1 to 100)             //same as above, just different syntax
  println(1.*(5))
  println(1 * 5)
  println(10./(5))
  println(6.%(4))

  //#####
  println("Welcome to the scala worksheet")   //>  "Welcome to the scala worksheet"
  println("Hello world")                      //>  "Hello world"

  //Type inference
  val x = 42                                  //> x : Int = 42
  val y = "hgttg"                             //> y : String = "hgttg"

  val z: String = "abcdefg"                  //> z : String = "abcdefg"

  //vals are immutable
  //x=45 is a compile error
  var m = 10                                 //> m : Int = 10
  m = 20

  //if statement - everything is an expression -returns a value
  var r = if (x == 42) "OK" else "not OK"   //> r : String = OK

  //String equality
  y == "hgttg"                              // Boolean = true

  /*
  A method operates on an object, but a function does not. In Java, you
  have to imitate them with static methods
   */

  def cube(i: Int) = i * i * i
  //no curly braces needed for single expression methods

  println(cube(10))

  //ex1a:  write a function to compare the length of the two strings
  // and return true if the 1st is longer

  def compare(str1: String, str2: String) = str1.length > str2.length

  println(compare("ab", "abc"))
  println(compare("abc", "abc"))
  println(compare("abcd","abc"))

  // ex1b: write a function to compute factorials for non-zero Nats (e.g. factorial(5) = 5 * 4 *3 * 2 * 1

  def factorial(number: Int): Int = {
    if(number == 1){
      number
    }else {
      number * factorial(number-1)
    }
  }

  println(factorial(5))
  println(factorial(8))
}


