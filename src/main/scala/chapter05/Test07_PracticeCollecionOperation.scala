package chapter05

object Test07_PracticeCollecionOperation {
  def main(args: Array[String]): Unit = {
    val  arr0:Array[Int]  = Array(11,22,33,44,55)
     //定义一个函数，用来处理集合中的元素。传入集合、处理函数，返回处理后的集合
    def collectionOperationFunc(arr:Array[Int],func:Int=>Int):Array[Int] ={
      for (elem <- arr) yield func(elem)
    }

    //定义+2操作函数
    def addTwo(a:Int):Int = {a+2}

//    普通调用
    var newArr:Array[Int]  = collectionOperationFunc(arr0,addTwo)
    println(newArr.mkString(","))

    //匿名函数方式调用
    println(collectionOperationFunc(arr0,_*10).mkString(","))
  }

}
