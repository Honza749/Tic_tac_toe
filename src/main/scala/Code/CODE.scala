package Code

import scala.collection.mutable.ListBuffer
import scala.io.StdIn.readLine


object CODE {
  def main (args: Array[String]): Unit ={
  }
  var list: Seq[String] = Seq("1", "2", "3", "4", "5", "6", "7", "8", "9")
  println (list.head + "|" + list(1) + "|" +list(2))
  println ("_ _ _")
  println (list(3) + "|" + list(4) + "|" +list(5))
  println ("_ _ _")
  println (list(6) + "|" + list(7) + "|" +list(8))


  var x = 0
  val pocet = ListBuffer("1", "2", "3", "4", "5", "6", "7", "8", "9")
  while(x < 10 ) {
    if (((list.head == list(1)) && (list(1) == list(2))) || (list(3) == list(4) && list(4) == list(5))|| (list(6) == list(7) && list(6) == list(8))
      || (list.head == list(3) && list.head == list(6))|| (list(1) == list(4) && list(1) == list(7))|| (list(2) == list(5) && list(2) == list(8))
      || (list.head == list(4) && list.head == list(8))|| (list(6) == list(4) && list(6) == list(2))){
      println ("Konec hry, gratuluji vitezi!")
      System.exit(0)
    }
    println("Vyber si pozici: (1-9) -")
    var cislo = readLine()
    while (!pocet.contains(cislo)) {
      println("Zkus jine cislo: ")
      val number = readLine()
      cislo = number
    }
    if (x % 2 != 0) {
      list = list.updated({
        cislo.toInt - 1
      }, "O")
      pocet -= cislo
    } else {
      list = list.updated({
        cislo.toInt - 1
      }, "X")
      pocet -= cislo
    }
    println (list.head + "|" + list(1) + "|" +list(2))
    println ("_ _ _")
    println (list(3) + "|" + list(4) + "|" +list(5))
    println ("_ _ _")
    println (list(6) + "|" + list(7) + "|" +list(8))
    println(list)
    x+=1
  }
  println("Bohuzel nikdo nevyhral :(")
}
