package chapter_06

import scala.beans.BeanProperty

object Test03_Class {
  def main(args: Array[String]): Unit = {
    //创建对象
    val s = new Student()
    // s.name // error 访问不到私有属性
    println(s.age)
    s.age = 19
    println(s.age)
  }

  //定义一个类
  class Student { //默认是public的
    //定义属性
    private var name = "alice"
    @BeanProperty // 与java兼容
    var age:Int = _ //_ 初始值 空
    var sex:String = _
  }

}
