package chapter07

import scala.collection.mutable

object Test16_MergeMap {
  def main(args: Array[String]): Unit = {
    val m1 = Map("a"->1,"b"->2,"c"->6)
    val m2 = mutable.Map("a"->1,"b"->2,"c"->6,"d"->10)

    println(m1)
    val m3 = m1.foldLeft(m2)(
      (mergedMap,kv) => {
        val key = kv._1
        val value = kv._2
        mergedMap(key) = mergedMap.getOrElse(key,0) +value
        mergedMap
      }
    )
    println(m3)
  }

}
