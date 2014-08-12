package techbites

/**
 * Created by Alan on 12/08/2014.
 */
object FunctionsAndMethods extends App {

  //to define a function, you specify the function's name, parameters, and body like this:
  def abs(x: Double) = if(x>0)x else -x
  println(abs(10))
  // without '=' just a procedure - remember return type is optional if non-recursive



  //Procedure - because procedures don't return any value, we omit the = symbol
  def box(s:String) {  //Look carefully: no '='    -- could use :Unit =
    val border = "-" * s.length + "---\n"
    println(border + "|" + s + "|\n" + border)
  }
  //println(box("wibble!"))



  //If the body of the function requires more than one expression, use a block. The last expression of the block becomes
  //the value that the function returns.  For example, the following function returns the value of r after the for loop.
  def fact(n : Int) = {
    var r = 1
    for (i <- 1 to n) r = r * i
    r
  }
  println(fact(5))



  //Recursively - recursive functions must specify a return type!
  def factRecur(n: Int) : Int = {
    if(n == 1)
      n
    else
      n * factRecur(n-1)
  }
  println(factRecur(5))                            //120




  //Useful Higher Order Functions    - collections framework has methods that take function parameters
  println("Useful Higher Order functions")
  def triple(number:Int) = number * 3
  Array(1,2,3,4,5).map(triple)          //3 6 9 12 15
  //map method accepts a function, in this instance triple, applies it to all values in the array, and returns an array with te function values



  //Anonymous functions
  println("Anonymous functions")
  //(parameter type) => resultType
  (x: Int) => 3 * x                   //same as triple function above

  //Store in a variable
  val tripleVal = (x: Int) => 3 * x

  (1 to 9).map("*" * _).foreach(println(_))

  //Functions with Function parameters
  def sum(func: (Int, Int) => Int ) = func(_,_)


  val numbers = List(1,2,3,4,5)                                             //List[Int] = List(1, 2, 3, 4, 5)
  val names = List("Alan", "Steph", "Henry")                                //List[String] = List(Alan, Steph, Henry)

  def sz(str:String) = str.size
  names.map(sz).foreach(println(_))

  //OR (with explicit return type)
  def sz1(str:String):Int = str.size
  names.map(sz1).foreach(println(_))

  // filter selects only elements that pass some predicate function:
  numbers.filter(_ < 4)                                                       //List[Int] = List(1, 2, 3)
  println()
  numbers.filter(_ < 4).foreach(println(_))
  numbers.filter(_ % 2 == 0)                                                  //List[Int] = List(2, 4)
  numbers.filter(n => n < 4 )                                                 //List[Int] = List(1, 2, 3)
  numbers.filterNot(n => n < 4)                                               //List[Int] = List(4, 5)

  // partition breaks a list into two lists, according to some predicate input function
  numbers.partition(n => n < 4 )                   //(List[Int], List[Int]) = (List(2, 4),List(1, 3, 5))

  println()
  // Ex 3: create a list containing the odd numbers from 1 to 25, with those divisible by 5 replaced by "fizz"
  1.to(25).filter(n => n % 2 != 0).map(n => if(n % 5 == 0) "fizz" else n).foreach(println(_))
  //scala.collection.immutable.IndexedSeq[Any] = Vector(1, 3, fizz, 7, 9
  //| , 11, 13, fizz, 17, 19, 21, 23, fizz)

  val oddNums = 1.to(25).filter(n => n % 2 != 0)                  //> oddNums  : scala.collection.immutable.IndexedSeq[Int] = Vector(1, 3, 5, 7,
  //| 9, 11, 13, 15, 17, 19, 21, 23, 25)

  oddNums.map(n => if(n % 5 == 0) "fizz" else n)                  //scala.collection.immutable.IndexedSeq[Any] = Vector(1, 3, fizz, 7, 9
  //| , 11, 13, fizz, 17, 19, 21, 23, fizz)

}

//Functions are first-class citizens that can be passed around and manipulated
// just like any other data types.   In a functional Language, you just wrap that detail
// into a function that you pass as parameter

//- Functions are first class citizens in scala
//- You can create anonymous functions, usually to give them to other functions
//- A function argument specifies behaviour that should be executed later
//- Many collection methods take function parameters, applying a function to the values of a collection
//- There are syntax shortcuts that allow you to express function parameters in a way that is short and easy to read
//- You can create functions that operate on blocks of code and look much like the built-in control statements
//
