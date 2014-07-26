package main.scala.chp02

/*
NOTES:

 */
object VariableArguments {
  def main(args: Array[String]){
    def sum(args: Int*) = {
      var result = 0
      for (arg <- args) result += arg
      result
    }
    println(sum(1,6,32,85,21,9))
    println(sum(32,5,1,54,264,76,10,4,67))

    //The function receives a single parameter of type Seq,

    println(sum(1 to 5: _*))

    //This call syntax is needed in a recursive definition:

    def recursiveSum(args: Int*): Int ={
      if (args.length ==0) 0
      else args.head + recursiveSum(args.tail : _*)
    }
    //Here, the head of a sequence is its initial element, and tail is a sequence of all
    //other elements.  That's again a Seq, and we have to use : _* to convert it to an argument sequence
  }
}
