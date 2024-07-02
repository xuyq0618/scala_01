package chapter04

import scala.util.control.Breaks

object Test06_Break {
  def main(args: Array[String]): Unit = {

    Breaks.breakable(
      for(a <- 1 until 5) {
        if( a==3)
          Breaks.break()
        println(a)
      }
    )



  }
}
