import scala.util.Random

object Chapter4 extends App {

  def shopDiscount () = {
    val Gizmos = Map("Drone" -> 200, "Self-draivng car"-> 20000, "Robot"-> 30000)
    val DiscountedGizmos = Gizmos.map { case (k, v) => (k, (v * 0.9)) }
    println(DiscountedGizmos.toString)
  }
  shopDiscount()

//  def scanner() = {
//    val in = new java.util.Scanner( new java.io.File("myfile.txt"))
//    while (in.hasNext()) {
//
//      in.next()
//    }
//  }
// Write a function that returns a pair containing the smallest and largest value in the array

  def minmax(values : Array[Int]) = {
    println("Minimum value is " + values.min + " and " + "Maximum value is " + values.max)
  }
val Arr = Array.fill(10)(100).map(Random.nextInt)
  println(Arr.deep.toString)
  minmax(Arr)
}

