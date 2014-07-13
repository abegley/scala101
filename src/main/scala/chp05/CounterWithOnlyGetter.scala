package main.scala

/*
In summary, Scala offers four choices for implementing properties:
1. var foo: Scala synthesizes a getter and a setter
2. val foo: Scala synthesizes a getter
3. Define methods foo and foo_=.
4. Define a method foo

Notes:  Scala cannot have a property with a setter and no getter
Remember, a 'field' in Scala is a private field together with a getter (for a val field)
or a getter and a setter (for a var field).
 */

class CounterWithOnlyGetter {
  val timeStamp = new java.util.Date  //val - private final field and a getter method, but no setter
  private var value = 0;
  def increment() {
    value += 1
  }
  def current = value //No () in declaration, see Counter.scala, def current()=value
  //The method above must be called without parentheses
  //val counterValue = myCounter.current //Calling myCounter.current() is a syntax error
}

object CounterWithOnlyGetterApp{
  def main(args: Array[String]){
   val counter = new CounterWithOnlyGetter()
   counter.increment()
   println(counter.current)  //remember counter.current() is a syntax error
  }
}
