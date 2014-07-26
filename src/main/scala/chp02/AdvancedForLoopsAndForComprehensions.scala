package main.scala.chp02

/*
  NOTES:
    - you can have multiple generators of the form 'variable <- expression'. Separate them by semi colons
 */
object AdvancedForLoopsAndForComprehensions {
  def main (args: Array[String]){

    for (i <- 1 to 3; j <- 1 to 3) print((10 * i + j) + " ")

    //Each generator can have a 'guard', a Boolean condition preceded by if:
    for(i <- 1 to 3; j <- 1 to 3 if i!=j) print((10 * i + j) + " ")
    //Note there is no semi-colon before the if

    //You can have any number of definitions, introducing variables that can be used inside the loop:
    for(i <- 1 to 3; from = 4 - i; j <- from  to 3) print((10 * i + j) + " ")

    //When the body of the for loop starts with yield, then the loop constructs a collection of values,
    //one for each iteration
    for (i <- 1 to 10) yield i % 3
      // Yields Vector(1,2,0,1,2,0,1,2,0,1)
    //This type of loop is called a for comprehension

    //The generated collection is compatible with the first generator.
    for(c <- "Hello"; i <- 0 to 1) yield (c + i).toChar
      //Yields "Hieflmlmop"
    for(i <- 0 to 1; c <- "Hello") yield(c + i).toChar
      //Yields Vector('H', 'e', 'l', 'l', 'o', 'I', 'f', 'm', 'm', 'p')


  }

}
