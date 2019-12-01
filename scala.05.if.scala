// in scala else is every thing is an edxpression and even the if control structures are also expressions
val useDefault = false
val result =if(useDefault) "custom.txt" else "default.txt"
println(result)
val grade='b'
val result2 = if (grade=='a')"a"else if (grade=='b') 'b' else 'c'
println(result2)
