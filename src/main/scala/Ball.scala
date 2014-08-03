package main.scala

/**
 * Example showing the usage of traits
 */
class Ball {
  def properties():  List[String] = List()
  override def toString() = "It's a " + properties.mkString(" ", ", ", " ") + "ball"
}

trait Red extends Ball {
  override def properties() = super.properties ::: List("red")
}

trait Shiny extends Ball {
  override def properties() = super.properties() ::: List("Shiny")
}

object Balls {
  def main(args: Array[String]){}
  val myBall = new Ball with Shiny with Red
  println(myBall)
}
