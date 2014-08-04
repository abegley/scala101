package chp012

import scala.math._

/**
 * Created by abegley on 04/08/2014.
 */
object FunctionAsValues {
  def main(args: Array[String]){
    //This code sets num to 3.14 and fun to the ceil function
    val num = 3.14
    val fun = ceil _
    //the _ turns the ceil methodn into a function.  In Scala you cannot manipulate methods, only functions

    //What can you do with a function - two things
    //  - call it
    //  - Pass it around, by storing it in a variable or giving it to a function as a parameter

    //fun is a variable containing a function, not a fixed function
    println(fun(num))

    //
    println("Playing with Arrays")
    //The map method accepts a function, applies it to all values in an array, and returnsan array
    //with the function values
    println(Array(3.14, 1.42, 2.0).map(fun).deep.mkString("\n"))


  }
}
