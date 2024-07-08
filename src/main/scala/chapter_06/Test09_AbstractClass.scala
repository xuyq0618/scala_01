package chapter_06

object Test09_AbstractClass {
  def main(args: Array[String]): Unit = {
    val s9 = new Student9
    println(s9.name)
    println(s9.age)
    s9.eat()
    s9.sleep()
  }

  abstract class Person9{
    //非抽象属性
    val name:String = "person"

    //抽象属性
    var age:Int

    //非抽象方法
    def eat(): Unit = {
      println("person eat")
    }

    //抽象方法
    def sleep(): Unit
  }

  //定义具体实现子类
  class Student9 extends Person9 {
    //实现抽象属性和方法
    var age: Int = 18
     def sleep(): Unit = {
       println("student sleep")
     }

    //继承非抽象属性和方法
    override val name: String = "student"

    override def eat(): Unit = {
      super.eat() //调用父类方法
      println("student eat")
    }
  }
}
