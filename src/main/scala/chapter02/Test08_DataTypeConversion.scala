package chapter02
/*
自动类型转换
 */
object Test08_DataTypeConversion {
  def main(args: Array[String]): Unit = {
    /*
    自动类型转换
     */
    //    (1)自动提升 原则：多种类型进行混合运算时，系统会将所有数据类型转换成最高精度的数据类型，再进行计算
    var a: Byte = 10
    var b: Short = 10000
    var c: Long = 100000L
    var d: Char = 'c'
    var re = a + b + c
    println(re)

    //    （2）把精度大的数值类型赋值给精度小的类型时，会报错；反之可以进行自动类型转换
    //    var e :Int = d
    //    println(s"e:${e}")
    //    var f: Int = c //error

    //    （3）（byte,short）和char之间不会相互自动转换
    //    var a1:Byte = b //error
    //     var a2:Byte  = d //error
    //    var a2:Short  = d // error
    //    var a2:Int  = d
    //    println(a2)

    var re2 = a + b + c + d
    println(re2)


    //    （4）byte short char 三者可以计算，在计算时首先会自动转换为int，赋值给变量时，需要是int类型
    var q1: Int = a + b + d
    var q2: Long = a + b + d // long也可以

    /*
    强制类型转换
     */
//    （1）高精度转低精度 调用toInt（toFloat、toLong、toChar）方法
    var w :Double = 12.3
    var w1 :Int = w.toInt // 原则：只保留整数部分

//   （2）（强制符号只针对最近的操作有效，往往会使用括号提升优先级）
    var t:Double = 13.8
    var  t1 :Int  = (w+t).toInt
    println(t1)

//    (3)数值类型和string之间类型转换
//    3.1 string转数值
    var aaa1 = "111"
    var aa2:Int = aaa1.toInt
    println(aaa1)

    var aaaa1 = "111.11"
    var aaaa2 :Int = aaaa1.toDouble.toInt
    println(aaaa2)

//    3.2数值转string
    var  s1:String = 222.toString
    var  s2:String = 222+""

  }

}
