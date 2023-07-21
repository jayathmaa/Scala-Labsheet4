

import scala.io.StdIn

object Q01 {
  def chooseTheRate(deposit:Double): Double = {
    if(deposit<=20000){
      (2.0/100);
    }else if(deposit<=200000){
      (4.0/100);
    }else if(deposit<=2000000){
      (3.5/100);
    }else{
      (6.5/100);
    }
  }

  def calInterest(deposit:Double): Double = {
    val rate=chooseTheRate(deposit);
    val interest=deposit*rate;
    interest;
  }

  def main(args: Array[String]): Unit= {
    printf("Insert the amount :");
    val depositAmount=scala.io.StdIn.readDouble();
    val interest=calculateInterest(depositAmount);
    println("\nThe interest per month : "+interest);
    println("The interest per Year :"+interest*12);
  }
}
