package chapter07

object Test04_List {
  def main(args: Array[String]): Unit = {
    //1、创建一个list
    val list1 = List(12,22,22,34)
    println(list1)

    //2、访问
    println(list1(2)) // 一般不关心某个位置上的元素

    //遍历
    list1.foreach(println)

    //3、添加元素
    val list2 = list1 :+ 12
    val list3 = 33 +: list1
    println(list2)
    println(list3)

    val list4  = 12 :: 22 :: 44 :: 55 :: Nil
    println(list4)

    //4、列表合并
    val list5 = list3 ::: list4
    println(list5)

    val list6 = list3 ++ list4
    println(list6)


  }

}
