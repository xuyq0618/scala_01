package chapter08

object Test02_MatchTypes {
  def main(args: Array[String]): Unit = {

    //1、匹配常量
    def describConst(x:Any):String = x match {
      case 1 => "Int one"
      case "hello" => "String hell0"
      case true => "Boolean true"
      case "+" => "Char +"
      case _ => "defult"
    }

    println(describConst(1))
    println(describConst("hello"))
    println(describConst())

    println("===================================")
    //2、匹配类型
    def describeTpe(x:Any):String = x match {
      case i:Int => "Int:" + i
      case s:String => "String:" + s
      case list:List[String] => "List:" + list
      case array: Array[Int] => "Array:" + array.mkString(",")
      case _ => "default"
    }

    val a = Array(12,12,11,23,45,67)
    println(describeTpe(a))

    val l = List("1","2")
    println(describeTpe(l))
    println(describeTpe(Array(12,12,11,23,45,67)))


    //3、匹配数组
    for (arr <- List(
      Array(0),
      Array(1,0),
      Array(0,1,0),
      Array(1,1,0),
      Array(2,4,7,15),
      Array("hello",2,30),
      Array(0),
    ))
      {
        val result = arr match {
          case  Array(0) => "0"
          case Array(x,y) => "Array(1,0)"
          case Array(0,_*) => "以0开头的数组"
          case Array(x,0,z) => "中间为1的数组"
          case _ => "something esle "
        }
        println(result)
      }


    //4、匹配列表(基本 同上、特殊)
    val  lst1 = List(1,2,3,4,5,6)
    val  lst2 = List(3)

    def matchListTest(lst:List[Int]) = {
        lst match {
          case first :: second :: rest => println(s"first:$first,second:$second,resst:$rest")
          case _ => println("something else")
        }
    }

    matchListTest(lst1)
    matchListTest(lst2)

    //5、匹配元组（基本 同上 、特殊）
    //(1) 在变量声明中匹配
    val (x, y) = (1, 2)
    println(s"x=$x,y=$y")


    val List(first,second,_*) = List(2,3,4)
    println(s"first:$first,second:$second")

    val fir::sec::rest = List(1,2,3,4,5,6)
    println(fir)
    println(sec)
    println(rest)

//    (2)for 推导式中进行模式匹配
    val lt:List[(String, Int)] = List(
      ("a",2),
      ("b",3),
      ("c",12),
      ("v",22),
      ("a",233)
    )

    //方法1、
    for(elem <- lt) println(elem._1,elem._2)

    //方法2将list的元素直接定义为元组，对变量赋值
    for((word,count) <- lt) println(word+":"+count)

    //不考虑某个位置的变量，只遍历key or value
    for((key,_) <- lt) println(key)
    println("==================")
    for((_,v) <- lt) println(v)


  }
}
