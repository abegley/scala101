package coursera

object ex1 extends App {

    //Higher Order functions
    //These are functions that take a function as a parameter or return functions

  //sum() returns a function that takes two integers and returns an integer
  def sum(f: Int => Int): (Int, Int ) => Int ={
    def sumf(a: Int, b:Int): Int ={ a + b}
    sumf
  }

  //same as above.  Its type is (Int => Int) => (Int, Int) => Int
 // def sum(f:Int => Int)(a: Int, b:Int): Int = {a + b}

  //Called like this
  sum((x:Int) => x * x * x)                       //anonymous function, i.e. does not have a name
  sum(x => x * x * x)                             //Same anonymous function with type inferred

  def cube(x: Int) = x * x * x
  val result1 = sum(x => x * x * x)(1, 10)        //sum of cubes from 1 to 10
  val result2 = sum(cube)(1,10)                   //same as above

  println("result1="+result1)
  println("result2="+result2)

  class MyClass(x:Int,y:Int ){                  //Defines a new type MyClass with a constructor
    require(y > 0, "y must be positive")        //precondition, triggering an IllegalArgumentException if not met
    def this (x: Int) = {this(x, 10)}           //auxiliary constructor
    def nb1 = x                                 // public method, computed everytime it is called
    def nb2 = y
    private def test(a:Int):Int = {             //private method
      a*a
    }
    val nb3 = x + y                             //computed only once
    override def toString = nb1 + ", " + nb2    //overridden method
  }

  //Create a new object of type
  new MyClass(1,2) //creates a new object of type

  //'this' references the current object, 'assert(<condition>)' issues AssertionError if condition is not met.
  // See scala.Predef for 'require', 'assume' and 'assert'

  val result = sum((x:Int) => x * x * x ) (2, 10)
  println(result)

  //Operators
  //'myObject myMethod 1' is the same as calling 'myObject.myMethod(1)'
  val result3 = 1.to(100)
  val result4 = 1 to 100
  //operator (i.e. function) names can be alphanumeric, symbolic (e.g. x1, *, +?%&, vector_++, counter_=)
  //associativity of an operator is determined by its last character.  Right-associative if ending with ':' Left-associative otherwise

  //Class Hierarchies

  //Apply method
  //Scala has special "apply" syntax: if you write a symbol name followed by an argument list in parentheses (or just a pair of
  //parentheses for an empty argument list), Scala converts that into a call to the apply method for the named object.
  //Scala converts that into a call to the apply method for the named object. When we create a variable whose value is a
  //function object and we then reference that variable followed by parentheses, that gets converted into a call to the apply method of the function object.

}
