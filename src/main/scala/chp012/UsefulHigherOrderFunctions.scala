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
  }

}
