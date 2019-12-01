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

//adding elements to an list 
val oldList = List(1, 2)
val newList = 3 :: oldList // adding to the forward of the list
 val newList = oldList :+ 3 // adding to the backward of the list

 // Nil is used to represen an empty object and we can use it to create a empty list
 val myList = "This" :: "is" :: "immutable" :: Nil

 // deleting an elemenyt from the list 
 val afterDelete = newList.filterNot(_ == 3)