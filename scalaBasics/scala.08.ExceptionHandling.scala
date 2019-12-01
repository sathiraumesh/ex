def rangeMatcher(num:Int)= num match{
    case within10 if within10 <=10 =>println("within 0 or 10")
    case within100 if within100 <=100 =>println("within 11 or 100")
    case within100 if within100 <=1000 =>println("within 101 or 1000")
    case _=> throw new IllegalArgumentException("only values between 0 and 1000 are allowed")
}

try {
   rangeMatcher(1000)
} 
catch { 
    case e: IllegalArgumentException =>println( e.getMessage) 
     }