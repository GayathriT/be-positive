package com.scalaProblemSolving.Arrays

object rearrangeMaxMinOrder {
  def main(args: Array[String]) {
        val input=Array(1,3,4,5,2,9,7,8)
        //input.sortWith(_ < _)
       /* val seqArr = input.toSeq.sorted
        seqArr.foreach(print)*/
    
        println("Method 1")
        val res = rearrangeMaxMin(input.sorted)
       res.map(e=> print(s"${e} || "))//.foreach(println)
       println
        println("Method 2 not working ")
        val res1 = rearrangeMaxMin_1(input.sorted)
        res1.map(e=> print(s"${e} || "))//.foreach(println)
        
    }
  def rearrangeMaxMin(inputArr: Array[Int]): Array[Int] = {
    
    val len = inputArr.length
    var i=0    
    if( len > 0  )
    {
      Array(inputArr(len-1), inputArr(0)) ++ rearrangeMaxMin(inputArr.slice(i+1,len-1-i))      
    }
    else {
      
      inputArr
    }
  }
  
  def rearrangeMaxMin_1(inputArr: Array[Int]): Array[Int] = {
  
    
  val tempArr = inputArr
  tempArr.foreach(println)
  val len = inputArr.length
  var small = 0
  var large = len -1
  var flag = true
  for ( i <- 0 until len ) {
    if (flag) {    
      inputArr(i) = tempArr(large)
      large = large -1
    }
    else
    {      
      inputArr(i) = tempArr(small)
      small = small + 1      
    }        
    flag = !flag
    
  }
  tempArr
  
  }
  
  
  

}