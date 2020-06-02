object Function {
  def main(args: Array[String]): Unit = {
    var a = f.apply(6)
    println(a)
    println(f(6))
    println("muliplier(1) value = " + multiplier(1))
    println("muliplier(2) value = " + multiplier(2))
    println("muliplier(2) value = " + multiplier2(Array(1),2,Array(10)))
  }

  var factor = 3
  val multiplier: Int => Int = (i: Int) => i * factor
  val multiplier2:
    (Array[Int],Int,Array[Int]) => Int = (i: Array[Int],j:Int,c :Array[Int]) => i(0) * j * c(0)
  val f: Int => Int = (x: Int) => x + 3
}
