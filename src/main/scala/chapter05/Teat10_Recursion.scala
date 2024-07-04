package chapter05

object Teat10_Recursion {
  def main(args: Array[String]): Unit = {
    //
    println(fact(5))
    println(tailFact(5))
  }
  //递归实现阶乘
  def fact(n:Int) :Int = {
    if(n==1) return 1
    fact(n-1) * n
  }

  //尾递归实现（普通递归函数存在栈中，层层压栈，容易堆栈溢出。创建一个变量，每次存当前的结果）
  def tailFact(n:Int):Int = {
    def loop(n:Int,currRes:Int):Int = {
      if(n==0) return currRes
      loop(n-1, currRes*n)
    }
    loop(n,1)
  }

}
