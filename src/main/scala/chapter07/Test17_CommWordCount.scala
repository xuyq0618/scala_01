package chapter07

object Test17_CommWordCount {
  def main(args: Array[String]): Unit = {
    val stringList:List[String] = List(
      "hello",
      "hello world",
      "hello scala",
      "hello spark from scala",
      "hello flink from scala",
    )



    //1、对字符串进行切分，得到一个打散所有单词的列表
    val s2 = stringList.flatMap(_.split(" "))
    println(s2)

    //2、相同单词分组
    val s3:Map[String,List[String]] = s2.groupBy(w => w)
    println(s3)//Map(world -> List(world), flink -> List(flink), spark -> List(spark), scala -> List(scala, scala, scala), from -> List(from, from), hello -> List(hello, hello, hello, hello, hello))

    //3、分组之后的list取长度，得到每个单词的个数
    val s4: Map[String, Int] = s3.map(kv => (kv._1, kv._2.length))
    println(s4)

    //4、转换为列表，倒序取前三

    val result:List[(String,Int)] = s4.toList  //元组列表
        .sortWith(_._2>_._2)  //根据值倒序
        .take(3) //取前三
    println(result)




  }

}
