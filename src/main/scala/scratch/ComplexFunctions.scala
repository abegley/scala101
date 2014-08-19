package scratch

/**
 * Created by abegley on 19/08/2014.
 * You want to define a method that takes a function as a parameter, and that function may have one or more input parameters
 * and may also return a value.
 */
object ComplexFunctions extends App{
  def exec (callback: Int => Unit){
    //invoke the function we were given, giving it an Int parameter
    callback(1)
  }

  val plusOne = (i:Int) => {println(i+1)}
  exec(plusOne)

  //Any function that matches the signature can be passed into the exec method.
  val plusTen = (i:Int) => {println(i+10)}
  exec(plusTen)

  //Although these examples are simple, you can see the power of the technique: you
  //can easily swap in interchangeable algorithms. As long as your function signature
  //matches what your method expects, your algorithms can do anything you want.
  //This is comparable to swapping out algorithms in the OOP Strategy design pattern.

  //Discussion
  //The general syntax for describing a function as a method parameter is this:
  //parameterName: (parameterType(s)) => returnType

  //Therefore, to define a function that takes a String and returns an Int, use one of these two
  //signatures
  //executeFunction(f:(String) => Int)
  //executeFunction(f:String => Int)

  //To define a function that takes two Ints and returns a Boolean, use this signature:
  //executeFunction(f:(Int,Int) => Boolean)

  //To define a function that takes String, Int, Double parameters and returns a Seq[String]
  //executeFunction(f:(String, Int, Double) => Seq[String])

  //Passing a function in with regualur parameters

  val sayHello = () => println("Hello")
  def executeTimes(callback:() => Unit, numTimes: Int){
    for (i <- 1 to numTimes) callback()
  }
  executeTimes(sayHello, 3)

  //Though that was a simple example, this technique can be used to pass variables into the method that can then
  //be used by the function, inside the method body. To see how this works, create a method named
  //executeAndPrint that takes a function and two Int parameters:

  def executeAndPrint(f:(Int,Int) => Int, x: Int, y: Int ){
    val result = f(x,y)
    println(result)
  }

  val sum = (x: Int, y: Int) => x + y
  val multiply = (x:Int, y:Int) => x * y
  executeAndPrint(sum, 10, 25)
  executeAndPrint(multiply, 5,5)
}
