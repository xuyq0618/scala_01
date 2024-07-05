package chapter_06

object Test06_ConstuctorParams1 {
  def main(args: Array[String]): Unit = {
    //创建对象
    val s2 = new Student2()
    s2.name = "mike"
    println(s2.name)
    println(s2.age)

    println("===================")
    val s3 = new Student3("bob", 19)
    println(s3.name)
    println(s3.age)

    println("===================")
    val s5 = new Student5("jack ma", 50,"hznu")
    println(s5.name)
    println(s5.age)
    println(s5.school)
    s5.printInfo()


  }
}


//无参构造器
class Student2 {
  println("1、Student2主构造器被调用")
  var name:String = _
  var age: Int = _
}

// 上面等价于
class Student3(var name:String,var age: Int) {
  println("2、Student3主构造器被调用")
}

class Student5(var name:String,var age: Int) {
  println("Student5主构造器被调用")
  var school:String = _
  //辅助构造器
  def this(name:String,age:Int,school:String) {
    this(name,age)
    println("Student5辅助构造器被调用")
    this.school = school
  }

  def printInfo(): Unit = {
    println(s"name:$name,age:$age,school:$school")
  }
}