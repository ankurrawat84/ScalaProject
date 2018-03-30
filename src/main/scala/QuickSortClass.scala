import scala.collection.mutable.ListBuffer

class QuickSortClass {

  def sort(a: ListBuffer[Integer]):(ListBuffer[Integer])=
  {
    val len = a.length -1
    var pivot = 0

    for (x <- 0 to len)
      {
        if (a(len) > a(x))
          {
            val temp = a(pivot)
            a(pivot) = a(x)
            a(x) = temp
            pivot += 1
          }
        if (x == (len - 1))
          {
            val temp = a(pivot)
            a(pivot) = a(len)
            a(len) = temp
          }
      }

    if(pivot != 0) {return (sort(a.slice(0,pivot)) ++ sort(a.slice(pivot, len+1)))} else a
  }
}

object QuickMain extends App{
  var a = ListBuffer[Integer](20,5,1,3,6,4,13,2,12,15)
  var obj1 = new QuickSortClass
  print(obj1.sort(a))


}