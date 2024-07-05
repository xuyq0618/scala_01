package chapter_06

object Test02_PackageObject {
  def main(args: Array[String]): Unit = {
    println(commValue)
    commMethod()

    //注意：包对象必须和包在同一层级，不然访问不到
  }
}
