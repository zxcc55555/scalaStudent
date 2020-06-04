package scalaStudent

//元组
object TupleTest {
  def main(args: Array[String]): Unit = {
    iterableTuple()
  }
  //与列表一样，元组也是不可变的，但与列表不同的是元组可以包含不同类型的元素。
  //元组的值是通过将单个的值包含在圆括号中构成的。例如：
  val t2: (Int, Double, String) = Tuple3(1, 3.14, "Fred")
  val t: (Int, Double, String, (Int, Double, String)) = Tuple4(1, 3.14, "Fred",t2)
  //目前 Scala 支持的元组最大长度为 22。对于更大长度你可以使用集合，或者扩展元组。
  def findValue(): Unit ={
    val t = (4,3,2,1)

    val sum = t._1 + t._2 + t._3 + t._4

    println( "元素之和为: "  + sum )
  }
  def iterableTuple(): Unit ={
    val t = (4,3,2,1)
    t.productIterator.foreach{ i =>println("Value = " + i )}
    println(t.toString())
    println(this.t.toString())
  }
  //Tuple2 才有交换元素的方法
  def swapTuple(): Unit ={
    val t = Tuple2("www.google.com", "www.runoob.com")
    val t2 = Tuple4(1, 3.14, "Fred",1)
    println(t.toString())
    println(t.swap.toString())
    println(this.t.toString())
  }
}
