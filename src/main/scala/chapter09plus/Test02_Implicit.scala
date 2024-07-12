package chapter09plus

object Test02_Implicit {
  def main(args: Array[String]): Unit = {

    implicit val str:String = "alice"
    implicit val age:Int = 19

    def sayHello()(implicit name:String) ={
      println("hello:"+name)
    }
    sayHello() // 没有传参数，编译器自动去找和参数类型相同的 隐式参数

    //简化版
    def hiAge(): Unit = {
      println("hi, "+implicitly[Int])
    }
    hiAge()




  }

}
