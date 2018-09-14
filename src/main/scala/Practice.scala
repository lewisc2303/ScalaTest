import scala.collection.mutable.ArrayBuffer

object ForLoopPractice extends App {

//  def main(args: Array[String] ) = {
//    var i = 0
//    for (i <- 1 to 10) {
//      println(i)
//    }//difference between to and until
//  }
//  def main(args: Array[String] ) = {
//  var i = 0
//  for (i <- 1 until 10)
//    println(i)


  //compute a function that prints all prime number
  // prime numbers are only divisible by itself and 1


def function (n : Int) = {

//  for (i <- n until 0) {
//  val arr =  ArrayBuffer(1 to n toArray)

//  for (i <- 1 to n ) {
//    if ((i % 2 != 0 || i == 2) && ((i % 3 != 0 || i == 3))) {
//      println(i)
//    }
//    }

  for (i <- 1 to n ) {
    if (i % 2 != 0 || i == 2) {
      if (i % 3 != 0 || i == 3) {
        println(i)
      }
    }



  //println(arr.toArray.deep.mkString(" "))
  }
}
function(25)

  val arr = Array(1, 2, 3, 4)

  for (element <- arr) println(element)
}

