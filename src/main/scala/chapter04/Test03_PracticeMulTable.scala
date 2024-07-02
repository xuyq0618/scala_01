package chapter04

object Test03_PracticeMulTable {
  def main(args: Array[String]): Unit = {
 //打印九九乘法表
    for(i <- 1 until  10;j <- 1 to i) {
      print(s"${j}*${i}=${i*j} ")
      if(i==j)
       println()
      }
    }


}

