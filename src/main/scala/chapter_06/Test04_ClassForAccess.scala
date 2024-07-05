package chapter_06

object Test04_ClassForAccess {


}

//定义父类
class Person {
  private var idCard: String = "33010111111111111"
  protected  var name :String = _
  var sex:String = _
  private[chapter_06] var age:Int = _

  def printInfo() = {
    println(s"Person:$idCard $name $sex $age")
  }

}