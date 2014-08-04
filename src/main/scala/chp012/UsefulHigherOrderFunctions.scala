package chp012

/**
 * Created by abegley on 04/08/2014.
 */
object UsefulHigherOrderFunctions {
  def main(args: Array[String]){
    (1 to 20).map("*" * _).foreach(println _)
  }

}
