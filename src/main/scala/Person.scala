package main.scala

class Person {
  private var privateAge = 0

  def age = privateAge
  def age_=(newValue: Int){
    if(newValue > privateAge) privateAge = newValue; //Can't get younger
  }

  def main(args: Array[String]){
    val fred = new Person
    fred.age = 30
    fred.age = 21
    println(fred.age)//30
  }
}
