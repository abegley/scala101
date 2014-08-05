package chp012

/**
 * Created by abegley on 04/08/2014.
 */
object AnonymousFunctions {
  def main(args: Array[String]){
    println("wibble")
    //In Scala, you don't have to give a name to each function, just like you don't have to give
    //a name to each number.  Here is an anonymous function

    //Multiply argument by 3
    (x:Double) => 3 * x;

    //You can store above function in a variable
    def triple = (x: Double) => x * 3;

    //You don't have to name the function.  You can just pass it to another function
    println(Array(3.14, 1.42, 2.0).map((x: Double) => x * 3).deep.mkString("\n"))
    println("Calling function as a variable")
    println(Array(3.14, 1.42, 2.0).map(triple).deep.mkString("\n"))
  }

}
