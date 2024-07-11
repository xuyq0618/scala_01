package chapter07

object Test11_CommonOp {
  def main(args: Array[String]): Unit = {
    val list  = List(1,2,3,4,5,6,7)
    val set = Set(12,2,2,33,45,6)


    //1、获取集合长度
    println(list.length)

    //2、获取集合大小
    println(set.size)

    //3、循环遍历
    for(elem <- list) println(elem)
    for(elem <- set) println(elem)

    set.foreach(println)

    //4、迭代器
    for (e <- list.iterator) println(e)
    for (e <- set.iterator) println(e)

    //5、生成字符串
    println(set.mkString("--"))

    //6、是否包含
    println(set.contains(12))

  }

}
