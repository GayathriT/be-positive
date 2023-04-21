package com.scalaProblemSolving.Arrays

object evenOddNumbers {
  val input=Array(1,3,4,5,2,9,7,8)
     def main(args: Array[String]) {
        val input=Array(1,3,4,5,2,9,7,8)
    
        println("Method 1")
        val res = evenOddNumbersPart(input.sorted)
        //input.sorted.foreach(println)
        //  res.foreach(println)
         res.map(e=> print(s"${e} || "))//.foreach(println)
       
   }
     def evenOddNumbersPart(inputArr: Array[Int]): Array[Int] = {
       
    //   inputArr.map(e => print(s" $e | "))
     //  println
      val len = inputArr.length
      val tempArr = Array.fill(len)(0)
      var index = 0
      for (i <- 0 until len ) {
        if(inputArr(i) % 2 == 0 && index < len) {
            tempArr(index)=inputArr(i)
            index = index + 1          
        }        
      }
    //   println("index = " + index)
        for (i <- 0 until len) {
        if(inputArr(i) % 2 != 0 && index < len) {
          tempArr(index)=inputArr(i)
            index = index + 1
        }        
      }
       
       tempArr
     }
}