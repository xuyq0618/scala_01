package chapter02

import java.io.{File, PrintWriter}
import scala.io.Source

object Test07_DataType {
  def main(args: Array[String]): Unit = {
    //    1、整数类型 带符号： byte(1字节:+-2^7) short(2:+-2^15) int(4：+-2^31) long(8:+-2^63)
    val a = 10 //默认int类型
    val b: Byte = 21
    //    val b :Byte = 129
    val c: Short = 30000
    //    val c :Short = 40000
    val d: Int = 300000000
    //    val e  :Long= 3000000000
    val e = 3000000000L

  }

  //2、浮点类型
  //  val f1:Float = 1.0
  val f1: Float = 1.0f //浮点类型默认double
  val d1 = 1.234567889

//  3、Char类型 表示单个字符，底层存的是ascii码，可以转换成Int
  var a1 :Char = 'a'
  println(a1)

  var b1: Char = '9'
  println(b1)

  var c1 =  (b1+1).toChar
  println(c1)


//  4、布尔类型 Boolean 只有true 、false
  var isTrue :Boolean = true
  println(isTrue)


//  5、空类型
  //  5.1 Unit 定义函数返回值使用, 类似java中的void,只有一个实例值()
  def  m1() :Unit ={
    println("m1（）被调用了")
  }
  var a = m1()
  println(s"a的值是：${a}")
}
  //5.2空引用Null
  //  var n:Int = null // error

  //var stu:Student = new Student('a',11)
  //  print(stu)
//5.3 nothing 抛出异常的时候用