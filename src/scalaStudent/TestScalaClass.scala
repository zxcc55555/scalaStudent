package scalaStudent
//Scala类对象
//Scala中的类不声明为public，一个Scala源文件中可以有多个类。
class TestScalaClass(xc: Int, yc: Int) {
  var x: Int = xc
  var y: Int = yc

  def move(dx: Int, dy: Int) {
    x = x + dx
    y = y + dy
    println ("x 的坐标点: " + x);
    println ("y 的坐标点: " + y);
  }
}
class TestScalaClass2(xc: Int, yc: Int) {
  var x: Int = xc
  var y: Int = yc

  def move(dx: Int, dy: Int) {
    x = x + 2 * dx
    y = y + 2 * dy
    println ("x 的坐标点: " + x);
    println ("y 的坐标点: " + y);
  }
}
object Test {
  def main(args: Array[String]) {
    val pt = new TestScalaClass(10, 20);
    val pt2 = new TestScalaClass2(10, 20);

    // 移到一个新的位置
    pt.move(10, 10);
    pt2.move(10, 10);
  }
}
