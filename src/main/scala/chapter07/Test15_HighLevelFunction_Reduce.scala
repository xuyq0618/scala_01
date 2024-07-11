package chapter07

object Test15_HighLevelFunction_Reduce {
  def main(args: Array[String]): Unit = {
    val list = List(1,2,3,4)

    //1、reduce
    println(list.reduce(_+_))
    println(list.reduceLeft(_+_))
    println(list.reduceRight(_+_))

    println(list.reduceLeft(_-_))
    println(list.reduceRight(_-_)) //1-(2-(3-4)))

    //2、fold redeuce加了个初始值
    println(list.fold(10)(_+_))
    println(list.foldRight(10)(_-_))

  }
}
