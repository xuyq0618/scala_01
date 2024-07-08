package chapter_06

import chapter_06.Test11_Object.Student11

object Test12_Singleton {
  def main(args: Array[String]): Unit = {
    val s11 = Student12.getInstance()
    s11.printInfo()
    println(s11)//chapter_06.Test12_Singleton$Student12@12843fce

    val s111 = Student12.getInstance()
    s111.printInfo()
    println(s111)//chapter_06.Test12_Singleton$Student12@12843fce
  }

  class Student12 private(val name:String,val age:Int) {
    def printInfo(): Unit = {
      println(s"name:$name,age:$age,school:${Student11.school}")
    }
  }

  object Student12{
//    //饿汉式
//    private val student:Student12 = new Student12("bob",29)
//    def getInstance():Student12 = student //生成对象实例，全局唯一

    //懒汉式（先判断实例是否存在）
      private var student:Student12 = _
      def getInstance():Student12 = {
        if(student == null) {
          student = new Student12("jack",10000)
        }
        student
      }


  }
}
