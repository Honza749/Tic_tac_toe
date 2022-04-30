package Code

import scala.collection.mutable.ListBuffer
import scala.io.StdIn.readLine


object CODE {
  def main (args: Array[String]): Unit ={
  }
  println("Hráči 1, vyberte si přezdívku (1 - 10 znaků): ")
  var hrac1: String = readLine()
  while (hrac1.length >10 || hrac1.length<1){
    println("Zkus to znovu (1 - 10 znaků): ")
    hrac1 = readLine()
  }
  println(s"Hráči $hrac1, vyberte si symbol (se kterým budete hrát): ")
  var hrac1sym: String = readLine()
  while (hrac1sym.length != 1){
    println("Musí mít jeden charakter: ")
    hrac1sym = readLine()
  }
  println("Hráči 2, vyberte si přezdívku (1 - 10 znaků): ")
  var hrac2: String = readLine()
  while (hrac2 == hrac1 || hrac2.length >10 || hrac2.length <1){
    if (hrac2 == hrac1) {
      println("Nekopíruj po svém soupeři: ")
      hrac2 = readLine()
    }
    else {
      println("Zkus to znovu (1 - 10 znaků): ")
      hrac2 = readLine()
    }
  }
  println(s"Hráči $hrac2, vyberte si symbol (se kterým budete hrát): ")
  var hrac2sym: String = readLine()
  while (hrac2sym.length != 1 || hrac2sym == hrac1sym){
    if (hrac2sym == hrac1sym){
      println("Nekopíruj po svém oponentovi: ")
      hrac2sym = readLine()
    }
    else {
      println("Musí mít jeden charakter: ")
      hrac2sym = readLine()
    }
  }
  var list: Seq[String] = Seq("1", "2", "3", "4", "5", "6", "7", "8", "9")
  println (list.head + "|" + list(1) + "|" +list(2))
  println ("_ _ _")
  println (list(3) + "|" + list(4) + "|" +list(5))
  println ("_ _ _")
  println (list(6) + "|" + list(7) + "|" +list(8))


  var x = 0
  val pocet: ListBuffer[String] = ListBuffer("1", "2", "3", "4", "5", "6", "7", "8", "9")
  while(x < 9 ) {
    if (((list.head == list(1)) && (list(1) == list(2))) || (list(3) == list(4) && list(4) == list(5))|| (list(6) == list(7) && list(6) == list(8))
      || (list.head == list(3) && list.head == list(6))|| (list(1) == list(4) && list(1) == list(7))|| (list(2) == list(5) && list(2) == list(8))
      || (list.head == list(4) && list.head == list(8))|| (list(6) == list(4) && list(6) == list(2))){
      if (x % 2 == 0) println (s"$hrac2 vítězí!")
      else println(s"$hrac1 vítězí!")
      System.exit(0)
    }
    if (x % 2 != 0) {
      println(s"$hrac2 vyber si pozici: (1-9) -")
      var cislo = readLine()
      while (!pocet.contains(cislo)) {
        println("Zkus jine cislo: ")
        cislo = readLine()
      }
      list = list.updated({
        cislo.toInt - 1
      }, hrac2sym)
      pocet -= cislo
    } else {
      println(s"$hrac1 vyber si pozici: (1-9) -")
      var cislo = readLine()
      while (!pocet.contains(cislo)) {
        println("Zkus jine cislo: ")
        cislo = readLine()
      }
      list = list.updated({
        cislo.toInt - 1
      }, hrac1sym)
      pocet -= cislo
    }
    println (list.head + "|" + list(1) + "|" +list(2))
    println ("_ _ _")
    println (list(3) + "|" + list(4) + "|" +list(5))
    println ("_ _ _")
    println (list(6) + "|" + list(7) + "|" +list(8))
    x+=1
  }
  println("Remíza ¯\\_( ͡⊙ ͜ʖ ͡⊙)_/¯")
}
