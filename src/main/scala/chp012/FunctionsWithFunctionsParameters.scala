package chp012

import scala.math._

/**
 * Created by abegley on 04/08/2014.
 */
object FunctionsWithFunctionsParameters {
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
  }

}
