package chapter07

import com.sun.security.auth.UnixPrincipal

object Test03_MulArray {
  def main(args: Array[String]): Unit = {
    //1、创建二维数组
    val array: Array[Array[Int]] = Array.ofDim(2, 3)

    //2、访问元素
    array(1)(1) = 12
    array(1)(2) = 88
    println(array.mkString("-"))
    for(i <- 0 until array.length;j <- 0 until array(i).length) {
      print(array(i)(j))
      print("\t")
      if(j == array(i).length-1) {
        println()
      }
    }


    //3、遍历
      array.foreach(x =>x.foreach(println))
      array.foreach(_.foreach(println))
  }
}
