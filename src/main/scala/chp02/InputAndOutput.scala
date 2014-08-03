package main.scala.chp02

import scala.io.Source._

/*
NOTES:

 */
object InputAndOutput {
  def main(args: Array[String]){}
    printf("Hello, %s! You are %d years old.\n", "Fred", 42)

    val name = readLine("Your Name: ")
    print("Your age: ")
    val age = readInt()
    printf("Hello, %s! Next year, you will be %d.\n", name, age +1)
}
