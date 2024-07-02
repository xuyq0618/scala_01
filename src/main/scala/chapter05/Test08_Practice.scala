package chapter05

object Test08_Practice {
  def main(args: Array[String]): Unit = {
    //练习1  定义一个匿名哈函数，将他作为值传递给变量，要求func(0,"",'0') 返回false ,其他情返回true。参数类型为func(Int,String,char)，返回值类型为布尔值
    var func0 = (a: Int, b: String, c: Char) => {
      if (a == 0 && b == "" && c == '0') false else true
    }

    //调用
    println(func0(0, "", '0'))
    println(func0(1, "", '0'))
    println(func0(0, "hello", '0'))
    println(func0(0, "", '1'))

    println("================================================================")
    //练习2
    //   定义一个函数func,接收一个int类型的参数，返回一个函数，记作f1();
    //   f1()接收一个string类型的参数，返回一个函数，记作f2();
    //   f2()接收一个char类型的参数，返回一个布尔值
    //   要求调用函数func(0)("")('0'),返回false,其余返回true

    def func(a: Int): String => (Char => Boolean) = {

      def f1(b: String): Char => Boolean = {

        def f2(c: Char): Boolean = {
          if (a == 0 && b == "" && c == '0') false else true
        }

        f2
      }

      f1
    }

    //调用
    println(func(0)("")('0'))
    println(func(1)("")('0'))
    println(func(0)("111")('0'))
    println(func(0)("")('1'))

    //匿名函数化 简写
    println("===================================================")
    def func1(a: Int): String => (Char => Boolean) = {
      b => c => if (a == 0 && b == "" && c == '0') false else true
    }
    //调用
    println(func1(0)("")('0'))
    println(func1(1)("")('0'))
    println(func1(0)("111")('0'))
    println(func1(0)("")('1'))

    //柯里化
    println("===================================================")
    def func2(a: Int)(b:String)(c:Char):Boolean= {
     if (a == 0 && b == "" && c == '0') false else true
    }
    //调用
    println(func2(0)("")('0'))
    println(func2(1)("")('0'))
    println(func2(0)("111")('0'))
    println(func2(0)("")('1'))

























  }
}

