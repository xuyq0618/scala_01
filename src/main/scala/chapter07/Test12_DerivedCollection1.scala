package chapter07

object Test12_DerivedCollection1 {
  def main(args: Array[String]): Unit = {
    val list = List(12, 2, 33, 44, 55, 66)
    val list2 = List(12, 2, 34, 5, 6, 7, 87)

    //1、获取集合的头
    println(list.head)
    //2、获取集合的尾（排除头剩下的）
    println(list.tail)
    //3、集合最后一个数据
    println(list.last)
    //4、集合初始数据
    println(list.init)
    //5、反转
    println(list.reverse)
    //6、取前（后）n个元素
    println(list.take(2))
    println(list.takeRight(3))
    //7、去掉前（后）n个元素
    println(list.drop(2))
    println(list.dropRight(2))
    //    8、并集
    val l3 = list.union(list2)
    println(l3)
    //    9、交集
    val l4 = list.intersect(list2)
    println(l4)
    //    10、差集
    val l5 = list.diff(list2)
    println(l5)

    val l6 = list2.diff(list)
    println(l6)
    //    11、拉链
    println("zip:"+list.zip(list2))
    println("zip:"+list2.zip(list))
    //    12、滑窗
    println("-----------------------------------")
    for(elem <- list.sliding(3)) println(elem)
    for(elem <- list.sliding(4,2)) println(elem)

    for(elem <- list.sliding(3,3)) println(elem)  // 窗口大小=步长 ：滚动窗口
  }
}
