package instilSOC


object ex2 extends App {
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

  // ex2: write a class to represent a cube with a volume method
  case class Cuboid(h: Float,
                    w:Float,
                    d:Float){
    def volume = h * w *d
  }

  println(Cuboid(5,5,5).volume)

  println(Cuboid(h = 6, w = 6, d =6).volume)

}
