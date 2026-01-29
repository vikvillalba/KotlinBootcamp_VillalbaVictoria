
fun main(args : Array<String>) {
    val spices = listOf("curry", "pepper", "cayenne", "ginger", "red curry", "green curry", "red pepper" )
    val curriesSorted = spices.filter { it.contains("curry") }.sortedBy { it.length }
    println("Curries sorted by size: $curriesSorted")

    val AEFormat = spices.filter { it.first() == 'c' && it.last() == 'e' }
    println("Starts with c and ends with e: $AEFormat")
    val firstThreeWithC = spices.take(3).filter { it.startsWith('c') }

    println("First 3 starting with c: $firstThreeWithC")
}

