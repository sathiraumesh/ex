ordinal(args(0).toInt)

def ordinal(number:Int) = number match {
    case 1 => println("1st")
    case 2 => println("2nd")
    case 3 => println("3rd")
    case 4 => println("4th")
    case 5 => println("5th")
    case 6 => println("6th")
    case 7 => println("7th")
    case 8 => println("8th")
    case 9 => println("9th")
    case 10 => println("10th")
    case _ => println("Cannot do beyond 10")
}

// in java we can match other types than object refernce
def printType(obj: AnyRef) = obj match {
    case s: String => println("This is string")
    case l: List[_] => println("This is List")
    case a: Array[_] => println("This is an array") case d: java.util.Date => println("This is a date")
}

printType("Hello")

// infix style operators

List(1, 2, 3, 4) match {
case f :: s :: rest => List(f, s) case _ => Nil
}

// using gaurd clauses
def rangeMatcher(num:Int) = num match {
case within10 if within10 <= 10 => println("with in 0 to 10")
case within100 if within100 <= 100 => println("with in 11 to 100")
case beyond100 if beyond100 < Integer.MAX_VALUE => println("beyond 100")
}

def ordinal(number:Int) = number match {
case tenTo20 if 10 to 20 contains tenTo20 => number + "th" 
case rest => rest + suffixes(number % 10)
}

