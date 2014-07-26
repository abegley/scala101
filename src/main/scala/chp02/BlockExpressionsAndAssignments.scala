package main.scala.chp02

import scala.math._
/*
NOTES:
    - In Scala, a {} block contains a sequence of expressions, and the result is also an expression. The value of the
    block is the value of the last expression.
 */
object BlockExpressionsAndAssignments {
  def main(args: Array[String]){
    //####
    //{} block example: useful if the initialization of a val takes more than one step.
    val x, y = 2
    val x0, y0 = 1
    val distance = {val dx = x - x0; val dy = y - y0; sqrt(dx * dx + dy * dy) }
    println(distance)
    //The value of the {} block is the last expression, sqrt(dx * dx + dy * dy)

    //####
    var r,n = 2
    //A block that ends with an assignment statement, such as
    val result = {r = r * n; n -= 1 }
    //has a Unit value - equivalent of the void type in Java

    //since assignments have Unit value, do not chain them together
    var a,b : Any = null
    println("a="+a+", b=" + b)
    a = b = 1 //No, the value of expression 'b = 1' is Unit,()
    println("a="+a+", b=" +b) //a is set to Unit,()
  }
}
