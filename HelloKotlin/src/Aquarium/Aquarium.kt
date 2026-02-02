package Aquarium

class Aquarium (var lenght: Int = 100, var width: Int = 20, var height: Int = 40){

    var volume : Int
        get() = width * height * lenght / 1000
        set(value) {height = (value * 1000) / (width*lenght)}

    var water = volume * 0.9

    constructor(numberOfFish: Int) : this(){
        val water: Int = numberOfFish * 2000
        val tank : Double = water + water * 0.1
        height = (tank / (lenght * width)).toInt()
    }

}

fun main(){
    val symptoms : MutableList<String> = mutableListOf("white spots", "red spots", "not eating", "bloated", "belly up")
    symptoms.add("white fungus")
    symptoms.remove("white fungus")

    println(symptoms.subList(4, symptoms.size))

    val cures : Map<String, String> = mapOf("White spots" to "Ich" , "red sores" to "hole disease")

}