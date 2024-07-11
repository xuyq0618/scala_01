package chapter07

object Test14_HighLevelFunc {
  def main(args: Array[String]): Unit = {
    val l = List(11,22,33,4,55,6,7,88,0)

    //1、过滤 filter
    //选取偶数
    val evenList = l.filter(_ % 2 == 0)
    println(evenList)

    //2、map
    //每个元素乘2
    println(l.map(_*2))

    //3、扁平化  flatten
    val l2 = List(List(1,2,34),List(2,3,4,5),List(33,33,44,55))
    println(l2.flatten)

    //4、扁平映射 group by
    val strings = List("hello world","hello scala","hello java","we study!")

    val splitList = strings.map(_.split(" "))
    val flattenList = splitList.flatten
    println(flattenList)

    val l3 = strings.flatMap(_.split(" ")) // 先map，再扁平化
    println(l3)

   //5、分组 groupBy
   //给定一组词汇，按照首字母进行分组
   val wordList = List("china","canada","america","bob","bar")
    println(wordList.groupBy(_.charAt(0))) // Map(b -> List(bob, bar), a -> List(america), c -> List(china, canada))

  }

}
