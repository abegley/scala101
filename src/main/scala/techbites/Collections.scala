package techbites

object Collections extends App {

  // Collections - maps, lists, ranges sets, maps
  // note apply method on List companion object
  // note polymorphism



  // discuss immutable collections at this point?


  val score = Map("Alice" -> 10, "Bob" -> 3, "Cindy" -> 8)                        // 1. Maps Constructing an immutable Map[String, Int] - default is hash map
  //score("Alan") = 10   //no worky - immutable map                                                                                // key -> value

                                                                                  //scala.collection.mutable.Map("Alice" -> 10, "Bob" -> 3, "Cindy" -> 8)
  val list1 = List(1,2,3,4)                                                     //List[Int] = List(1, 2, 3, 4, 5)
  list1.head                  //1
  list1.tail                  //List(2,3,4)
  list1.isEmpty               //false

  val names:List[String] = List("Alan", "Steph", "Henry")                             //List[String] = List(abc, def, ghijk)
  List()                                                                          //List[Nothing] = List()


  1.to(20)                                                                        //scala.collection.immutable.Range.Inclusive = Range(1, 2, 3, 4, 5, 6, 7
  //or                                                                                //| , 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20)
  1 to 20                                       //same as above

  Set(1,1,2,2,2,2,2)                                                              //scala.collection.immutable.Set[Int] = Set(1, 2)

  //Tuples
  (1, 3.14, "Alan", "Engineer")

  val tuple = (1, 3.14, "Alan", "Engineer")
  //access elements via methods _1, _2, _3 and _4
  tuple._1
  tuple._2
  tuple._3
  tuple._4
  //tuples 1-22 no idea why they stopped at 22 :-)



  // contrast with Java equivalent




}


//Notes
//Choose between mutable and immutable maps
//Can easily convert between Scala and Java Maps