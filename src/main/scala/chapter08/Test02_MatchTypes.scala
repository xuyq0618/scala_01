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

  }
}
