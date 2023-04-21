package com.scalaProblemSolving.Arrays

object pushZeroesToEnd {
  def move0ToLast(inputArr: Array[Int]) = {
        val len = inputArr.length
        var temp =0
        var j=0
        for (i <- 0 until len) {
          //  println(s"length is ${len} & inputArr(i) is ${inputArr(i)}")
            if(inputArr(i) != 0  && j<len)
            {
                temp = inputArr(i)
                inputArr(i) = inputArr(j)
                inputArr(j) = temp
                j=j+1
            }
            
        }
        inputArr
    }
      def main(args: Array[String]) {
        val input=Array(5, 6, 0, 4, 6, 0, 9, 0, 8)
        println("Method 1")
        val res = move0ToLast(input)
        res.map(e=> print(s"${e} || "))//.foreach(println)
        
    }

  
}