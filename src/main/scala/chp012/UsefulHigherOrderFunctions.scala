package chp012

/**
 * Created by abegley on 04/08/2014.
 */
object UsefulHigherOrderFunctions {
  def main(args: Array[String]){
    (1 to 20).map("*" * _).foreach(println _)
    (1 to 20).map("*" * _).foreach(println _)


    //The filter method yields all elements that match a particular condition.  For
    //example, here's how to get only even numbers
    (1 to 9).filter(_ % 2 == 0).foreach(println _)

    //The above is not the most efficient way of getting this result
    //reduceLeft method takes a binary function - a function with two parameters - and
    //applies it to all elements in the sequence, going from left to right.
    //Example

    val result = (1 to 9).reduceLeft(_ * _)
    println(result)

    val sortedWords = "Mary had a little lamb".split(" ").sortWith(_.length < _.length)
    println(sortedWords)
    "Mary had a little lamb".split(" ").sortWith(_.length < _.length).foreach(println _)
    "f,t,s,g,d,e,g,h,b,a,c".split(",").sorted.foreach(println _)
    "454,2,35,9,18,1,7,3001".split(",").sorted


  }

}
