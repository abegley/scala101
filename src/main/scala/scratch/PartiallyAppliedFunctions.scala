package scratch

/**
 * Created by abegley on 20/08/2014.
 * Scala Cookbook: Recipes for Object-Oriented and Functional
 * Recipe 9.6 Using partially applied functions
 * You want to eliminate repetitively passing variables into a function by (a) passing common variables into
 * the function to (b) create a new function that is preloaded with those values, and then (c) use the new
 * function, passing it only the unique variables it needs.

 */
object PartiallyAppliedFunctions extends App {
  //The classic example of a partially applied function begins with a simple sum function
  val sum = (a: Int, b:Int, c:Int) => a + b + c

  //There is nothing special about this sum function, it’s just a normal function. But
  //things get interesting when you supply two of the parameters when calling
  //the function, but don’t provide the third parameter:
  val f = sum (1,2, _:Int)

  //Because you haven’t provided a value for the third parameter, the resulting
  //variable f is a partially applied function.
  //res0: f: Int = > Int = < function1 >
  //The res0 result shows that f is a function that implements the function1 trait,
  //meaning that it takes one argument. Looking at the rest of the signature,
  //you see that it takes an Int argument, and returns an Int value.

  //When you give f an Int, such as the number 3, you magically get the sum
  //of the three numbers that have been passed into the two functions:
  val result = f(3)
  println(result)

  //The first two numbers (1 and 2) were passed into the original sum function;
  //that process created the new function named f, which is a partially applied function;
  //then, some time later in the code, the third number (3) was passed into f.





}
