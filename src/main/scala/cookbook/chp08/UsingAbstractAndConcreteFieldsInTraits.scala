package main.scala.cookbook.chp01

/**
 * Created by Alan on 28/08/2014.
 * //Problem:  You want to put abstract or concrete fields in your traits so they are declared in one place and available
 * to all types that implement the trait.
 */
object UsingAbstractAndConcreteFieldsInTraits extends App {

}

trait PizzaTrait {
  var numToppings: Int          //abstract
  var size = 14                 //concrete
  var maxNumToppings = 10       //concrete
}

class Pizza extends PizzaTrait {
  var numToppings = 0           //'override' not needed
  size = 16                     //'var' and 'override' not needed
}

//As shown in the example, fields of a trait can be declared as either var or val.  You don't need to use
//the override keyword to override a var field in a subclass (or trait), but you do need to use it to override
//a val field:
trait PizzaTrait2 {
  val maxNumToppings: Int
}

class Pizza2 extends PizzaTrait2 {
  override val maxNumToppings = 10    //'override' is required
}





