package chapter05

object Test11_ControlAbstraction {
  def main(args: Array[String]): Unit = {
    //1、传值参数
    def f(n:Int) ={
      println("n:"+n)
      println("n:"+n)
    }

    def f1(): Int = {
      println("f1调用")
      11
    }

    //调用
    f(f1())

    println("==================================================")

    // 2、传名参数 传递的不是具体值，而是代码块
    def  f2(n: =>Int) :Unit = {
      println("n:" + n)
      println("n:" + n)

    }

    //调用
    f2(22)
    f2(f1()) // 参数是函，调用几次参数就调用几次函数
    f2(
      {
        println("这是一个代码块")
        111
      }
    )
  }

}
