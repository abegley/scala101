package main.scala.chp02

/*
NOTES:
 */
object DefaultAndNamedArguments {
  def main(args: Array[String]){

    def decorate(str: String, left:String = "[", right: String = "]") =
        left + str + right

    println(decorate("Alan"))
    println(decorate("Alan", "<<<", ">>>"))
    println(decorate("Alan", "!", "?"))

    //Note, if you supply fewer arguments than there are parameters, the defaults are applied from the end
    println(decorate("Alan", "<<<]")) //"<<<]" is applied to the left parameter

    println(decorate(left = "<<<", str = "Alan", right = ">>>")) //Named arguments need not be in the same order as the
    //parameters

    //You can mix unnamed and named arguments, provided the unnamed ones come first

    println(decorate("Hello", right = "]<<<")) //Calls decorate("Hello", "[", "]<<<")
  }


}
