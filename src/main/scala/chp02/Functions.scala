package main.scala.chp02

/*
NOTES:
  - Scala has functions in addition to methods. A method operates on an object, but a function does not.
  In java, you imitate them with static methods
 */

object Functions {
  def main(args: Array[String]){

    //to define a function, you specify the function's name, parameters, and body like this:
    def abs(x: Double) = if(x>0)x else -x
    //You must specify the types of all parameters.
    //As long as the function is not recursive, you need not specify the return type. The Scala compiler determines
    //the return type from the type of the expression to the right of the = symbol.

    //If the body of the function requires more than one expression, use a block. The last expression of the block becomes
    //the value that the function returns.  For example, the following function returns the value of r after the for loop.

    def fact(n : Int) = {
      var r = 1
      for (i <- 1 to n) r = r * i
      r
    }
    println(fact(5))

    //There is no need for the return keyword in this example.  It is possible to use return as in Java or C++, to exit
    //a function immediately, but that is not commonly done in Scala

    //TIP:  While there is nothing wrong with using return in a named function (except the waste of seven keystrokes), it is
    //a good idea to get used to life without return.  Pretty soon, you will be using lots of anonymous function, and there,
    //return  does not return a value to the caller. it breaks out to the enclosing named function. Think of return as a kind
    // of break statement for functions, and only use it when you want that breakout functionality.

    //###########
    //With a recursive function, you must specify the return type. For example
     def fac(n: Int): Int = if (n<=0) 1 else n * fac(n-1)
    //Without the return type, the Scala compiler could not verify that the type of n * fac(n-1) is an Int.
    println(fac(5))

  }


}
