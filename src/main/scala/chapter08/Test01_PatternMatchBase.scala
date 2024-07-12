package chapter08

object Test01_PatternMatchBase {
  def main(args: Array[String]): Unit = {
    //1、基本定义语法
    val x:Int = 1
    val y:String = x match {
      case 1 => "one"
      case 2 => "two"
      case 3 => "three"
      case _ => "defult"
    }
    println(y)


  //3、模式守卫
    def ads(num:Int):Int = {
      num match {
        case i if i >= 0 =>  i
        case i if i < 0 => -i
      }
    }

    println(ads(-100))
  }

}
