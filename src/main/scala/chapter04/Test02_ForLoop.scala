package chapter04

import scala.io.StdIn

object Test02_ForLoop {
  def main(args: Array[String]): Unit = {
    //    1、范围遍历
    for (a <- 1 to 10) // == for(a:Int <- 1.to(10))
      println(a + "hello")

    //   不包含边界的范围遍历
    for (a <- 1 until 10) // == for(a:Int <- 1.to(10))
      println(a + "hello")

    //    2、集合遍历
    for (b <- Array(1, 22, 33, 4))
      println(b)
    for (b <- Set(1, 22, 33, 4))
      println(b)
    for (b <- List(1, 22, 33, 4))
      println(b)


    //  3、循环守卫
    println("==========================================")
    for (c <- Array(1, 2, 33, 44, 5, 66, 7) if c != 44) // 相当于java 中的 continue
      println(c)

    //  4、循环步长
    println("==========================================")
    for (d <- 1 to 10 by 2)
      println(d)

    for (e <- 10 to 1 by -2)
      println(e)

    for (f <- 10 to 1 reverse)
      println(f)

//    5、循环嵌套
    for (i <- 1 to 10;j <- 1 to 10)
      println(s"i=${i},j=${j}")

println("=================================")
// 循环引入变量
    for (i <- 1 to 10) {
      var j = 10 - i
      println(s"i=${i},j=${j}")
    }
    println("=================================")
    for(i <- 1 to 10;j=10-i)
      println(s"i=${i},j=${j}")
  }

}

