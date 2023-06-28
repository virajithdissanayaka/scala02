object T3_02 {
  def main(args: Array[String]): Unit = {
    var myList = List.empty[String]

    for(i<-0 to 4){
      print("Enter a string: ")
      val str = scala.io.StdIn.readLine()
      myList = myList :+str
    }
    val fileredList = filterStrings(myList)
    println(fileredList)
  }

  def filterStrings(strings: List[String]): List[String] = {
    strings.filter(_.length > 5)
  }
}
