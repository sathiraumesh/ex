val array = new Array[String](3)
array(0) = "this"
array(1) = "is"
array(2) = "mutable"


array.foreach(println)

// for command line arguments
args.foreach(println)

// list in scala are immutable and they return a new list when an action is done to a list
val myList = List("This", "is", "immutable")