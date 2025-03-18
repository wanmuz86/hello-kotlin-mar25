fun main() {
   
    val sum = add(10,3)
    println("Sum is $sum")
    
    greet();
    greet("Alice")
    
    println(square(3))
   
   // Pass function as the 3rd argument
   
   println(calculate(3,4,add))
   println(calculate(3,4,multiply))
   
   printMessage("Selamat berpuasa")
   printMessage("Selamat hari raya",3)
   
   // If i specify the argument name, arrangement does not matter
   println(fullName(lastName =  "Wan Hashim", firstName = "Wan Muzaffar"))
}

// FUnction add , take a of type Int, b of type Int
// Return type is Int, it will return a+b
fun add(a:Int, b:Int) : Int {
    return a + b
}

// FUnction with default argument,
fun greet(name:String = "Guest"){
    println("Hello $name")
}

// Function with named Parameters
fun fullName(firstName: String, lastName:String) : String {
    return "$firstName $lastName"
}

// lambda expression -> Function 1 line yang dimudahkan
// Function square, take num of type Interget as argument 
// Return type Int, num * num
// In lambda expression we don't have the word return , replace with -> 

val square : (Int) -> Int = { num -> num * num}

// Higher order function 
// Calling a function in another function
// Callback function

// Calculate function, accept a of type Int, b of Type Int and Return type is Int
// THe third argument is a function, that accept 2 Integers and return Int
fun calculate (a:Int, b:Int, operation: (Int, Int)-> Int) : Int {
    return operation(a,b)
}

val add : (Int,Int) -> Int = { a,b -> a+b}
val multiply: (Int, Int) -> Int = { a,b -> a*b}

/// Function overloading
// Multiple functions, same name
// But different number or type of arguments

fun printMessage(message:String){
    println("Message : $message")
}

fun printMessage(message:String, count:Int){
    repeat(count) { println("Message :$message")
    }
}











