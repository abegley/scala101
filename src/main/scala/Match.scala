package main.scala

object Match {
  def main(args: Array[String]) {
    val frenchDayOfWeek = args(0) match {
        case "Sunday"     => "Dimanche"
        case "Monday"     => "Lundi"
        case "Tuesday"    => "Mardi"
        case "Wednesday"  => "Mercredi"
        case "Thursday"   => "Jeudi"
        case "Friday"     => "Vendredi"
        case "Saturday"   => "Samedi"
        case _            => "Error: '" + args(0) +"' is not a day of the week"
    }
    println(frenchDayOfWeek)
  }
}
