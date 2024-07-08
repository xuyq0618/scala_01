package chapter_06

object Test13_Trait {
  def main(args: Array[String]): Unit = {
    val s13: Student13 = new Student13()
    s13.sayHello()
    s13.dating()
    s13.study()
    s13.play()

  }

  //定义父类
  class Person13 {
    val name:String = "person"
    var age:Int = 18
    def sayHello(): Unit = {
      println("hello from :",name)
    }

  }
  //定义特质
  trait Young {
    //声明抽象和非抽象属性
    var age:Int
    val name:String = "young"

    //声明抽象和非抽象方法
    def play(): Unit = {
      println("young people is playing")
    }
    def dating():Unit
  }


//  定义子类
  class Student13 extends Person13 with Young {
  //实现特质中的抽象属性和方法
  //重写冲突的属性
    override  val name:String = "student"
    def dating():Unit = println(s"student $name is dating")
    def study():Unit = println(s"student $name is studying")

  //重写父类方法
   override def sayHello(): Unit = {
     super.sayHello()
     println("hello from student:",name)
   }
  }

}
