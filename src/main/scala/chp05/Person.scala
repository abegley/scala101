package main.scala

import scala.beans.BeanProperty

class Person {
  private var privateAge = 0

  @BeanProperty var name: String = _
  //The above field generates four methods
  //1. name: String
  //2. name_=(newValue: String): Unit
  //3. getName(): String
  //4. setName(newValue: String): Unit

  def age = privateAge
  def age_=(newValue: Int){
    if(newValue > privateAge) privateAge = newValue; //Can't get younger
  }
}

object PersonApp {
  def main(args: Array[String]){
    val fred = new Person
    fred.age = 30
    fred.age = 21
    println(fred.age)  //30
  }
}
