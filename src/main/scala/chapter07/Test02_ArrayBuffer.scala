package chapter07

import scala.collection.mutable.ArrayBuffer

object Test02_ArrayBuffer {
  def main(args: Array[String]): Unit = {
    //1、创建可变数组
    var arr1:ArrayBuffer[Int] = new ArrayBuffer[Int]()
    var arr2 = ArrayBuffer(1,2,3,4,5,6)



    println(arr2)
    println("==============================")
    for (elem <- arr2) println(elem)

    //2、访问数组元素
    println(arr2(1))
    arr2(1) = 3333
    println(arr2(1))


     //3、添加元素
    println("===================")
    arr1 += 10
    println(arr1)

    1009 +=: arr1
    println(arr1)


    arr2.append(11)
    arr2.prepend(33)
    arr2.insert(1,2222,22,22) //第一个参数是索引下标
    println(arr2)

    arr2.insertAll(2,arr1) //添加数组
    println(arr2)
    arr2.appendAll(arr1)
    println(arr2)

    //4、删除元素
    arr2.remove(1)
    println(arr2)

    arr2 -= 22
    println(arr2)


    //可变转不可变 可变.toArray  不可变.toBuffer
  }

}
