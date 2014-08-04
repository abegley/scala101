package chp012

import scala.math._

/**
 * Created by abegley on 04/08/2014.
 */
object FunctionsWithFunctionParameters {
  def main(args: Array[String]){
    //implement a function that takes another function as a parameter.

    def valueAtOneQuarter(f: (Double) => Double) = f(0.25)
    //not that the parameter can be any function receiving and returning a Double

    //For example
    valueAtOneQuarter(ceil _)
    valueAtOneQuarter(sqrt _)

    //What is the type of valueAtOneQuarter?  It is a function with one parameter, so its type is
    //written as

    //(parameterType) => resultType

    //The result type is clearly Double, and the parameter type is already given in the function header as (Double) => Double
    //Therefore, the type of valueAtOneQuarter is

    //((Double) => Double) => Double

    //Since valueAtOneQuarter is a function that receives a function, it is called a higher-order function

    //A higher-order function can also produce a function.  Here is a simple example:

    def multiply(factor:Double)=(x:Double) => factor * x
    //multiply returns the function (x:Double) => 3 * x
    println(multiply(3))
    //The power of multiply is that it can deliver functions that multiply by any amount

    val quintuple = multiply(5)
    println(quintuple.apply(20))

    //The multiply function has a parameter of type Double, and it returns a function of type
    //(Double) => Double.  Therefore its type is

    //(Double) => ((Double) => Double

  }

}
