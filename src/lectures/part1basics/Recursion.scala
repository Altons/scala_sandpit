package lectures.part1basics

import scala.annotation.tailrec

object Recursion  extends App {

  def factorial(n: Int): Int = {
    if (n <= 1) 1
    else {
     // println("Computing factorial of " + n + " - I need first factorial of " + (n - 1))
      val result = n * factorial(n - 1)
     // println("Computed factorial of " + n)
      result
    }
  }
  println(factorial(10))
  // println(factorial(5000)) stackoverflow error!

  def anotherFactorial(n:Int): BigInt = {
    def factorialHelper(x: Int, accumulator: BigInt): BigInt =
      if (x<=1) accumulator
      else factorialHelper(x-1,x*accumulator)
    factorialHelper(n,1)
  }
  //println(anotherFactorial(5000))
  // WHEN YOU NEED LOOPS, USE _TAIL_ RECURSION.

  // Make tail recursive the following functions
  // Concatenate string n times
  /*
    def aRepeatedFunction(aString: String, n: Int): String = {
    if (n == 1) aString
    else aString + aRepeatedFunction(aString, n-1)
   */
  def concat (s: String, n:Int, accumulator: String): String = {
     if(n <= 0) accumulator
     else concat(s,n-1, s + accumulator)
    }

  println(concat("Hello",5,""))

  // Prime tail recursive
  /*
    def isPrime(n: Int): Boolean = {
    def isPrimeUntil(t: Int): Boolean =
      if(t<=1) true
      else n % t !=0 && isPrimeUntil(t-1)
    isPrimeUntil(n/2)
   */
  def isPrime(n:Int) : Boolean = {
    @tailrec
    def isPrimeTailRec(t: Int, isStillPrime: Boolean): Boolean = {
      if(!isStillPrime) false
      else if(t<=1) true
      else isPrimeTailRec(t-1,(n % t)!= 0 && isStillPrime)
    }

    isPrimeTailRec(n/2,true)
  }
  println(isPrime(2003))
  println(isPrime(629))

  def fibonacci(n:Int): Int = {
    def fiboTailRec( i:Int, last: Int, nextToLast: Int): Int =
      if(i>=n) last
      else fiboTailRec(i+1, last+ nextToLast, last)

    if (n<=2) 1
    else fiboTailRec(2, 1, 1)
  }
  println(fibonacci(8))
}

