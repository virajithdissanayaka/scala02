object T3_01 {
  def reversestring(newString: String): Unit = {
    if (newString.length() != 0){
      var temp = newString.charAt(0)
      reversestring(newString.substring(1))
      print(temp)
    }
  }

  def main(args:Array[String]): Unit = {
    print("Enter a string: ")

    val str1 = scala.io.StdIn.readLine()

    println()
    print("Reversed String: ")
    reversestring(str1)
    println()
  }
}
