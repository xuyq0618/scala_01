package chapter07



object Test08_ImutableMap {
  def main(args: Array[String]): Unit = {
    //1、创建map
    val m1: Map[String, Int] = Map("A" -> 12, "hello" -> 23, "sasa" -> 22)
    println(m1)

    //2、遍历元素
    m1.foreach(println)



    //3、取map中的所有key或者value
    for (key <- m1.keys) {
      println(s"${key}--> ${m1.getOrElse(key,0)}")
    }


    println("=============================")
    //4、访问某个key的value
    println(m1.get("A"))
    println(m1.get("A").get)

    println(m1.getOrElse("A",0))
    println(m1.getOrElse("a",0))

    println(m1("A"))


    //不可变不能新增元素
  }

}
