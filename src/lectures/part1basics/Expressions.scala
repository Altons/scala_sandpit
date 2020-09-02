package lectures.part1basics

object Expressions extends App {
  val x =  1 + 2 //expression
  println(x)
  println(2 + 3 *4)
  // + - * / & | ^ << >> >>> (right shift with zero extension
  println(1 == x)
  // == != > >= < <=
  println(!(1==x))
  // ! && ||

  var aVariable = 2
  aVariable += 3 // also works with -= *= /=
  println(aVariable)

  //Instructions (DO) vs Expressions (VALUE)

  // IF expression
  val aCondition = true
  val aConditionValue = if(aCondition) 5 else 3
  println(aConditionValue)

  // Loops are discouraged - NEVER WRITE THIS AGAIN
  var i = 0

  while( i <10) {
    println(i)
    i+=1
  }

  // EVERYTHING in Scala is an Expression!

  val aWeirdValue =  (aVariable = 3) // Unit type == void
  println(aWeirdValue)

  // side effects: println(), whiles, reassinging

  // Code blocks

  val aCodeBlock = {
    val y = 2
    val z = y + 1

    if(z >2) "hello" else "goodbye"
  }


}
