package chapter02

import jdk.internal.org.objectweb.asm.util.Printer

import java.io.{File, PrintWriter}
import scala.io.{Source, StdIn}

object Test06_FileIO {
  def main(args: Array[String]): Unit = {
//    1、从文件读取数据
    Source.fromFile("src/main/resources/test.txt").foreach(print)

//    2、将数据写入文件(调用java)
    val writer = new PrintWriter(new File("src/main/resources/output.txt"))
    writer.write("hello scala from java writer")
    writer.close()


  }

}
