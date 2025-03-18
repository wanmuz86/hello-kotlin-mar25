fun main() {
   
 // List - > Immutable List (List tidak boleh diubah) / Mutable List (List boleh diubah)
    
    val immutableList = listOf("Alice","Bob","Charlie", "David", "Eve")
    
    // First item of the list
    println(immutableList.first())
    // Last item of the list
    println(immutableList.last())
    
    // Item at index 2
    println(immutableList[2])
    
    //contains -> Adakah Bob di dalam List
    println("Bob" in immutableList)
    
    
    //forEach -> Iterating a List
    // Untuk setiap item (it) di dalam List -> println (it)
    immutableList.forEach { println(it) }
    
    // map -> Interating a List and perform an operation on the item
    //Untuk setiap item (it) di dalam List -> Lakukan sesuatu (Change the casing)
    // map operation will create a new List, eg: mappedList
    val mappedList = immutableList.map { it.uppercase() }
    println(mappedList)
    
    // filter -> Iterating a List and bring out the item fulfill the criteria
    // Untuk setiap item (it) di dalam List -> Pastikan kriteria dipenuhi 
    // (bermula dengan C)
    
    val filteredList = immutableList.filter { it.startsWith("C") }
    println(filteredList)
    
    println("Mutable List exercise")
    
    
    // MutableList
    
    val mutableList = mutableListOf("Alice","Bob")
    
    // Add Charlie at the End of The List
    mutableList.add("Charlie") // Alice Bob Charlie
    
    // Add Zara at the beginning of the List
    mutableList.add(0,"Zara") // Zara Alice Bob Charlie
    
    // Remove the first item found
    mutableList.remove("Bob") // Zara Alice Charlie
    
    // Remove in the list all "Bob"
    
    mutableList.removeAll { it == "Bob" }
    
    // Remove at Index 1
    mutableList.removeAt(1) //// Zara  Charlie
    
    // Edit the item in the list
    mutableList[0] = "Alexa" //// Alexa  Charlie
    
    println(mutableList)
    
    val sortedList = mutableList.sorted() // Sort in ascending order
    val reversedList = mutableList.reversed() // Sort in descending order
    // Sort by our criteria, eg: length of word
    val sortedByLength = mutableList.sortedBy { it.length }
    
    println(sortedList)
    println(reversedList)
    println(sortedByLength)
    
    
    // Map  
    // Mutable and Immutable map
    
    val info = mapOf("name" to "Wan Muzaffar", "location" to "Bangi",
                     "profession" to "Trainer")
    
    println(info)
    println(info["name"])
    println(info["location"])
    // Is the map contains key profession?
    println(info.containsKey("profession")) 
     // Is the map contains value "Wan Muzaffar"?
    println(info.containsValue("Wan Muzaffar"))
    
    info.forEach { (key,value) -> println("Key is $key and value is $value")}
    
    val mutableMap = mutableMapOf("name" to "Alice", "location" to "Johor Bahru",
                                 "profession" to "Coordinator")
    
    // Add new key to the map
    mutableMap["contact"] = "0123456789"
    mutableMap.put("emergency contact","0123456789")
    
    println(mutableMap)
    // Remove contact from the Map
    mutableMap.remove("contact")
    // Update the value of name
    mutableMap["name"] = "John"
    println(mutableMap)
        
}
