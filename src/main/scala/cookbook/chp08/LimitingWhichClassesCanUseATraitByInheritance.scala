package cookbook.chp08

/**
 * Created by abegley on 01/09/2014.
 * Problem:  You want to limit a trait so it can only be added to classes that extend a superclass or another trait.
 */
object LimitingWhichClassesCanUseATraitByInheritance extends App {
  /*
  Solution: use the following syntax to declare a trait 'TraitName', where TraitName can only be mixed into
  classes that extend a type named SuperThing, where SuperThing may be a trait, class, or abstract class:

  trait [TraitName] extends [SuperThing]
   */

  /*
  For instance, in the following example, Starship and StarFleetWarpCore both extend the common superclass
  StarfleetComponent, so the StarfleetWarpCore trait can be mixed into the Starship class:
   */

  class StarfleetComponent
  trait StarfleetWarpCore extends StarfleetComponent
  class Starship extends StarfleetComponent with StarfleetWarpCore

  /*
  However, in the following example, the Warbird class can't extend the StarfleetWarpCore
  trait, because Warbird and StarfleetWarpCore don't share the same superclass:
   */
  class RomulanStuff

  //won't compile
 // class Warbird extends RomulanStuff with StarfleetWarpCore
}
