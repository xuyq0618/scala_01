package chapter03

object Test01_TestOperator {
  def main(args: Array[String]): Unit = {
    //1、算数运算符
    val a: Int = 10 / 3 // 3 两个int除 会丢掉小数部分
    val b: Double = 10.0 / 3 //3.33333333
    val c: Double = (10.0 / 3)
    println(c.formatted("%5.3f")) //3.333

    val d = 10 % 4
    println(d)

//    2、比较运算符
    val s1: String  = "hello"
    val s2: String = new String("hello")
    println(s1 == s2) //true 与java不同，java比较的是引用的内存地址
    println(s1.equals(s2))//true

    println(s1.eq(s2))//flase  判断引用地址

//    3、逻辑运算符(有短路特性)
    /*
    && 逻辑与
    || 逻辑或
    ！ 逻辑非
     */


  }


}
