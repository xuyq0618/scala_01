package chapter07

import scala.collection.mutable

object Test19_Queue {
  def main(args: Array[String]): Unit = {
    val q1 = new mutable.Queue[String]()

    q1.enqueue("1","2","3","4")
    println(q1)
    q1.dequeue()
    println(q1)
    q1.dequeue()
    println(q1)
    q1.dequeue()
    println(q1)
    q1.dequeue()
    println(q1)

  }

}
