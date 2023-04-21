package com.scalaProblemSolving.Arrays

object reverseArray {
    val input=Array(1,3,4,5,2,9,7,8)
     def main(args: Array[String]) {
      val res = reversArr_1(input)
      println("Method 1")
      res.map(e => print(s"${e._1} || "))
      println
      val res2 = reversArr_2(input)
      println("Method 2")
      res2.map(e => print(s"${e} || "))
      println
      val res3 = reversArr_3(input)
      println("Method 3")
      res3.map(e => print(s"${e} || "))
      println
    }
    
    def reversArr_1(inputArr: Array[Int]) = {
      inputArr.zipWithIndex.sortWith(_._2 > _._2)
    }
    
    def reversArr_2(inputArr: Array[Int]) = {
      inputArr.reverse
    }
    def reversArr_3(inputArr: Array[Int]) = {
      val len = inputArr.length
      var j = len-1
      for (i <- 0 until len) {
        if (j > i) {
            var temp = inputArr(i)
            inputArr(i)=inputArr(j)
            inputArr(j)=temp
            j = j-1
        }
      }
      inputArr
    }
    
}