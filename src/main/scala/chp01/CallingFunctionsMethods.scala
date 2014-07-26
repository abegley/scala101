package main.scala.chp01

import scala.math._
/*
NOTES:
    - easier to use mathematical functions such as min or pow in Scala - no call to static methods
    - Scala does not have static methods, but has a similar feature, called singleton objects
    - Companion object whose methods act just like static methods do in Java
    - Scala methods without parameters often don't use parentheses, 'Hello.distinct' no parameters for distinct
    - Rule of thumb, parameterless method that doesn't modify the object has no parentheses
 */
object CallingFunctionsMethods {
  def main(args: Array[String]){
    println(sqrt(2))
    println(pow(2,4))
    println(min(3, Pi))

    //BigInt companion object to the BigInt class has a method probablePrime that generates
    //a random prime number with a given number of bits.  BigInt.probablePrime is
    //similar to a static method call in Java
    println(BigInt.probablePrime(100, scala.util.Random))
    //Random is a singleton, In Java it is a common error to construct a new java.util.Random object for each random no.

    prinln("Hello".distinct)  //no () distinct
  }

}
