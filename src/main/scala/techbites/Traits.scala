package techbites

/**
 * Created by Alan on 12/08/2014.
 */
object Traits extends App {

  trait Logger {
    def log(msg:String) //an abstract method
  }

  class ConsoleLogger extends Logger {  //use extends, not implements
    def log(msg:String){println(msg)}   //No override needed
  }

  class ConsoleLogger1 extends Logger with Cloneable with Serializable{             //Java Cloneable and Serializble interfaces.  All Java interfaces can be used as Scala traits
    def log(msg:String){println(msg)}
  }

  //Traits with Concrete Implementations

  trait ConsoleLogger2 {
    def log(msg:String) {println(msg)}
  }

  //The SavingsAccount picks up a concrete implementation from the ConsoleLogger trait
  //The ConsoleLogger2 functionality is 'mixed in' with the SavingsAccount class
  class SavingsAccount extends Account with ConsoleLogger2 {
    def withdraw(amount: Double) {
      if(amount > balance)
        log("Insufficient funds")
      else
        balance -= amount
    }
  }

  class SavingsAccount1 extends Account with Logged {
    def withdraw(amount: Double) {
      if(amount > balance)
        log("Insufficient funds")
      else
        balance -= amount
    }
  }


  //do nothing implementation
  trait Logged {
    def log(msg:String){ }
  }

  trait ConsoleLogger3 extends Logged{
    override def log(msg:String){println(msg)}
  }

  trait TimestampLogger extends Logged {
    override def log(msg:String){
      super.log(new java.util.Date() + " " + msg)
    }
  }

  trait ShortLogger extends Logged {
    val maxLength = 15
    override def log(msg:String){
      super.log(
          if(msg.length <= maxLength) msg else msg.substring(0, maxLength - 3) + "..."
      )
    }
  }

  val acct1 = new SavingsAccount1 with ConsoleLogger3 with TimestampLogger

  val acct2 = new SavingsAccount1 with ConsoleLogger3 with ShortLogger

  println(acct1.log("Savings Account with TimestampLogger"))
  println(acct2.log("Savings Account with ShortLogger"))


  class Account {
    val id = Account.newUniqueNumber()
    var balance = 0.0
    def deposit(amount: Double){ balance += amount}
  }

  object Account {  //The companion object
      private var lastNumber = 0
      private def newUniqueNumber() = { lastNumber += 1; lastNumber}
  }
}
