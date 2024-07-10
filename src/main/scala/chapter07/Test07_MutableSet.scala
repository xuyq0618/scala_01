package chapter07

import scala.collection.mutable

object Test07_MutableSet {
  def main(args: Array[String]): Unit = {
    //1、创建Set
    val s1: mutable.Set[Int] = mutable.Set(12, 22, 33, 44, 55)

    //2、添加元素
    s1.add(222)
    println(s1)

    s1 += 111
    println(s1)

    //3、删除元素
    s1.remove(111)
    println(s1)


  }

}
