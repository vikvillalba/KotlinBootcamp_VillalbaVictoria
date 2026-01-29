import java.util.Random

fun main(args : Array<String>) {
    println("hi ${args[0]}")
    feedTheFish()

    var bubbles = 0
    while (bubbles < 50){
        bubbles++
    }
    repeat(2){
        println("a fish is swimming")
    }

    eagerExample()
}

fun eagerExample(){
    val decorations = listOf("rock", "pagoda", "plastic plant", "alligator", "flowerpot")
    val eager = decorations.filter { it[0] == 'p' }
    println(eager)

    val filtered = decorations.asSequence().filter { it[0] == 'p'}
    println(filtered)
}

fun feedTheFish(){
    val day = randomDay()
    val food = fishFood(day)
    println("Today is $day and the fish eat $food")

    swim("slow")

    if(shouldChangeWater("sunday")){
        println("Change the water today")
    }
}

fun getDirtySensorReading() = 20

fun shouldChangeWater( day : String, temperature : Int = 22, dirty : Int = getDirtySensorReading()) : Boolean{
    fun isTooHot(temperature : Int) = temperature > 30
    fun isDirty(dirty : Int) = dirty > 30
    fun isSunday(day: String) = day == "sunday"

    return when {
        isTooHot(temperature) -> true
        isDirty(dirty) -> true
        isSunday(day)-> true
        else -> false
    }
}


fun swim (speed : String = "fast"){
    println("swimming $speed ")
}
fun randomDay() : String{
    val week = listOf("monday", "tuesday", "wednesday", "thursday", "friday", "saturday", "sunday")
    return week[Random().nextInt(7)]
}

fun fishFood (day : String) : String {
    return when (day){
        "monday" -> "flakes"
        "tuesday" -> "pellets"
        "wednesday" -> "redworms"
        "thursday" -> "granules"
        "friday" -> "mosquitoes"
        "saturday" -> "lettuce"
        "sunday" -> "plankton"
        else -> "fasting"
    }
}