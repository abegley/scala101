package main.scala.chp01

/*
NOTES

    - In Scala, it is common to use a syntax that looks like a function call.  For example, if 's' is a string,
    then s(i) is the ith character of the string. (In C++ , you would write s[i]; in Java, s.charAt(i).)

 */
object Apply {

  def main(args : Array[String]){
    println("Hello"(4))  // 'o'

    //Think of the above as an overloaded form of the () operator. It is implemented as a method, with the name apply.
    //For example in StringOps
      //def apply(n: Int): Char
    //That is , "Hello"(4) is a shortcut for
      //"Hello".apply(4)
    println("Hello".apply(4))

    //BigInt companion apply methods
    println(BigInt("1234567890"))
    //shortcut for
    println(BigInt.apply("1234567890"))
    //yields a new BigInt object, without having to use 'new'.  For example

    println(BigInt("1234567890") * BigInt("112358111321"))

    println(Array(1, 4, 9, 16).length)  //Array(1,4,9,16) returns an array, thanks to the apply method of the Array companion object
  }
}
