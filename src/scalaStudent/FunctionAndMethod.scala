package scalaStudent

/**
 * 函数与方法
 * 有些翻译上函数(function)与方法(method)是没有区别的。
 */
class FunctionAndMethod {
  //Scala 有方法与函数，二者在语义上的区别很小。
  //Scala 方法是类的一部分，而函数是一个对象可以赋值给一个变量。换句话来说在类中定义的函数即是方法。
  //Scala 中的方法跟 Java 的类似，方法是组成类的一部分。
  //Scala 中的函数则是一个完整的对象，Scala 中的函数其实就是继承了 Trait 的类的对象。
  //Scala 中使用 val 语句可以定义函数，def 语句定义方法。
  //Scala 方法声明格式如下：
  //def functionName ([参数列表]) : [return type]
  def m(x: Int): Int = x + 3
  //Scala 方法定义格式如下：
  //def functionName ([参数列表]) : [return type] = {
  //   function body
  //   return [expr]
  //}
  def c(x:Any):Any = {
    return x
  }
  def b(x:Any,a:Int):Any = {
    return x+""+a
  }
  def a(x: Any): Unit = {
    println("Value of b:");
  }
  val f: Int => Int = (x: Int) => x + 3

  def main(args: Array[String]): Unit = {
    var a = f.apply(6)
  }
}