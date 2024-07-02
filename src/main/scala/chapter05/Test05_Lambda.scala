package chapter05

object Test05_Lambda {
  def main(args: Array[String]): Unit = {
    //lambda表达式，赋值给一个变量
    val fun: String => Unit = (name: String) => {
      println(name)
    }
    //调用
    fun("alibaba great")


    //定义一个函数，参数为一个函数
    println("==================================")
    def f(func: String => Unit):Unit = {
      func("bytedance great")
    }
    //调用
    f(fun)
    f((name: String) => {println(name)})

    //匿名函数至简原则
    //1、参数类型可以省略，调用函数的形参已经声明了
    println("---------------------------------------")
    f((name) => {println(name)})

    //2、如果只有一个参数，（）也可以省略。注意：0和多个参数，（）不可省略
    println("---------------------------------------")
    f(name => {
      println(name)
    })

    //3、如果只有一行，{}可省
    println("---------------------------------------")
    f(name => println(name))

    //4、如果参数只出现一次，参数可省，且后面参数可用_代替
    println("---------------------------------------")
    f(println(_))

    //4、如果推断出println是函数体，不是调用，那么（_）也可省
    println("---------------------------------------")
    f(println)


    //示例:定义一个二元运算函数，只操作1和2两个数，具体操作通过函数参数传入
    println("---------------------------------------")
    def dealFunctionOneAndTwo(func:(Int,Int)=>Int):Int={
      func(1,2)
    }

    //定义lambda
    var add = (a:Int,b:Int) => a + b
    var minus = (a:Int,b:Int) => a - b

    //调用

    println(dealFunctionOneAndTwo(add))
    println(dealFunctionOneAndTwo(minus))

    //简化
    println("---------------------------------------")
    println(dealFunctionOneAndTwo((a:Int,b:Int) => a + b))

    println("---------------------------------------")
    println(dealFunctionOneAndTwo((a, b) => a + b))

    println("---------------------------------------")
    println(dealFunctionOneAndTwo( _ + _)) //a+b
    println(dealFunctionOneAndTwo( _ - _)) //a-b
    println(dealFunctionOneAndTwo( -_ + _)) //b-a = -a+b














  }
}
