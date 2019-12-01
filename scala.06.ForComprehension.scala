// iterating through a collection  imerative form
val files =new java.io.File(".").listFiles

for(file<-files){
    val fileName =file.getName
    if(fileName.endsWith(".scala"))println(file)
}

// in the above example the <- i a genrator the function of a genrator is to iterrate through a collection
// ‘for’ (‘(’ Enumerators ‘)’ | ‘{’ Enumerators ‘}’) {nl} [‘yield’] Exp

// improved codes
for(
file <- files;
fileName = file.getName;
if(fileName.endsWith(".scala")) ) println(file)

val aList = List(1, 2, 3)
val bList = List(4, 5, 6)

// {} are used as there ar more than 1 genrator and its optional we can use ()
 for { a <- aList; b <- bList } println(a + b)



 // functional form 
val result = for { a <- aList; b <- bList } yield a + b
for (r <- result) println(r)