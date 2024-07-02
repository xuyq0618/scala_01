package chapter05

object Test03_FunctionParameter {

  def main(args: Array[String]): Unit = {
    //1、可变参数
    def f1(a:String*):Unit = {
      println(a)
    }
    f1("a","v","sss")
    f1("a","v")
    f1()

    println("==================================")

    //2、如果参数列表中存在多个参数，那么可变参数一般放置在最后
    def f2(name:String,addrs:String*):Unit = {
      println(s"name:${name},addrs:${addrs}")
    }
//    def f2( addrs: String*,name: String): Unit = {
//      println(s"name:${name},addrs:${addrs}")
//    }
    f2("alice","yuhang","xihu","gongshu")
    f2("alice","yuhang","xihu","gongshu")

    println("==================================")

    //3、参数默认值，一般将有默认值的参数放置在最后
    def f3(name:String,addrs:String = "杭州") :Unit = {
      println(s"name:${name},addrs:${addrs}")
    }
    f3("bob")
    f3("alice","yuhang")

    println("==================================")

    //4、带名参数
    def f4(name:String,age:Int = 20):Unit = {
      println(s"name:${name},age:${age}")
    }
    f4(name = "hadoop")
  }

}
