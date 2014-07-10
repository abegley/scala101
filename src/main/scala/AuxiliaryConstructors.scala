package main.scala

/**
 In summary,
 -  Scala class can have many contructors
  - Primary constructor
  - AuxiliaryConstructors - called 'this' - must start with a call to a previously defined auxiliary constructor
    or the primary constructor.
 */

//class with two auxiliary constructors
class AuxiliaryConstructors {
  private var name = "" //private keyword, getter and setter are private
  private var age = 0

  def this(name: String){ //Auxiliary constructor
    this() //Calls primary constructor
    this.name = name
  }

 def this(name: String, age: Int){ //Another auxiliary constructor
    this(name)
    this.age = age
 }
}

object AuxiliaryConstructorsApp{
  def main(args: Array[String]){
    val auxConstructor1 = new AuxiliaryConstructors("Alan",30)
    val auxConstructor2 = new AuxiliaryConstructors("Stephanie")

    val primaryConstructor = new AuxiliaryConstructors()

  }
}