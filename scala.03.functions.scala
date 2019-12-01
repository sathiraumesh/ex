def myFirstFunction():String ={"my first function "}
def welcome(name:String)={"my name is"+name}

// scala automaticaly infers  the  return type so the return type is optinal and you can improve your code
def myFirstFunction() ={"my first function "} 

// the = is the thing that infers the return type if not provided it will return type Unit
 def myFirstMethod(){ "exciting times ahead" }

 // if the function is simple and if you dont have any of the parameters passing to the method you could define  the function  and call it as follows 
 def myFirstMethod = "my first method"
 myFirstMethod

// scala return type is optional  and the type is not infered at the declaration.It is declared when it is calling
  def max(a: Int, b: Int) = if(a > b) a else b

//  parameter- ized type
  def toList[A](value:A) = List(value)
  toList(1)
  toList("Scala rocks")

  //functional literals
  val evenNumbers = List(2, 4, 6, 8, 10)
  evenNumbers.foldLeft(0) { (a: Int, b:Int) => a + b }
        // some more improved ways
        evenNumbers.foldLeft(0) { (a, b) => a + b }
        evenNumbers.foldLeft(0) { _ + _ }

//closures in scala
def foldLeft(initialValue: Int, operator: (Int, Int) => Int)= { ... }
// eg
val breakException = new RuntimeException("break exception")
def breakable(op: => Unit) {
     try {
            op
        } catch { case _ => }
}
def break = throw breakException
def install = {
    val env = System.getenv("SCALA_HOME")
    if(env == null) break
    println("found scala home lets do the real work")
}

breakable(install)
 // or using inline

 brekable{
    val env = System.getenv("SCALA_HOME")
    if(env == null) break
    println("found scala home lets do the real work")
}
 

