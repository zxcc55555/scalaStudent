package scalaStudent

//Scala Option(选项)类型用来表示一个值是可选的（有值或无值)。
//Option[T] 是一个类型为 T 的可选值的容器： 如果值存在， Option[T] 就是一个 Some[T] ，如果不存在，
// Option[T] 就是对象 None 。
object OptionTest {
  def main(args: Array[String]): Unit = {
    testOption()
  }
  def testOption(): Unit ={
    // 虽然 Scala 可以不定义变量的类型，不过为了清楚些，我还是
    // 把他显示的定义上了
    // Map.get默认返回option对象
    val myMap: Map[String, String] = Map("key1" -> "value")
    val value1: Option[String] = myMap.get("key1")
    val value2: Option[String] = myMap.get("key2")
    println(value1) // Some("value1")
    println(value2) // None
    println(value1.get)
    println(value2.getOrElse("value2"))//不会报错
    println(value2.get)//会报错
  }
}
