require(args.size>=3,"requires three arguments <operation> <value1> <value2>")

val command =args.head.toLowerCase;
val head::valueArguments = args.toList
val parsedListvalue=valueArguments.map(_.toDouble)





 def handleAdd(list:List[Double])={
     val result =list.sum
     println(result)
 }
 def handleSub(list:List[Double])={
     val result =list.sum
     println(result)
 }
 def handleDiv(list:List[Double])={
     val result =list.sum
     println(result)
 }
 def handleMul(list:List[Double])={
     val result =list.sum
     println(result)
 }

 command match {
    case "add" => handleAdd(parsedListvalue)
    case "sub" => handleSub(parsedListvalue)
    case "div" => handleDiv(parsedListvalue)
    case "mul" => handleMul(parsedListvalue)
    case _ =>println("Illegal command printed")
 }