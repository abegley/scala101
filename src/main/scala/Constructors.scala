package main.scala

/**
 In summary,
 -  Scala class can have many contructors
  - Primary constructor - not defined with 'this'.  Instead, it is interwoven with the class definition.
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

//The parameters of the primary constructor are placed immediately after the class name
//Notes:  Parameters of the primary constructor turn into fields that are initialized with the construction parameters.
//The parameters 'name' and 'age' become fields of the PrimaryConstructor class
class PrimaryConstructor(val name: String, val age : Int){
  println("Just called primary constructor")
  def description = name + " is " + age + " years old"
}

object PrimaryConstructorApp{
  def main(args: Array[String]){
    println(new PrimaryConstructor("Alan", 30).description)
  }
}
