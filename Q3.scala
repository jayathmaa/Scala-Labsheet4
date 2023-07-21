package T4

object Q3 {
  def toUpper(str:String): String = {
    val upperStr=str.toUpperCase;
    upperStr;
  }
  def toLower(str:String): String = {
    val lowerStr=str.toLowerCase;
    lowerStr;
  }
  def formatNames(name:String)(formatter: String => String): String = {
    formatter(name);
  }
  def main(args: Array[String]): Unit={
    val names=List("Benny","Niroshan","Saman","Kumara");

    val opA=formatNames(names(0))(toUpper);

    val opB1=formatNames(names(1).substring(0,2))(toUpper);
    val opB2=names(1).substring(2,8);
    val opB=opB1.concat(opB2);

    val opC=formatNames(names(2))(toLower);

    val opD1=formatNames(names(3).substring(5,6))(toUpper);
    val opD2=names(3).substring(0,5);
    val opD=opD2.concat(opD1);

    println(opA);
    println(opB);
    println(opC);
    println(opD);

  }
}
