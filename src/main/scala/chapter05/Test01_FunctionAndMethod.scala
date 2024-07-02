package chapter05

object Test01_FunctionAndMethod {
  def main(args: Array[String]): Unit = {
    //定义函数
    def sayHi(name: String): Unit = {
      println("hi:" + name)

    }

    //调用函数
    sayHi("alice")

    //调用对象方法（类下面的函数）
    Test01_FunctionAndMethod.sayHi("bob")

    //    //调用对象方法中的函数
    //    Test01_FunctionAndMethod.sayHi("jack")

    // 调用有返回值的对象方法
    val re = Test01_FunctionAndMethod.sayGoodBye("mike")
    println(re)

  }

  //  定义对象方法
  def sayHi(name: String): Unit = {
    println("Hi:" + name)

    def sayHello(): Unit = {
      println("hello")
    }

    sayHello()
  }

  def sayGoodBye(name: String): String = {
    return "goodbye:" + name
  }
}
