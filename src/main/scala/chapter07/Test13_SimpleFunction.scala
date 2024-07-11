package chapter07

object Test13_SimpleFunction {
  def main(args: Array[String]): Unit = {
    val l1 = List(1,2,3,-4,5)
    val l2 = List(("a",5),("b",4),("c",3),("d",2))

//    1、求和
    println(l1.sum)
//    2、求乘积
    println(l1.product)
//    3、最大值
    println(l1.max)
//    println(l2.maxBy(elem => elem._2)
      println(l2.maxBy(_._2))
//    4、最小值
      println(l1.min)
//    5、排序
    println(l1.sorted)
    println(l1.sorted(Ordering[Int].reverse))

    println(l2.sortBy(_._2))
    println(l2.sortBy(_._2)(Ordering[Int].reverse))

    println(l1.sortWith(_<_))
    println(l1.sortWith(_>_))
  }

}
