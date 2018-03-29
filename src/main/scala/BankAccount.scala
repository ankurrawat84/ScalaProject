class BankAccount (inibal: Double){

  private var balance = inibal
  def deposit(amount: Double): Double = { balance += amount; balance}
  def withdraw(amount:Double): Double = { balance -= amount; balance}

}


class CheckingAccount(inibal: Double) extends BankAccount(inibal) {


  override def deposit(amount: Double):Double = {super.deposit(amount) - 1 }

  override def withdraw(amount: Double): Double = {super.withdraw(amount) -1 }


}


object checkacctmain extends App{


  val a = new CheckingAccount(100)

  println(a.deposit(10))


}