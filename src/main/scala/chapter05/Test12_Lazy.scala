package chapter05

object Test12_Lazy {
  def main(args: Array[String]): Unit = {
    //1、
    lazy val result:Int = sum(12,22)

    println("1、函数调用")
    println("2、result = "+result)

    //打印顺序
//    1、函数调用
//    3、sum调用
//    2、result = 34
  }
  def sum(a:Int,b:Int):Int = {
    println("3、sum调用")
    a + b
  }

}
