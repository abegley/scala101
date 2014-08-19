package scratch

import scala.collection.mutable.ArrayBuffer

/**
 * Created by abegley on 19/08/2014.
 * You want to pass a function around like a variable, and while doing so, you want that function to be able to refer to one or more
 * fields that were in the same scope as the function when it was declared.
 *  Solution
 *    To demonstrate a closure in Scala, use the following simple (but complete) example:
 */
object ClosureExample extends App {
  var hello = "Hello"
  def sayHello(name:String) { println(s"$hello, $name")}

  //execute sayHello from the exec method foo
  val foo = new otherscope.Foo
  foo.exec(sayHello, "Alan")
  //change the local variable 'hello', then execute sayHello from
  //the exec method of foo, and see what happens
  hello="Hola"
  foo.exec(sayHello,"Lorenzo")

  var votingAge = 18
  val isOfVotingAge = (age:Int) => age >= votingAge
  isOfVotingAge(16) //false
  isOfVotingAge(20) //true

  def printResult(f:Int => Boolean, x:Int){
    println(f(x))
  }

  printResult(isOfVotingAge, 18)
  votingAge = 21
  printResult(isOfVotingAge, 18)
  printResult(isOfVotingAge, 21)

  val fruits = ArrayBuffer("apple")
  //the function addToBasket has a reference to fruits
  val addToBasket = (s:String) => {
    fruits += s
    println(fruits.mkString(", "))
  }
  //the addToBasket function can now be passed around as desired and will always have a reference to the fruits field

  def buyStuff(f: String => Unit, s:String){
    f(s)
  }
  buyStuff(addToBasket, "cherries")
  buyStuff(addToBasket, "grapes")

  println(fruits.mkString(", "))





}

package otherscope {
  class Foo {
    //a method that takes a function and a string, and passes the string into
    //the function, and then executes the function
    def exec(f:(String) => Unit, name: String){
      f(name)
    }
  }
}

//Notes:
//If you’re coming to Scala from Java or another OOP language, you might be
//asking, “How could this possibly work?” Not only did the sayHello
//method reference the variable hello from within the exec method of
//the Foo class on the first run (where hello was no longer in scope),
//but on the second run, it also picked up the change to the hello
//variable (from Hello to Hola). The simple answer is that Scala supports
//closure functionality, and this is how closures work.

