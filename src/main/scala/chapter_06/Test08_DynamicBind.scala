package chapter_06

object Test08_DynamicBind {
  def main(args: Array[String]): Unit = {
    val stu:Person8 = new Student8  //子类对象赋值给父类的引用
    println(stu.name) // 属性名也可以动态绑定
    stu.hello()  // 函数：动态绑定
  }

  class  Person8 {
    val name: String = "person"
    def hello(): Unit = {
      println("hello proson")
    }
  }

  class  Student8 extends Person8 {
   override val name: String = "Student8"

    override def hello(): Unit = {
      println("hello Student8")
    }
  }
}
