package chp09

import scala.io.Source

/**
 * Created by Alan on 18/08/2014.
 */
object ReadingCharacters extends App {

  val source = Source.fromFile("src/main/resources/nasdaq100list.csv", "UTF-8")
  val iter = source.buffered
  /*while(iter.hasNext){
    if(iter.head)
      iter.next()
    else
      println(iter.length)
  }*/

  val contents = source.mkString
  source.close()
  println(contents)

}
