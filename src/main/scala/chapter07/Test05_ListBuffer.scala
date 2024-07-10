package chapter07

import scala.collection.mutable.ListBuffer

object Test05_ListBuffer {
  def main(args: Array[String]): Unit = {
    //1、创建可变列表
    val list1:ListBuffer[Int] = new ListBuffer[Int]()
    val list2 = ListBuffer(23,33,44,55,66)

    println(list1)
    println(list2)

//    2、添加元素
    list1.append(111,222)
    println(list1)

    list1.prepend(1111111)
    println(list1)

//    3、列表合并

    list1 ++= list2 // list1改变
    println(list1)

    val list3 = list1 ++ list2
    println(list3)

//    4、修改元素

    list1(0) = 100
    println(list1)

    list1.update(0,199)
    println(list1)

    //5、删除元素
    list1.remove(1) //删除位置1上的元素
    println(list1)

    list1 -= 222
    println(list1)
  }


}
