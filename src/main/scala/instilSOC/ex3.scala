package instilSOC

object ex3 extends App {
  // Collections - lists, sets, maps

  // note apply method on List companion object
  // note polymorphism

  val nums = List(1,2,3,4,5)                    //List[Int] = List(1, 2, 3, 4, 5)
  val strs = List("abc", "def", "ghijk")        //List[String] = List(abc, def, ghijk)
  List()                                        //List[Nothing] = List()
  1.to(20)                                      //scala.collection.immutable.Range.Inclusive = Range(1, 2, 3, 4, 5, 6, 7
                                                //| , 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20)
  1 to 20                                       //same as above

  Set(1,1,2,2,2,2,2)                            //scala.collection.immutable.Set[Int] = Set(1, 2)

  Map("a" -> 1, "b" -> 2, "c" -> 3)             //scala.collection.immutable.Map[String,Int] = Map(a -> 1, b -> 2, c ->
                                                //| 3)

  // discuss immutable collections at this point?

  // contrast with Java equivalent

  // Lambdas (small,pure, anonymous functions) and Higher Order Functions

  // map (verb not noun) applies the function you supply to all elements of the collection to create a new collection

  strs.map(_.size)                              //List[Int] = List(3, 3, 5)
  strs.map(_.size).foreach(println(_))
  strs.map(_.contains("abc")).foreach(println(_))

  //OR
  strs.map(s => s.size)                         //List[Int] = List(3, 3, 5)
  //OR
  strs.map((s:String) => s.size)                //List[Int] = List(3, 3, 5)

  //OR
  def sz(str:String) = str.size
  strs.map(sz).foreach(println(_))
  //OR (with explicit return type)
  def sz1(str:String):Int = str.size
  strs.map(sz1).foreach(println(_))

  // filter selects only elements that pass some predicate function:
  nums.filter(_ < 4)                            //List[Int] = List(1, 2, 3)
  println()
  nums.filter(_ < 4).foreach(println(_))
  nums.filter(_ % 2 == 0)                       //List[Int] = List(2, 4)
  nums.filter(n => n < 4 )                      //List[Int] = List(1, 2, 3)
  nums.filterNot(n => n < 4)                    //List[Int] = List(4, 5)

  // partition breaks a list into two lists, according to some predicate input function
  nums.partition(n => n < 4 )                   //(List[Int], List[Int]) = (List(2, 4),List(1, 3, 5))

  println()
  // Ex 3: create a list containing the odd numbers from 1 to 25, with those divisible by 5 replaced by "fizz"
  1.to(25).filter(n => n % 2 != 0).map(n => if(n % 5 == 0) "fizz" else n).foreach(println(_))
                    //scala.collection.immutable.IndexedSeq[Any] = Vector(1, 3, fizz, 7, 9
                                                                  //| , 11, 13, fizz, 17, 19, 21, 23, fizz)

  val oddNums = 1.to(25).filter(n => n % 2 != 0)                  //> oddNums  : scala.collection.immutable.IndexedSeq[Int] = Vector(1, 3, 5, 7,
                                                                  //| 9, 11, 13, 15, 17, 19, 21, 23, 25)

  oddNums.map(n => if(n % 5 == 0) "fizz" else n)                  //scala.collection.immutable.IndexedSeq[Any] = Vector(1, 3, fizz, 7, 9
                                                                  //| , 11, 13, fizz, 17, 19, 21, 23, fizz)
}
