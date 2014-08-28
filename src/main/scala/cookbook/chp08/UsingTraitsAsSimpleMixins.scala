package main.scala.cookbook.chp01

/**
 * Created by Alan on 28/08/2014.
 * Problem:  You want to define a solution where multiple traits can be mixed into a class to provide a robust design
 */
object UsingTraitsAsSimpleMixins extends App {
  //To implement a simple mixin, define the methods you want in your trait, then add the trait to your class using
  // extends or with.  For instance, the following code defines a Tail trait:

  trait Tail {
    def wagTail {println("tail is wagging")}
    def stopTail {println("tail is stopped")}
  }

  //You can use this trait with an abstract Pet class to create a Dog:
  abstract class Pet (var name: String){
    def speak             //abstract
    def ownerIsHome       {println("excited")}
    def jumpForJoy        {println("jumping for joy")}
  }

  class Dog (name: String) extends Pet (name) with Tail {
    def speak {println("woof")}
    override def ownerIsHome {
      wagTail
      speak
    }
  }

  val doggy:Pet = new Dog("Alan")
  doggy.ownerIsHome
  doggy.jumpForJoy

  //In summary, the 'Dog' class gets behavior from both the abstract Pet class and the Tail trait; this is something
  //you can't do in Java
}
