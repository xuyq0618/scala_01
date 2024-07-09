package chapter_06

object Test16_TraitSelfType {
  def main(args: Array[String]): Unit = {
    var aa = new RegisUser("BOB","SSS")
    aa.insert()
  }
}

//定义User类
class User(val name:String,val pwd:String)

trait UserDao {
  _: User =>

  //向数据库插入数据
  def insert():Unit = {
    println(s"insert into db:${this.name}")
  }
}

//定义注册用户类
class RegisUser(name:String,password:String) extends User(name,password) with UserDao {

}
