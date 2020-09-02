package lectures.part1basics

object Functions extends App {
 def aFunction (a: String, b: Int): String = {
   a + " " + b
 }
  println(aFunction("Hello",5))

  def aParameterLessFunction(): Int = 42

  println(aParameterLessFunction())
  println(aParameterLessFunction)

  def aRepeatedFunction(aString: String, n: Int): String = {
    if (n == 1) aString
    else aString + aRepeatedFunction(aString, n-1)
  }
  println(aRepeatedFunction("Hello",3)) // When ussing loops - USE RECURSION

  def Greeting(name: String, age: Int): String = "Hi my name is " + name + " and I am " + age + " years old."
  println(Greeting("Victoria",5))

  def Factorial(n:Int): Int = {
    if (n<=0) 1
    else n * Factorial(n-1)
  }
  println(Factorial(5))

  def Fibonacci(n: Int): Int = {
    if (n<=2) 1
    else  Fibonacci(n-1) + Fibonacci(n-2)
  }
  println(Fibonacci(8))

  def isPrime(n: Int): Boolean = {
    def isPrimeUntil(t: Int): Boolean =
      if(t<=1) true
      else n % t !=0 && isPrimeUntil(t-1)
    isPrimeUntil(n/2)

  }
  println(isPrime(4))
  println(isPrime(3))
}
