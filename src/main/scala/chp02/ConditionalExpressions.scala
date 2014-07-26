package main.scala.chp02

/*
NOTES:
    - In Scala, if/else construct has a value - the value of the expression that follows the if or else
    - No switch statment in Scala - see pattern matching
 */
object ConditionalExpressions {
  def main(args: Array[String]){
    var x = 1

    if(x > 0){
      1
    }
    else{
      -1
    }
    //previous expression has a value of 1 or -1, depending on the value of x.

    //Thus, you can write
    val y = if(x>0)1 else -1
    println(y)
    x = -1
    val z = if(x>0) 1 else -1
    println(z)

    //mixed type expression
    if(x > 0) "positive" else -1  //common supertype called Any

    //without else, possible if statment yields no value
    if (x > 0) 1
    //However, in Scala every expression is supposed to have some value.This is finessed by introducing a class Unit
    //that has one value, written as ().  The if statement without an else is equivalent to
    if(x > 0) 1 else ()
    //above emits compiler warning
    //Warning:(34, 15) a pure expression does nothing in statement position; you may be omitting necessary parentheses
    //if(x > 0) 1 else ()
    //^

    //Think of () as a placeholder for "no useful value", and think of Unit as the analog of void in Java or C++
    //void has no value, whereas Unit has one value that signifies "no value"
  }


}
