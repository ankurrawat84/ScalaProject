class FindLargeArray (iniarray: Array[Int] ){

val a = iniarray

 def max(a: Integer, b: Integer) = {if (a>b) a else b}


  println(a.reduceLeft(max(_,_)))

}


object findarraymaxmain extends App{

  val e = Array(1,12,3)

val t = new FindLargeArray(e)

}