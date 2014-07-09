package main.scala

class Counter {
  private var value=0  //must initialize the field
  def increment(){   //methods are public by default
    value+=15
  }
  def current()=value
}
