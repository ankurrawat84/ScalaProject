class AccountInfo {

  var x = 0

  def deposit(a: Integer)={x += a}

  def withdrawl(b: Integer) = {if (x-b<0) println("Low Balance ") else x-=b}

  def balancecheck() = {println("Balance is "+x)}


}


object main1 extends App{

  val obj1 = new AccountInfo

  obj1.balancecheck()
  obj1.deposit(12)
  obj1.balancecheck()


}