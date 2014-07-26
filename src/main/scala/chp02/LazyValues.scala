package main.scala.chp02

/**
 *  NOTES:
 *    - When a val is declared as lazy, its initialization is deferred until it is accessed for the first time.
 *    - Laziness is not cost-free. Every time a lazy value is accessed, a method is called that checks, in a threadsafe
 *    manner , whether the value has already been initialized.
 *
*/
object LazyValues {
  def main (args: Array[String]){
    //val words = scala.io.Source.fromFile()
    //evaluated as soon as words is defined

    //lazy val words = scala.io.Source.fromFile()
    //evaluated the first time words is used

    //def words = scala.io.Source.fromFile
    //Evaluated every time words is used

  }


}
