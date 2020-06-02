package scalaStudent

import scala.util.control.Breaks

object BreaksTest {
  def main(args: Array[String]) {
    val numList1 = List(1,2,3,4,5);
    val numList2 = List(11,12,13);

    val outer = new Breaks;
    val inner = new Breaks;

    outer.breakable {
      for( a <- numList1){
        println( "Value of a: " + a );
        if ( a == 5){
          outer.break
        }
        inner.breakable {
          for( b <- numList2){
            println( "Value of b: " + b );
            if( b == 12 ){
              inner.break
            }
          }
        } // 内嵌循环中断
      }
    } // 外部循环中断
  }
}
