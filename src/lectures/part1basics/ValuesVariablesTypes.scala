package lectures.part1basics

object ValuesVariablesTypes extends App {
 val x: Int =  42 // VALS ARE INMUTABLE
 val z = 42 // compiler can figure out the type
 println(x)

 val aString: String = "Hello World"
 val aBoolean: Boolean =  true
 val aChar: Char = 'a' // single char between single quotes
 val anInt: Int = x
 val aShort: Short =  4613
 val aLong: Long = 22222222298798L // use capital L
 val aFloat: Float = 2.0F
 val aDouble: Double = 3.1415

 //variables

 var aVariable: Int = 4
 aVariable = 5 // side effects
}
