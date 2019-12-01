// can be declared once and the value associated cannot be changed 
val constant = 87
// value can change
var variable = 87
// assigning the default value 
var willKnowLater:String = _
// can use stop claculation  when declration  can be only used with val
var a = 1
lazy val b = a + 1
a = 5
b
//patternized variable declrations :: is called cons
 val first :: rest = List(1, 2, 3)