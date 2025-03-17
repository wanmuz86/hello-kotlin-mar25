fun main() {
    
    // Implicit Declaration - We don't declare the data type
    // Kotlin will imply the data type based on initial value
  
  // Declaring variable in Kotlin
    var name = "Muzaffar"
    println(name) // Print with new line (enter)
    
  // Declaring a constant in Kotlin
  val age = 30 // Value of constant cannot be changed
    println(age)
    //age = 35 // This will cause an error
    
    // Explicit Declaration
    
    val number: Int = 10
    val pi: Double = 3.14
    val isKotlinFun: Boolean = true
    val letter:Char = 'K'
    val greeting:String = "Hello Kotlin"
    
    println(number)
    println(pi)
    println(isKotlinFun)
    println(letter)
    println(greeting)
    
    // Mathematical Operation
    
    val a = 10
    val b = 3
    
    val sum = a + b
    val minus = a - b
    val product = a * b
    val division = a / b // Integer division , because a and b is Integer 
   	val modulo = a % b
    
    // If a is changed to double, eg 10.0 then 10.0/3 = 3.33335
    
    println(sum)
    println(minus)
    println(product)
    println(division)
    println(modulo)
    
    // Boolean
    
    val beliBajuRaya = true
    val buatKuihRaya = false
    
    val andResult = beliBajuRaya && buatKuihRaya
    // Both needs to be true for it to be true
    val orResult = beliBajuRaya || buatKuihRaya
    // One of it needs to be true for it to be true
    val notResult = !beliBajuRaya
    // Reverse of 
    
    println(andResult)
    println(orResult)
    println(notResult)
    
    // If else
    
    val umur = 18
    val withParent = true
    
    if (umur < 13){
        println("You cannot watch the movie")
    }
    else if (umur < 18){
        println("You can watch the movie with parent")
    }
    else {
        println("You can watch the movie")
    }
    
    
    if (umur < 13 || (umur < 18 && !withParent)){
        println("You cannot watch the movie")
    }
    else {
        println("You can watch the movie")
    }
    
    // ternary operator 
    
    val result = if (umur >= 18) "Adult" else "Minor"
    println(result)
    
    // Switch case - when
    
    val day = 1
    
    when (day){
        1 -> println("Monday")
        2 -> println("Tuesday")
        3 -> println("Wednesday")
        4 -> println("Thursday")
        5 -> println("Friday")
        6,7 -> println("Weekend")
        else -> println("Invalid Day")
    }
    
    
    // For loop
    
    for ( i in 1..6){
        println(i); // Dari 1 sehingga 6 termasuk 6
    }
    
    for ( i in 1 until 6) {
        println(i)// Dari 1 sehingga 6 (tidak termasuk 6)  = 5
    }
    
    // Every iteration i += 2
    
    for ( i in 1 .. 10 step 2) {
        println(i)
    }
    
    // Every iteration i -= 1
    
    for ( i in 10 downTo 1){
        println(i)
    }
    
    // Iterating list  (Tomorrow we will go in detail)
    
    val fruits = listOf("Apple", "Banana","Cherry")
    
    for (fruit in fruits){
        println(fruit)
    }
    
   
}
