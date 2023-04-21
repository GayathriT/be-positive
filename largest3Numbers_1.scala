package com.scalaProblemSolving.Arrays

object largest3Numbers_1 {
  def add(x:Int, y:Int) = x + y;

    def main(args: Array[String]) {
        // print("sum of x + y = " + add(25,10));
        val input = Array(0,3,1,5,2,8,10,4)
        println("Method 1 ")
        highest3(input)
        println
        println("Method 2 ")
        highest3_1(input)
        println
        println("Method 3 ")
        highest3_2(input)
    }
     def highest3(inputArr:Array[Int]) {
        
            // val i: Array[Int] = Array(1, 4, 6, 2, 7, 8, 0)
          inputArr.sorted.slice(inputArr.length-3,inputArr.length).map(e => print(s"${e} || ")) //.foreach(println)
        }

   
      def highest3_1(inputArr:Array[Int]) {
        
        val len = inputArr.length
        println("length: " +  len )
        if ( len < 3 ) { println( " Invalid Array " ) }
        else
        {
            var first =0
            var sec = 0
            var third = 0
            
            for (i <- 0 until len) {
            if(inputArr(i) > first)
            {
                third = sec
                sec = first
                first = inputArr(i)
            }
            else if (inputArr(i) > sec) {
                third = sec
                sec = inputArr(i)
            }
            else if (inputArr(i) > third) {
                third = inputArr(i)
            }
            }
            println(s"first: ${first} | second: ${sec} | third: ${third}")
        }
        
    }
      
      def highest3_2(inputArr:Array[Int]) {
        
            // val i: Array[Int] = Array(1, 4, 6, 2, 7, 8, 0)
          inputArr.sortWith(_ > _).slice(0, 3).map(e => print(s"${e} || ")) //.foreach(println)
        }

}