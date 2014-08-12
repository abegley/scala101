package techbites

//objects, classes and companion objects
//*use objects for singletons and utility methods (scala has no static methods or fields)
//*can extend classes or traits
//*the apply method of an object is usually used for constructing new instances

//	Semi colons, only needed if you need to put two expressions on the same line.
// ': Unit 'optional return type
// '' if you leave out equals sign, implies nothing is returned – known as procedures in Scala
object program {
    def main(args: Array[String]) : Unit = {
      println("Hello World")
    }
}

//To avoid the main method, use an object that extends the App trait
// 'extends App' – trait, think interfaces that allow concrete implementations – allows behaviours to be mixed in
// ''
object programWithApp extends App{
    println("Hello again!")
}

//*****Classes

//Fields in classes automatically come with getters and setters
//One primary constructor - interwoven with the class definition, can have 1:N auxiliary constructors
//Auxiliary constructors are optional.
//They are called 'this' - must call previously defined aux constructor OR primary constructor

class Person {            //parameterless primary constructor
  var age = 0             //private age field, getter and setter
  val name = "Alan"       //private name field, getter only
}


object Classes extends App {
  // class declaration, constructor, val modifier to get getter, var modifier to get setter
  class Circle(var radius: Float,val xPos: Float, yPos: Float ){
    def area = scala.math.Pi * radius * radius
  }

  // replaces ~40 lines of equivalent Java code, with 3 - probably easier to read too

  // create an instance and use it
  var c = new Circle(10, 5, 5)
  println(c.area)                           //> 314.1592653589793
  println(c.radius)                         //> 10.0
  println(c.radius = 20)                    //> ()
  println(c.area)                           //> 1256.6370614359173

  //c.xPos = 10 not allowed
  //c.yPos no visibility - appears private

  /*
  Circle companion object
   */
  // for declaring singletons
  // equivalence to static in Java
  // companion object naming convention
  object Circle {
    def perimeter(circ: Circle) = circ.radius * 2 * scala.math.Pi

    //Special status of apply method
    def apply(r: Float) = new Circle(r, 0, 0)  //factory method
  }

  // can collect functions separately from data, or have them as methods in a class
  Circle.perimeter(c)                           //> 1256.6370614359173

  // special call to apply method
  Circle(3).area                       //> 28.274333882308138



  case class Sphere(radius: Float, xPos:Float, yPos:Float, zPos:Float)
  val s = Sphere(1.5f, 50, 50, 50)
  // case classes are a handy sort of class
  // constructor args are vals by default (automatic getters)
  // automatic equals and hashcode methods based on constructor args
  // don't have to write new
  // can "pattern match" on them

}


