package chapter04

import scala.io.StdIn

object Test01_TestIfElse {
  def main(args: Array[String]): Unit = {
    println("=====请输入您的年龄========")
    var a: Int = StdIn.readInt()

    // 多路分支
    if (a < 8) {
      println("童年")  //如果只有一行，可省略{}
    }
    else if (a < 18)
      println("少年")
    else if (a < 40)
      println("青年")
    else
      println("老年")
println("======================================================")
    // if -esle 是有返回值的
    var aa: Any = if (a < 8) { //any String和int的公共父类
      println("童年")
      "童年"
    }
    else if (a < 18) {
      println("少年")
      a
    } else if (a < 40) {
      println("青年")
      a
    }

    else {
      println("老年")
      a
    }

    println(s"年龄：${aa}")

    //java 三元组 a?b:c
    var r = if (a < 18) "未成年" else "成年"
    println(r)
  }

//嵌套分支：不推荐 ，用多分支代替

}
