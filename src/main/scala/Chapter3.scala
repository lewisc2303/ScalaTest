import scala.collection.mutable.ArrayBuffer
import scala.util
import scala.util.Random


object Chapter3 extends App {

  //Practice

  //val arr = ArrayBuffer(1 to 40)        some reason does not print when using 1 to 40 but does if actual values are put in
  //
  //for(elements <- arr) println(elements)

  //  var n = a.length
  //
  //val positionToRemove = for (elem <- a if elem >= 0 ) yield elem

  def Ex1(n: Int) = {
    val a = new Array[Int](n)

    for (elem <- 1 until n) {
      a(elem) = Random.nextInt(100)
    }
    println(a.deep.toString)
  }

  //Ex1(40)
  //
  //  val b = Array.tabulate[Int](5)(_+1)
  //
  //println(b)

  //  val c = new Array[Int](5)
  //  for (elem <- 1 until 5 by 1) {
  //    c(elem) = elem + 1}
  //  println(c.deep.toString)
  //
  //  val a = Array[Int](1, 2, 3, 4, 5)

  def Ex2(n: Int) = {

    //swap adjacent elements of an array
    val c = Array.range(1, (n + 1))
    for (elem <- 1 to n) {
      val temp = c(elem) //why?
      c(elem) = c(elem + 1)
      c(elem + 1) = temp
    }
    println(c.deep.toString)
  }

  //Ex2(10)
  def Ex3(n: Int) = {

    //swap adjacent elements of an array
    val c = Array.range(1, (n + 1))
    for (elem <- 1 to n) yield {
      val temp = c(elem) //why?
      c(elem) = c(elem + 1)
      c(elem + 1) = temp
    }
    println(c.deep.toString)
    //Ex3(10)
  }

   def Ex6(n: Int) = {
    var a = Array.fill(n)(100).map(Random.nextInt)
    a = a.sortWith(_>_)
    println(a.deep.toString)
    //var a = BufferArray.fill(n)(100).map(Random.nextInt)
    //a = a.sortWith(_>_)
  }
  Ex6(10)
}