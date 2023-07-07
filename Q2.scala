package T4

import scala.io.StdIn

object Number {
  def printNegative(): Unit = {
    println("Negative number");
  }

  def printZero(): Unit = {
    println("Zero");
  }

  def printEven(): Unit = {
    println("Even Number");
  }

  def printOdd(): Unit = {
    println("Odd Number");
  }

  def checkNumber(num:Int): Unit = {
    num match{
      case 0 => printZero();
      case n if n<0 => printNegative();
      case n if n%2==0 => printEven();
      case n if n%2!=0 => printOdd();
    }
  }

  def main(args: Array[String]): Unit = {
    print("Insert an the number :");
    val num=scala.io.StdIn.readInt();
    checkNumber(num);
  }
}
