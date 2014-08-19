package scratch

/**
 * Created by abegley on 19/08/2014.
 * Scala Cookbook: Recipes for Object-Oriented and Functional
 *
 * You want to use an anonymous function — also known as a function literal —
 * so you can pass it into a method that takes a function, or to assign it to a variable.
 *
 *
 */
object FunctionLiteral extends App {

  //Given the List:
  val x = List.range(1,10)

  //you can pass an anonymous function to the List's filter method to create a new List that contains only even numbers:
  val evens = x.filter((i:Int) => i % 2 == 0).foreach(println(_))

  //The following code is a function literal (also known as an anonymous function)
  (i:Int) => i % 2 == 0

  //Although the above code works, it shows the most explicit form for defining a function literal. Thanks to several
  //Scala shortcuts, the expression can be simplified to this:

  val moreEvens = x.filter(_ % 2 == 0).foreach(println(_))

  //Discussion
  //In this example, the original function literal consists of the following code:
  (i:Int) => i % 2 == 0

  //When examining this code, it helps to think of the => symbol as a transformer, because the expression
  //transforms the parameter list on the left side of the symbol (an Int named i) into a new result using the algorithm
  //on the right side of the symbol (in this case case, an expression that results in a Boolean)
  //val evens = x.filter((i:Int) => i % 2 == 0)

  //As mentioned, this example shows the long form for defining an anonymous function, which can be
  //simplified in several ways

  //Because the Scala compiler can infer from the expression that i is an Int, the Int declaration can be dropped off:
  val moreEvens1 = x.filter(i => i % 2 == 0)

  //Because Scala lets you use the _ wildcard instead of a variable name when the parameter appears only once in your
  //function, this code can be simplified even more
  val moreEvens2 = x.filter(_ % 2 == 0)

  //In other examples, you can simplify your anonymous functions further. For instance, beginning with the most explicit form, you can print
  //each element in the list using this anonymous function with the foreach method:
  x.foreach((i:Int) => println(i))

  //As before, the Int  declaration isn't required:
  x.foreach((i) => println(i))

  //Because there is only one argument, the parentheses around the i parameter aren't needed:
  x.foreach(i => println(i))

  //Because i is used only once in the body of the function, the expression can be further simplified with the _ wildcard
  x.foreach(println(_))

  //Finally, if a function literal consists of one statement that takes a single argument, you need not explicity name
  //and specify the argument, so the statement can finally be reduced to this:
  x.foreach(println)



}
