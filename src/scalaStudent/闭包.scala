package scalaStudent

object 闭包 {
  def main(args: Array[String]) {
    println( "muliplier(1) value = " +  multiplier(1) )
    println( "muliplier(2) value = " +  multiplier(2) )
  }
  var factor = 3
  val multiplier: Int => Int = (i:Int) => i * factor
}
