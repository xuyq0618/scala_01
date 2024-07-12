package chapter09plus

object Test03_Gnerics {
  def main(args: Array[String]): Unit = {
    //1、
    // 逆变[-T] 作为参数类型传入时，父子关系存在，与定义时相反
    // 协变[+T] 作为参数类型传入时，父子关系存在，与定义时相同
    // 不变[T]  父子关系不存在了，不能父类引用指向子类对象了
    val child:Parent = new Child // 可以 这是多态

    val childList:MyCollection[Parent] = new MyCollection[Child]


//    2、上下限
    def test[A <: Child](a: A) = {
      println(a.getClass.getName)
    }

//    test[Parent](new Child) // error
    test[Child](new SubChild)
  }
}
// 定义继承关系
class Parent {}
class Child extends Parent {}
class SubChild extends Child


//定义带泛型的集合类型
class MyCollection[+E] {}