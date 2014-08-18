package chp09

import scala.io.Source

/**
 * Created by Alan on 18/08/2014.
 */
object ReadingFromURLsAndOtherSources extends App{
  val source1 = Source.fromURL("http://propertypal.com", "UTF-8")
  val source2 = Source.fromString("Hello, World!")
  //Reads from the given string - useful for debugging

  //val source3 = Source.stdin
  val hackerNewsAsAString = source1.mkString
  println(hackerNewsAsAString)

}
