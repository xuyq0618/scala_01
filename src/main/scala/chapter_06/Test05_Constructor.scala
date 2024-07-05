package chapter_06

object Test05_Constructor
{
  def main(args: Array[String]): Unit = {

    //创建对象
    val s1 = new Student1()
    println(s1.name)
    println(s1.age)

    println("====================================")
    val s2 = new Student1("bob")

    println("====================================")
    val s3 = new Student1("mike",20)

  }
}

class  Student1() {
  // 定义属性
  var name: String  = _
  var age:Int = _

  println("1、主构造方法被调用")


  //2、声明辅助构造方法
  def this(name: String) {
    this() // 直接调用主构造器
    println("2、辅助构造方法一被调用")
    this.name = name
    println(s"name: $name age:$age")
  }

  def this(name:String,age:Int){
    this(name) //间接调用主构造方法
    println("3、辅助构造方法二被调用")
    this.age = age
    println(s"name: $name age:$age")

  }


}