package chapter_06
//钻石问题特质叠加
//引用的几个特质，拥有相同的父亲，调用super.方法，会从右边往左拼接
object Test15_TraitOverlying {
  def main(args: Array[String]): Unit = {
    var mfb = new MyFootBall
    println(mfb.describe())
    println("==========================")
  }

}


//球类
trait Ball {
  def describe(): String = "ball"
}

//定义颜色特征
trait ColorBall extends Ball {
  var color: String = "red"

  override def describe(): String = "aaaaaaaaaaa:" + color + "-" + super.describe()
}

//定义种类特征
trait CategoryBall extends Ball {
  var cate: String = "foot"

  override def describe(): String = cate + "-" + super.describe()
}

// 自定义球
class MyFootBall extends CategoryBall with ColorBall {
  override def describe(): String = "my ball is:" + super.describe()
  //    override def describe(): String = "my ball is:"+super[CategoryBall].describe() //(指定某个类的方法)
}