package main.scala.chp02

/**
 * NOTES:
 *  - Scala has a special notation for a function that returns no value.  If the function body is enclosed in braces
 *  without a preceding = symbol, then the return type is Unit.  Such a function is called a procedure.  A procedure
 *  returns no value, and you only call it for its side effect.
 */
object Procedures {
  def main(args: Array[String]){

    //Example,the following procedure prints a string inside a box like
    // -------
    // |Hello|
    // -------

    //Because the procedure does not return any value, we omit the = symbol
    def box(str: String) { //Look carefully: no =
      val border = "-" * str.length + "--\n"
      println(border + "|" + str + "|\n" + border)
    }

    box("Hello")
    box("Get to the chopper!!")

    //Same procedure but explicit return type of Unit
    def box1(str: String): Unit = { //': Unit =' expliciting stating the return type
    val border = "-" * str.length + "--\n"
      println(border + "|" + str + "|\n" + border)
    }
  }
}
