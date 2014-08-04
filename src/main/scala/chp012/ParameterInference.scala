package chp012

/**
 * Created by abegley on 04/08/2014.
 */
object ParameterInference {

  def main(args: Array[String]){
    def valueAtOneQuarter(f: (Double) => Double ) = f(0.25)

    //When you pass an anonymous function to another function or method, Scala helps you out
    //by deducing types when possible.  For example: you don't have to write:
    //valueAtOneQuarter((x:Double) => 3 * x)

    //Since the valueAtOneQuarter method knows that you will pass in a (Double) => Double function
    // you can write
    valueAtOneQuarter((x) => 3*x)

    //for a function that has just one parameter, you can omit the () around the parameter
    valueAtOneQuarter(x=> 3*x)

    //if a parameter occurs only once on the right-hand side of the => , you can replace it with an
    //underscore _
    valueAtOneQuarter(3 * _)

    //Keep in mind that these shortcuts only work when the parameter types are known.

    //val fun1  = 3 * _ //Error:  Can't infer types
    val fun2 = 3 * (_:Double) //OK
    val fun3: (Double) => Double = 3 * _ //OK, because we specified the type of fun
  }

}
