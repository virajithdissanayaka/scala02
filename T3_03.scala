import scala.math.Ordering

object T3_03 {
  def main(arg: Array[String]): Unit ={

    print("Enter a number: ")
    var num1 = scala.io.StdIn.readInt()

    print("Enter a number: ")
    var num2 = scala.io.StdIn.readInt()

    var ave: Double = calcAverage(num1,num2)

    println("Average is: "+ave)

  }

  def calcAverage(n1: Int, n2: Int): Double = {
    return (n1+n2)/2
  }
}