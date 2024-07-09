package chapter07

object Test01_ImmutableArray {
  def main(args: Array[String]): Unit = {
    //1、创建数组
    val arr:Array[Int] = new Array[Int](5)
    //另一种创建方式
    val arr2 = Array(12,12,11,23,45,67)

    //2、访问元素
    println(arr(0))
    println(arr(1))
    println(arr(2))
    println(arr(4))

    arr(0) = 11
    arr(1) = 22
    arr(2) = 32
    arr(4) = 445

    println(arr(0))
    println(arr(1))
    println(arr(2))
    println(arr(4))


    println("=======================")
    //3、数组遍历
    //1) 普通for 循环
    for (i <- 0 until(arr.length)) {
      println(arr(i))
    }

    println("=======================")
    //2）直接遍历所有元素，增强for循环
    for (elem <- arr) println(elem)

    println("=======================")
    //3）迭代器
    val iter = arr2.iterator
    while(iter.hasNext) println(iter.next())
    println("=======================")
    //4）调用foreach方法
//    arr2.foreach((elem:Int)=>println(elem))
    arr2.foreach(println) // 匿名函数至简

    //4、添加元素
    val newArr =  arr2.:+(1000)  // 末尾添加元素(只针对不可变数组)
    println(newArr.mkString("--"))

    val newArr2 =  newArr.+:(10001)  // 头部添加元素
    println(newArr2.mkString("--"))
    //简化版
    val newArr4 = arr2 :+ 109 // 运算符本质是方法调用，可以省略. 用空格代替
    println(newArr4.mkString("--"))

    val newArr5=  1092 +: arr2 //  头部添加元素 注意
    println(newArr5.mkString("--"))



  }

}
