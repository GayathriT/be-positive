package com.scalaProblemSolving.Arrays

object rearrangeEvenPosGrtrOddPosLsr {
   def main(args: Array[String]) {
        val input=Array(1,3,4,5,2,9,7,8)
        //input.sortWith(_ < _)
       /* val seqArr = input.toSeq.sorted
        seqArr.foreach(print)*/
    
        println("Method 1")
        val res = rearrangeEvenPosGrtrOddPosLsrOrder(input.sorted)
         res.foreach(println)
        // res.map(e=> print(s"${} || "))//.foreach(println)
       
   }
     def rearrangeEvenPosGrtrOddPosLsrOrder(inputArr: Array[Int]): Array[Int] = {
    
    val len = inputArr.length
    var larger = len
    var smaller = 0
    //val tempArr: Array[Int] = (0 until len).toArray // Array[Int](len)
    val tempArr = Array.fill(len)(0)
    
    for (i <- 0 until len) {
      if ((i+1)%2 == 0) {
        larger = larger - 1
        tempArr(i) = inputArr(larger)    
        
      }
      else {
         tempArr(i) = inputArr(smaller)
        smaller = smaller + 1        
      }
    }    
    tempArr
     }
}