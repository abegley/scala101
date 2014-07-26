package main.scala.chp02

/*
  NOTES:
    - Scala has the same while and do loops as Java and C++
    - Scala has no direct analog of the for(initialize; test; update) loop.
    - In Scala, loops are used as often in other languages, you can often process the values in a sequence by applying
    a function to all of them, which can be done with a single method call.
    - Scala has no break or continue statements to break out of a loop
 */
object Loops {

  def main(args: Array[String]){

    var r = 2;
    var n = 4;
    var counter = 0

    val result = while (n > 0){
      r = r * n;
      n -= 1
      counter += 1
    }
    println(result)  //result is () because of the n -= 1 assignment, assignment expressions return value Unit
    println(r)
    println(n)
    println(counter)

    //#######
    //No for(initialize; test; update) loop. Use a while loop or for loop, for(i <- expr)
    r = 2
    n = 4
    for (i <- 1 to n) //remember, you can write 1.to(n)
      println(r*i)

    //########
    //When traversing a string or array, you often need a range from 0  to n-1. Use the 'until' method instead of the
    //'to' method.  It returns a range that doesn't include the upper bound.
    val s = "Hello"
    var sum = 0
    for (i <- 0 until s.length)  //last value for i is s.length -1
    {
      println(s(i))
      sum += s(i)
    }
    println(sum)

    //Or loop over the character
    sum = 0
    for(ch <- "Hello") sum += ch

  }

}
