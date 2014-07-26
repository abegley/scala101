package main.scala.chp01

/*
NOTES:
    - you can write
      a method b
    - as a shorthand for
      a.method(b)
    - where method is a method with two parameters (one implicit, one explicit)

    - Scala does not have ++ or -- operators, use +=1 or -=1
 */
object ArithmeticOperatorOverloading {
  def main(args: Array[String]){
    val a,b = 10

    println(a + b)
    //is a shorthand for
    println(a.+(b))   //note the parentheses around 'b'

    val c = 1
    val d = 10

    println(c to d)
    println(c.to(d))

    val x: BigInt = 1234567890
    println(x * x * x)

    var counter = 10
    counter+=1
    println(counter)
    counter-=1
    println(counter)
  }
}
