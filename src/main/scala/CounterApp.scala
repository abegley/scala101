package main.scala

object CounterApp {
  def main(args: Array[String]){
    val myCounter = new Counter // or new Counter()
    myCounter.increment()   //Use () with mutator
    println(myCounter.current) // myCounter.current //OK // myCounter.current() //OK //Don't use () with accessor
  }
}
