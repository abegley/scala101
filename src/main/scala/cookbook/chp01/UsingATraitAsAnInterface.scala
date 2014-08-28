package main.scala.cookbook.chp01

/**
 * Created by Alan on 28/08/2014.
 */
object UsingATraitAsAnInterface extends App{
  //The term 'mixed in' is also used when extending a single object instance with a trait, like this:
  val f = new Foo with Trait1
}
trait Foo {}
trait Trait1{}

trait BaseSoundPlayer {
  def play
  def close
  def pause
  def stop
  def resume
}
//If the methods don't take any argument, you only need to declare the names of the methods after the def
//keyword, as shown above.  If a method should require parameters, list them as usual:
trait Dog {
  def speak(whatToSay: String)
  def wagTail(enabled: Boolean)
}

//When a class extends a trait, it uses the 'extends' and 'with' keywords.  When extending one trait, use extends:
//Unless the class implementing a trait is abstract, it must implement all of the abstract trait methods
class MP3Player extends BaseSoundPlayer {
  override def play: Unit = {}

  override def stop: Unit = {}

  override def pause: Unit = {}

  override def close: Unit = {}

  override def resume: Unit = {}
}

//When extending a class and one or more traits, use extends for the class, and with for subsequent traits:
//class Foo extends BaseClass with Trait1 with Trait2

//When a class extends multiple traits, use extends for the first trait, and with for subsequent traits:
//class Foo extends Trait1 with Trait2 with Trait3 with Trait4 ........

abstract class Animal {
  def speak
}

trait WaggingTail {
  def startTail { println("tail started")}
  def stopTail {println("tail stopped")}
}

trait FourLeggedAnimal {
  def walk
  def run
}
//When a class has multiple traits, such as the WaggingTail and FourLeggedAnimal traits in this example, those
//traits are said to be mixed in to the class.
class BigDog extends Animal with WaggingTail with FourLeggedAnimal {
  def speak { println("Dog says 'woof'")}
  def walk { println("Dog is walking")}
  def run { println("Dog is running")}
}


