package chapter02

object Test02_Variable {
  def main(args: Array[String]): Unit = {
    var a: Int = 1
    val b :Int = 10

    var c = 100  // 类型可以省略
    val d = 1000

    c = 1000
//    d = 100  常量不可更改
//    c = 'ppp' 变量数据类型确定后，类型不可更改
  }

}
