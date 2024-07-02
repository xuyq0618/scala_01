package chapter05

object Test04_Simpify {
  /*
  函数至简原则
   */
  def main(args: Array[String]): Unit = {
    def f0(name: String): String = {
      return name
    }

    println(f0("alice"))

    //1、return可以省略，scala使用函数体最后一行代码作为返回值
    println("========================")
    def f1(name: String): String = {
      name
    }

    println(f1("alice"))

    //2、如果函数体只有一行代码，可以省略花括号
    println("========================")

    def f2(name: String): String = name

    println(f2("alice"))

    //3、如果返回值类型可以推断出，:返回值类型也可以省略
    println("========================")

    def f3(name: String) = name

    println(f3("alice"))

    //4、如果有return,则返回值类型不能省
    println("========================")

    def f4(name: String):String = return name

    println(f4("alice"))

    //5、如果返回值类型声明为Unit,则return不起作用
    println("========================")

    def f5(name: String): Unit = return name

    println(f5("alice")) // 输出()

    //6、scala如果期望无返回值类型，可以省略等号(这里为什么不能省略{}???)
    println("========================")

    def f6(name: String) {println(name)}

    println(f6("alice")) // 输出alice和()

    //7、如果函数无参，但声明了参数列表，调用时可以省略()
    println("========================")

    def f7() { println("alibaba")}

    f7
    f7()

    //8、如果函数无参，也没声明了参数列表，调用时必须省略()
    println("========================")

    def f8 {
      println("alibaba")
    }

    f8

    //9、如果只关心处理逻辑，不关心函数名称，函数名和def也可省略(匿名函数：lamda表达式)
    println("========================")

    (name:String) => println(name)




  }

}
