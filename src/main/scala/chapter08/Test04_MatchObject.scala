package chapter08

object Test04_MatchObject {
  def main(args: Array[String]): Unit = {
    val stu = Student("bob",29)

    stu match {
      case  Student("bob",29)=> println("同一个人")
      case _ => println("不同")
    }
    
  }

  //定义类
  class Student(var name:String,var age:Int)

  //定义伴生对象
  object Student {
    def apply(name:String,age:Int):Student = {
      new Student(name,age)
    }
    //必须实现一个unapply方法，用来对对象属性进行拆解
    def unapply(student: Student):Option[(String,Int)] = {
      if(student == null){
        None
      }else {
        Some((student.name,student.age))
      }
    }
  }

}
