package chapter06
//匿名子类
object Test10_Annoymous {
  def main(args: Array[String]): Unit = {
    val p10:Person10 = new Person10 {
      override val name: String = "messi"
      override def eat(): Unit = println("messi eat ")
    }

    println(p10.name)
    p10.eat()

  }

  abstract class Person10 {
    val name: String
    def eat():Unit
  }
}
