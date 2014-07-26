package main.scala.chp02

/*
NOTES:
    - a semicolon is never required if it falls just before the end of the line.
    - a semicolon is REQUIRED if you want to have more than one statement on a single line, must be seperated with semicolons
 */

object StatementTermination {
  def main (args: Array[String]){
    var n = 1
    var r = 2
    //semicolon required
    if(n > 0) {r = r * n ; n -= 1 }
  }

}
