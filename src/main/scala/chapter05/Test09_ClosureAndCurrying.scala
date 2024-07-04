package chapter05

object Test09_ClosureAndCurrying {
  def main(args: Array[String]): Unit = {
    //定义一个两数相加的函数
    def add(a:Int,b:Int):Int = {
      a+b
    }

    //1、考虑固定一个加数的场景
    def addByFour(b:Int):Int = {
      4+b
    }

    //2、扩展固定加数改变的情况
    def addByFive(b:Int):Int = {
      5+b
    }

    //3、将固定加数作为另一个参数传入，但是是作为“第一层参数”传入
    def addByFour2():Int=>Int= {
      val a = 4
      def addB(b:Int):Int = {
        a+b
      }
      addB
    }

    //调用
    println(addByFour2()(2))

    //扩展
    def addAB(a:Int):Int=>Int= {
      def addB(b:Int):Int={
        a+b
      }
      addB
    }

    println("========================================")
    //调用
    println(addAB(35)(24))
    //加5操作
    var add5 = addAB(5)
    println(add5(10))
    println(add5(100))
    //加6操作
    var add6 = addAB(6)
    println(add6(10))
    println(add6(100))
    //加100操作
    var add100 = addAB(100)
    println(add100(10))
    println(add100(100))

    //匿名函数化
    def addAB2(a: Int): Int => Int = a + _

    println("========================================")
    //调用
    println(addAB2(35)(24))
    //加5操作
    var add5_1 = addAB2(5)
    println(add5_1(10))
    println(add5_1(100))
    //加6操作
    var add6_1 = addAB2(6)
    println(add6_1(10))
    println(add6_1(100))
    //加100操作
    var add100_1 = addAB2(100)
    println(add100_1(10))
    println(add100_1(100))

    //柯里化（闭包的书写方式之一，闭包不一定用柯里化书写，但柯里化一定是闭包）
    def addABCurrying(a: Int)(b: Int): Int = {
      a + b
    }

    println("========================================")
    //调用
    println(addABCurrying(35)(24))
    //加5操作
    var add5_2 = addABCurrying(5) _ //这里返回的是一个函数，不是一次函数调用
    println(add5_2(10))
    println(add5_2(100))
    //加6操作
    var add6_2 = addABCurrying(6) _ //这里返回的是一个函数，不是一次函数调用
    println(add6_2(10))
    println(add6_2(100))
    //加100操作
    var add100_2 = addABCurrying(100) _ //这里返回的是一个函数，不是一次函数调用
    println(add100_2(10))
    println(add100_2(100))
  }
}
