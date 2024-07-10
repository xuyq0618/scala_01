package chapter07

import scala.collection.mutable

object Test09_MutableMap {
  def main(args: Array[String]): Unit = {
    //1、创建map
    val m1: mutable.Map[String, Int] = mutable.Map("A" -> 12, "hello" -> 23, "sasa" -> 22)
    println(m1)


    //2、增加元素
    m1.put("a",10)
    println(m1)

    m1 += (("aa",100))
    println(m1)

    //3、删除元素
    m1.remove("aa")
    println(m1)


    m1 -= ("aa")
    println(m1)

    //4、更新元素
    m1.update("aa",12)
    m1.update("sasa",12)
    println(m1)


//    5、合并
    val m2: mutable.Map[String, Int] = mutable.Map("AA" -> 12, "hello2" -> 23, "sasa" -> 111)

    m1 ++= m2
    println(m1)




  }

}
