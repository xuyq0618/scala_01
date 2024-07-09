package chapter06

object Test11_Object {
  def main(args: Array[String]): Unit = {
//    val s11 = new Student11("bob", 20)  //构造方法私有化，不允许在外部调用构造器
//    s11.printInfo()

      val s12 = Student11.newStudent11("bob",22)
      s12.printInfo()

      val s13 = Student11.apply("alice", 33)
      s13.printInfo()

      val s14 = Student11("jack", 44) //apply可以省略
      s14.printInfo()


  }

  class Student11 private (var name:String,var age:Int){ //构造方法私有化，不能直接通过主构造器new对象了，只能通过调用伴生对象的对象实例的创建方法
    def printInfo(): Unit = {
      println(s"name:$name,age:$age,school:${Student11.school}")
    }
  }

  //伴生对象
  object Student11{
    val school:String  = "Tsinghua University" //静态属性 （伴生对象可以访问所属类的所有属性）

    //定义一个类的
    def newStudent11(name:String,age:Int):Student11 = new Student11(name,age)

    //apply 方法 ,调用时apply可以省略
    def apply(name:String,age:Int):Student11 = new Student11(name,age)

  }
}
