object _1distinctArray {
   val input=Array(6, 10, 5, 4, 9, 120, 4, 6, 10)
     def main(args: Array[String]) {
     val res = distinctArray_1(input)
      println("Method 1")
     }
  
  def distinctArray_1(inputArr: Array[Int]) = {
      val len = inputArr.length
      for (i <- 0 until len) {
        for (j <- 0 until len) {
        if(inputArr(i) == inputArr(i+1) && i!=j)
        {
          inputArr.drop(i)
        }
      }
      }
      inputArr
    }
}
