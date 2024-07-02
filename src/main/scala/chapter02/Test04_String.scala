package chapter02

object Test04_String {
  def main(args: Array[String]): Unit = {
    val name: String = "alice"
    var age: Int = 19

    //    (1) 用+拼接
    println(age + "岁的" + name + "在杭州上学")
    //    (2) c语言用法，printf,用%
    printf("%d岁的%s在杭州上学", age, name)
    println()

    //    (3) 字符串模板（插值字符串）：通过$获取变量值
    println(s"${age}岁的${name}在杭州上学")
//    (4) 三引号多行输出


  }

}
