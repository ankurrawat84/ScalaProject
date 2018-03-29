class QuickSort {

  val a = Array(14,2,15,4,11)

  val b = a.length - 1

  val c = (a(b))

  for(x <- 0 to b-1 ){

    if (a(b)<a(x))
      {
        val before = a(b)
        a(b) = a(x)
        a(x) = before
      }

  }



}


object qksrtmain extends App{

  new QuickSort()

}