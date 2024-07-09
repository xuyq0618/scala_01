package chapter06

object Test04_Access
{
  def main(args: Array[String]): Unit = {
    val p: Person = new Person()
//    println(p.name)  name 是protected ，仅在自己类内部和子类中能访问到
    println(p.age)
    println(p.sex)
    p.printInfo()

    val w: Worker = new Worker()
//    println(w.name) 访问不到
    println(w.age)
    println(w.sex)
    w.printInfo()

  }
}


//定义子类，继承Person
class Worker extends Person {
  override def printInfo(): Unit = {
//    idCard
    name = "bob"
    sex = "female"
    age = 20
    println(s"Worker: $name $sex $age")
  }
}