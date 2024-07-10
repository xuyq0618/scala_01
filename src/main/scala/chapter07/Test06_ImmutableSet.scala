package chapter07

/***
 * 无序 不重复
 */
object Test06_ImmutableSet {
  def main(args: Array[String]): Unit = {
    //1、创建Set
    val s1 = Set(12, 12, 22, 22, 22, 34, 56, 7, 8) // 通过伴生对象的apply方法
    println(s1)

    val s2 = Set(1,2,3,4,5,5) // 通过伴生对象的apply方法
    println(s2)

    //2、添加元素
//    val s3 = s1.+(20)
    val s3 = s1 + 20
    println(s3)

    //3、合并Set
    val s4 = s3 ++ s2
    println(s4)

    //4、删除元素
    val s5 = s4 - 56 -20
    println(s5)
  }

}
