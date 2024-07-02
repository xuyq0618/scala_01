package chapter05

object Test06_HighOrderFunction {
  def main(args: Array[String]): Unit = {
    //有参函数
    def f(n: Int): Int = {
      println("f被调用")
      n + 1
    }

    //无参函数
    def ff(): Int = {
      println("ff调用")
      10086
    }
    //调用
    var r:Int =f(2)
    println(r)


    //(一)函数作为值传递
    var f1 = f _ // 或者f(_)
    println(f1)

    var f2:Int=>Int = f //
    println(f2)

    println("==========================")
    var ff1 = ff _ // 或者f(_)
    println(ff1)

    var ff2:()=>Int = ff
    println(ff2)

    //(二)函数作为参数传递
    //定义一个二元计算函数
    def dealEvual(op:(Int,Int)=>Int,a:Int,b:Int):Int = {
      var c =a + b
      var d =a * b
      op(c,d)
    }

    //定义add函数
    def add(a:Int,b:Int) = {
      println("调用add")
      a+b
    }

    //调用dealEvual
    println(dealEvual(add,2,3))
    println(dealEvual(_+_,2,3)) // 匿名函数

  //函数作为返回值
    def f5():Int=>Unit = {
      def f6(n:Int):Unit={
        println("f6调用"+n)
      }
      return f6
    }
    //调用
    var aa = f5
    println(aa) // 返回引用,aa已经是f6了
    println(aa(111))
    println(aa(222))

    //




  }
}
