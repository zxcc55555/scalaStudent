package scalaStudent
import util.control.Breaks._

object BreakTest {
  def main(args: Array[String]): Unit = {
    breakable{
      for(i<-0 until 10) {
        println(i)
        if(i==5){
          break
        }
      }
    }

    for(i<-0 until 10){
      breakable{
        if(i==3||i==6) {
          break
        }
        println(i)
      }
    }
  }
}
