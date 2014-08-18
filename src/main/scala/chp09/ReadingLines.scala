package chp09

import scala.io.Source

/**
 * Created by Alan on 18/08/2014.
 */
object ReadingLines extends App {
   val nasdaq100 = Source.fromFile("src/main/resources/nasdaq100list.csv", "UTF-8")
    //The first argument can be a string or a java.io.File
    //You can omit the encoding if you know that the file uses
    //the default platform encoding
 // val lineIterator = nasdaq100.getLines()
 // for(line <- lineIterator) println(line)
 // nasdaq100.close()

  //Or you can put the lines into an array or array buffer by applying
  //the toArray or toBuffer method to the iterator
  println()
  println("From array")
  val lines = nasdaq100.getLines.toArray
  lines.map(println(_))
  nasdaq100.close()


}
