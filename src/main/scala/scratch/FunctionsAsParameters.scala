package scratch

/**
 * Created by abegley on 19/08/2014.
 * Recipe 9.3 You want to pass a function around like a variable, just like
 * You want to create a method that takes a simple function as a method parameter
 *  Solution
 *    1. Define your method, including the signature for the function you want to take as a method parameter.
 *    2. Define one or more functions that match this signature
 *    3. Sometime later, pass the function(s) as a parameter to your method.
 */
object FunctionsAsParameters extends App {

  //1.
  //executeFunction takes a function as a parameter.  The method will take one parameter named callback, which is a function. That
  //function must have no input parameters and must return nothing:
  def executeFunction(callback: () => Unit){
    callback()
  }

  //the callback() syntax defines a function that has no parameters
  //The => Unit portion of the code indicates that this method returns nothing

  //2.
  val sayHello = () => {println("Hello")}

  //3.
  executeFunction(sayHello)

  //Discussion
  //There isn’t anything special about the callback name used in this example.
  //When I first learned how to pass functions to methods, I preferred the name
  //callback because it made the meaning clear, but it’s just the name of a
  //method parameter. These days, just as I often name an Int parameter i, I name a function parameter f:
  def executeFunction1(f:() => Unit){
    f()
  }

  //The part that is special is that the function that's passed in must match the function signature you define.
  //In this case, you've declared that the function that's passed in must take no arguments and must return nothing:
  //f:() => Unit

  //The general syntax for defining a function as a method parameter is :
  //parameterName: (parameterType(s)) => returnType

  //Scala;s call-by-name functionality provides a very simple way to pass a block of code into a functionor method. See Recipe 19.8

}
