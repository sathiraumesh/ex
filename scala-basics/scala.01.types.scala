

val x :Int =21 
val decimal =12345l
val hexa = 0x23
val octa =023
val byte:Byte =2
val float = 0.0f
val exponent  = 1e30
val ss = 1. toString
println(ss)

// character  literals

val capB:Char = 'B'
// val capB = '\102'
val new_line = '\n'
val \u0061\u006e\u0073 = 42


val ? = scala.math.Pi
def ?(x:Double) = scala.math.sqrt(x)

// string literals

val bookName = "Scala in \"Action\""

val multiLine = """This is a
| multi line
| string""".stripMargin

// string interpolation 
val name = "Sathira"
s"myName is $name"

val height = 1.9d
val nameSecond = "James"
println(f"$nameSecond%s is $height%2.2f meters tall")
// in the repl enviornmnet
// :imports