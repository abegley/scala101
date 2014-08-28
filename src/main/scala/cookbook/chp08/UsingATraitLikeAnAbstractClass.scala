package main.scala.cookbook.chp01

/**
 * Created by Alan on 28/08/2014.
 * Problem:  You want to use a trait as something like an abstract class in Java.
 */
class UsingATraitLikeAnAbstractClass {
  //Define methods in your trait just like regular Scala methods. In the class that extends the trait,
  //you can override those methods or use them as they are defined in the trait.

  //In the following example, an implementation is provided for the speak method in the Pet trait,
  //so implementing classes don’t have to override it. The Dog class chooses not to override it,
  //whereas the Cat class does:

  trait Pet {
    def speak {println("Yo")}             //concrete implementation
    def comeToMaster                      //abstract Method
  }

  class Dog extends Pet {
    //don't need to implement 'speak' if you don't need to
    def comeToMaster { ("I'm coming")}
  }

  class Cat extends Pet {
    //override the speak method
    override def speak { ("meow")}
    def comeToMaster { ("That's not gonna happen.")}
  }

  //if a class extends a trait without implementing its abstract methods, it must be defined as abstract.
  abstract class FlyingPet extends Pet {
    def fly { ("I'm flying")}
  }

  //Discussion
  //Although scala has abstract classes, it's much more common to use traits than abstract classess to implement base
  //behaviour.  A class can extend only one abstract class, but it can implement multiple traits, so using traits is more
  //flexible.

  //Food for thought
  //Like Java, you use super.foo to call a method named foo in an immediate superclass.  When a class mixes in
  //multiple traits - and those traits implement a method declared by a common ancestor - you can be more specfic and
  //specify which trait you'd like to invoke on.

  //Use an abstract class (a) when you want to define a base behavior, and that behavior requires a constructor with
  //parameters, and (b) in some situations when you need to interact with Java.)



}
