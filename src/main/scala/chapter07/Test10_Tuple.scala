package chapter07

object Test10_Tuple {
  def main(args: Array[String]): Unit = {
    //1、创建元组
    val t1: (String, Int, Int, Char, Boolean, Boolean) = ("hello", 1, 2, 'c', true, false)
    println(t1)

    //2、访问元组
    println(t1._1)
    println(t1._2)
    println(t1._3)
    println(t1._4)
    println(t1._5)

    println("=================")

    //    3、遍历元组
    for(e <- t1.productIterator) println(s"$e,")

    println("=================")
    //4、嵌套元祖
    val t2  = ("hello", 1, 2, 'c', true, false,(1,2,"xx"))
    println((t2._7)._3)




  }

}
