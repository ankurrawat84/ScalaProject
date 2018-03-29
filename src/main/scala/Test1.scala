class Test1 {

  var a = 1
  def counter()= { a+1 }

}


object main2 extends App{

  var t = new Test1
  println(t.a)

  var c = t.counter()

  println(c)

}