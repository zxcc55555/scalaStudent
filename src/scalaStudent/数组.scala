package scalaStudent

object 数组 {
  def main(args: Array[String]): Unit = {
    var z:Array[String] = new Array[String](3)
    val a = new Array[String](3)
    a(0) = "li"; a(1) = "rui"; a(2) = "rui"; a(4/2) = "li"
    var c = Array("Runoob", "Baidu", "Google")
    for ( x <- a ) {
      println( x )
    }
    var total = "";
    for ( i <- a.indices) {
      total += a(i);
    }
    println(total)
    var d = Array(1, 2, 3)
    var max = d(0)
    for ( i <- 1 until d.length) {
      if (d(i) > max) max = d(i);
    }
    println("最大值为 " + max);
    multiArray()
    rangeToArray
  }
  //多维数组
  def multiArray(): Unit ={
    var myMatrix = Array.ofDim[Int](3,3)
    // 创建矩阵
    for (i <- 0 to 2) {
      for ( j <- 0 to 2) {
        myMatrix(i)(j) = j+i;
      }
    }

    // 打印二维阵列
    for (i <- 0 to 2) {
      for ( j <- 0 to 2) {
        print(" " + myMatrix(i)(j));
      }
      println();
    }
    var a = myMatrix(1).concat(myMatrix(2))
    for(i <- a.indices){
      println(a(i))
    }
  }
  //创建区间数组
  def rangeToArray(): Unit ={
    var myList1 = Array.range(10, 20, 2)
    var myList2 = Array.range(10,20)

    // 输出所有数组元素
    for ( x <- myList1 ) {
      print( " " + x )
    }
    println()
    for ( x <- myList2 ) {
      print( " " + x )
    }
  }
}
