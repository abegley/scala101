package scratch

/**
 * Created by abegley on 19/08/2014.
 * Recipe 9.2 You want to pass a function around like a variable, just like
 * you pass String, Int, and other variables around in an object-oriented programming language.
 */
object FunctionsAsVariables extends App {
  //The following code defines a function literal that
  //takes an Int parameter and returns a value that is twice the amount of the Int that is passed in:
  (i:Int) => {i * 2}

  //As mentioned in Recipe 9.1 , you can think of the = > symbol as a transformer. In this case, the
  //function transforms the Int value i to an Int value that is twice the value of i.
  //You can now assign that function literal to a variable:
  val double = (i:Int) => {i * 2}

  //The variable double is an instance, just like an instance of a String, Int, or other type, but in this
  //case, it's an instance of a function, known as a 'function value'.  You can not invoke double just like
  //you'd call a method:
  double(5)   //10
  double(10)  //20

  //Beyond just invoking double like this, you can also pass it to any method (or function) that takes a function
  //parameter with its signature. For instance, because the map method of a sequence is a generic method that
  //takes an input parameter of type A and returns a type B, you can pass the double method into the map
  //method of an Int sequence.
  val list = List.range(1,5)
  println("elements in list")
  list.foreach(println(_))
  println("elements in list doubled")
  list.map(double).foreach(println(_))

  //Discussion
  //You can declare a function literal in at least two different ways.
  //I generally prefer the following approach, which implicitly infers that the following function’s return type is Boolean:
  val f = (i:Int) => {i % 2 == 0 }

  //In this case, the Scala compiler is smart enough to look at the body of the function and determine that it returns a Boolean value.
  //As a human, it’s also easy to look at the code on the right side of the expression and see that it returns a Boolean,
  //so I usually leave the explicit Boolean return type off the function declaration. However, if you prefer to
  //explicitly declare the return type of a function literal, or want to do so because your function is more complex,
  //the following examples show different forms you can use to explicitly declare that your function returns a Boolean:

  val f1: (Int) => Boolean = i => { i % 2 == 0}
  val f2: Int => Boolean = i => { i % 2 == 0}
  val f3: Int => Boolean = i => i % 2 == 0
  val f4: Int => Boolean = _ % 2 == 0

  //A second example helps demonstrate the difference of these approaches. These functions all take two Int parameters
  //and return a single Int value, which is the sum of the two input values:

  //implicit approach
  val add1 = (x: Int, y:Int) => {x + y}
  val add2 = (x:Int, y:Int) => x + y

  //explicit approach
  val add3: (Int,Int) => Int = (x,y) => {x +y}
  val add4: (Int, Int) => Int = (x,y) => x+y

  //As shown, the curly braces around the body of the function in these simple examples are optional, but they are required
  //when the function body grows to more than one expression:
  val addThenDouble: (Int, Int) => Int = (x,y) => {
    val a = x + y
    2 * a
  }

  //Scala is very flexible, and just like you can define an anonymous function and assign it to a variable,
  //you can also define a method and then pass it around like an instance variable. Again using a modulus example, you
  //can define a method in any of these ways:
  def modMethod1(i:Int) = i % 2 == 0
  def modMethod2(i:Int) = { i % 2 == 0}
  def modMethod3(i:Int): Boolean = i % 2 == 0
  def modMethod4(i:Int): Boolean = { i % 2 == 0}

  val list1 = List.range(1,10)
  list1.filter(modMethod1).foreach(println(_))

  //As noted, this is similar to the process of defining a function literal and assigning it to a variable.
  //The following function works just like the previous method:
  val modFunction = (i:Int) => i % 2 == 0
  list.filter(modFunction)

  //At a coding level, the obvious difference is that modMethod is a method defined in a class, whereas modFunction
  //is a function that's assigned to a variable.  Under the covers, modFunction is an instance of the Function1
  //triat, which defines a function that takes one argument.  (The scala package defines other similiar traits,
  //including Function0, Function2, and so on, up to Function22.)

  //Assigning an existing function/method to a function variable
  val c1 = scala.math.cos _
  val c2 = scala.math.cos(_)  //same as above? Need to confirm

  //This is called a partially applied function.  It's partially applied because the cos method requires one argument,
  //which you have not yet supplied
  //Now that you have c(1,2), you can use it just like you would have used cos:
  c1(0)   //res0:  Double = 1.0

  //The following example shows how to use this same technique on the scala.math.pow method, which takes two parameters:
  val p = scala.math.pow(_,_)
  p(scala.math.E, 2)    //res0: Double = 7.389056098930


  //####Summary notes#####
  //Think of the => symbol as a transformer.  It transforms the input data on its left side to some new output data,
  //using the algorithm on its right side.

  //Use def to define a method, use val to define a function

  //When assigning a function to a variable, a function literal (anonymous function) is the code on the right side of the
  //expression.

  //A funtion value is an object, and extends the FunctionalN traits in the main scala package such as Functon0 for
  //a function that takes no parameters.




}
