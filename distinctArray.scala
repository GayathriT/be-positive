package com.scalaProblemSolving.Arrays

object distinctArray {
   val input=Array(6, 10, 5, 4, 9, 120, 4, 6, 10)
     def main(args: Array[String]) {
     val res = distinctArray_1(input)
      println("Method 1")
      res.map(e => print(s"${e} || "))
      println
      val res2 = distinctArray_1(input)
      println("Method 2")
      res2.map(e => print(s"${e} || "))
      println
      val res3 = distinctArray_1(input)
      println("Method 3")
      res3.map(e => print(s"${e} || "))
      println
   
   }
    def distinctArray_1(inputArr: Array[Int]) = {
      inputArr.distinct
    }
    def distinctArray_2(inputArr: Array[Int]) = {
//      inputArr.sorted
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
    def distinctArray_3(inputArr: Array[Int]) = {
       val len = inputArr.length
       import scala.collection.mutable.ArrayBuffer
       val tempArrBuff = ArrayBuffer[Int]()
      for (i <- 0 until len) {        
        if(inputArr(i) != inputArr(i+1))
        {
         tempArrBuff +=  inputArr(i)
        }
      
      }
       tempArrBuff
    }
}