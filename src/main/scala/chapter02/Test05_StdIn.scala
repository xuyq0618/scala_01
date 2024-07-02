package chapter02

import scala.io.StdIn

object Test05_StdIn {
  def main(args: Array[String]): Unit = {
    println("请输入你的大名：")
    val name: String = StdIn.readLine()

    println("请输入你的年龄：")
    val age:Int = StdIn.readInt()

    println(s"欢迎${age}岁的${name}来杭州学习")



  }

}
