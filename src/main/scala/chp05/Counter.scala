package main.scala

class Counter {
  private var value=0  //var - must initialize the field
  private[this] var restrictedValue = 0; //Accessing someObject.value is not allowed
  def increment(){   //methods are public by default
    value+=15
  }
  def current()=value

  def isLess(other: Counter) = value < other.value //Can access private field of other object
  //Note, the method above cannot access restrictedValue, see object-private
}
