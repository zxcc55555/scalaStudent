package scalaStudent

object Collection {
  def main(args: Array[String]): Unit = {
    mapTest()
    listFill
  }
  //创建列表
  // Scala 列表类似于数组，它们所有元素的类型都相同，但是它们也有所不同：
  // 列表是不可变的，值一旦被定义了就不能改变，
  // 其次列表 具有递归的结构（也就是链接表结构）而数组不是。。
  def testList(): Unit = {
    // 字符串列表
    val site: List[String] = List("Runoob", "Google", "Baidu")

    // 整型列表
    val nums: List[Int] = List(1, 2, 3, 4)

    // 空列表
    val empty: List[Nothing] = List()

    // 二维列表
    val dim: List[List[Int]] =
      List(
        List(1, 0, 0),
        List(0, 1, 0),
        List(0, 0, 1)
      )
  }
  //构造列表的两个基本单位是 Nil 和 ::
  //Nil 也可以表示为一个空列表。
  //以上实例我们可以写成如下所示：
  def listNil(): Unit ={
    // 字符串列表
    val site = "Runoob" :: ("Google" :: ("Baidu" :: Nil))

    // 整型列表
    val nums = 1 :: (2 :: (3 :: (4 :: Nil)))

    // 空列表
    val empty = Nil

    // 二维列表
    val dim = (1 :: (0 :: (0 :: Nil))) ::
      (0 :: (1 :: (0 :: Nil))) ::
      (0 :: (0 :: (1 :: Nil))) :: Nil
  }
  def listFill(): Unit ={
    val site = List.fill(3)("Runoob") // 重复 Runoob 3次
    println( "site : " + site  )

    val num = List.fill(10)(2)         // 重复元素 2, 10 次
    val n = List.fill(10)(1)         // 重复元素 2, 10 次
    println( "num : " + num  )
    val num2 = n ::: num
    println( "num2 : " + num2  )
    val num3 = n :: num
    println( "num3 : " + num3  )
  }
  def listTabulate(): Unit ={
    // 通过给定的函数创建 5 个元素
    val squares = List.tabulate(6)(n => n * n)
    println( "一维 : " + squares  )

    // 创建二维列表
    val mul = List.tabulate( 4,5 )( _ * _ )
    println( "多维 : " + mul  )
  }

  def mapTest(): Unit ={
    var map : Map[String,String] = Map.empty
    var map2 = Map("asd"-> "2")
    map = map++map2
    map = map.+("asd"-> "1")
    println(map)
  }

}
