package main.scala.chp01

import scala.math.BigDecimal.int2bigDecimal

/*
NOTES:
    - No distinction between primitive types and class types in Scala.
    - Seven numeric types, all classes, Byte, Char, Short, Int, Long, Float and Double
    - no need for wrapper types, scala compiler converts between primitive types and wrappers
    - For example, if you make an array of Int, you get an int[] array in the virtual machine
    - use methods, not casts, to convert between numeric types
 */
object CommonTypes {
  def main(args:  Array[String]){
    //remember '1','10','6' is a class with methods, see RichInt and RichDouble - these augment the Int and Double java classes
    println(1.to(100))
    println(1 to 100)
    println(1.*(5))
    println(1 * 5)
    println(10./(5))
    println(6.%(4))
    println()

    //Scala relies on the underlying java.lang.String class for strings.  The aforementioned class is augmented
    //with additional operations in the StringOps class.
    println("Hello".intersect("World"))  // The java.lang.String Object "Hello" is implicitly converted to a StringOps object

    println(99.toBigInt())
    println(99.4567.toInt)
    println(99.64321.toInt)
    println(90.toChar)
    println("99.22".toDouble * 2)
  }
}
