package chapter09plus

object Test01_Exception {
  def main(args: Array[String]): Unit = {
    try {
      val n = 10 / 0
      val n1 = 10 / 0
    } catch {
      case e:ArithmeticException => println("发生算数异常")
      case e:Exception => println("发生一般异常")
    } finally {
      println("处理结束")
    }
  }

}
