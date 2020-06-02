package scalaStudent

object 循环 {
  def main(args: Array[String]): Unit = {
    var i = 10
    while (i<20){
      i = i + 1
      printf(i+" < 20")
    }
    for (b <- 0 to 10){
      println("Value of b: " + b)
    }
    for( a <- 1 until 10){
      println( "Value of a: " + a )
    }
    for( a <- 1 to 3; b <- 1 to 3){
      println( "Value of a: " + a )
      println( "Value of b: " + b )
    }

    val numList = List(1,2,3,4,5,6,7,8,9,10)
    // for 循环
    for( a <- numList if a != 3; if a < 8 ){
      println( "Value of List a: " + a )
    }

    //yield 将 for 循环的返回值作为一个变量存储  for 循环
    var retVal = for{ a <- numList
                      if a != 3; if a < 8
                      }yield a

    // 输出返回值
    for( c <- retVal){
      println( "Value of c: " + c )
    }
  }
}
