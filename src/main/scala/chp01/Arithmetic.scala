package main.scala.chp01

/*
NOTES:
1.2 Declaring Values and Variables
  - val is a constant
  - var contents can change
  - no type declaration is required. It is inferred from the type of the expression with which you initialize it
  - error to declare a val or var without initialization i.e 'val greeting : String'
  - semicolons are only required for multiple statements on the same line
 */

object Arithmetic {
  def main(args: Array[String]){
    val result = 8 * 5 + 2
    println(result)

    val hello = "Hello" + result
    println(hello)
    println(hello.toUpperCase())
    println(hello.toLowerCase)

    val world : String = "world"
    println(world)

    var age : Int = 100
    println(age)
    age = 101
    println(age)
    //age = "hundred" -- No worky, compile error
    println(age)

    var greeting : Any  = "wibble"
    println(greeting)
    greeting = 4
    println(greeting)

    val xmax, ymax =100

    var greeting1, message: String = null

  }

}
