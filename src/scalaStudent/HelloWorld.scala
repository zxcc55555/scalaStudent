package scalaStudent

import java.util._
import java.util.Objects
import java.util.{HashMap => JavaHashMap}// 引入了util包的所有成员，但是HashMap被隐藏了

object HelloWorld {
  private def f(): String ={
    return "hello"
  }
  private[scalaStudent] def f2(): String ={
    return "hello"
  }
  private[this] def f1(): String ={
    return "e"
  }
  def main(args: Array[String]): Unit = {
    println(Objects.equals("null", 1))
    println(null == 1)
    //变量
    var str = ""
    var strS : String ="foo";
    var myHashMap = new JavaHashMap[String,String]
    //常量
    val strVal = "常量"
    //多变量声明
    val xmax, ymax = 100
    //元组
    val pa = (40,"Foo")
    println(pa)
    printf(this.f2())
  }
}
