package chapter_06

object Test07_Inherit1 {
  def main(args: Array[String]): Unit = {
    val s1 = new Student7("alice", 20)
    val s2 = new Student7("bob", 21, "22222222")

  }

  class Person7() {
    var name: String = _
    var age: Int = _
    println("1、父类的主构造器被调用")

    def this(name: String, age: Int) {
      this()
      println("2、父类的辅助构造器被调用")
      this.name = name
      this.age = age
    }

    def printInfo(): Unit = {
      println(s"Person:$name,$age")
    }
  }

  class Student7(name: String, age: Int) extends Person7 { // 调用父类的主构造器（无参）
    println("3、子类的主构造器被调用")
    var stdNo: String = _

    def this(name: String, age: Int, stdNo: String) {
      this(name, age) //调用子类的主构造器
      println("4、子类的辅助构造器被调用")
      this.stdNo = stdNo
    }

    override def printInfo(): Unit = {
      println(s"Student:$name,$age,$stdNo")
    }
  }
}