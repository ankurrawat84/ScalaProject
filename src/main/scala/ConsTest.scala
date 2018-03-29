class ConstTestParent{

  var x = 123
  def printstmt()={println("This is parent class")}

}




class ConsTest extends ConstTestParent {

  var a = 0
  var b = 0

  def this(a:Int)
  {
    this()
    this.a = a
  }

  override def printstmt()= {println("This is child class")}

}


object mainBal extends App{

  val obj1 = new ConsTest(1)
  println(obj1.a)
  println(obj1.b)

  val obj2 = new ConstTestParent()
   obj2.printstmt()

}