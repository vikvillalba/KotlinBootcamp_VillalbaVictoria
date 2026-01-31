package Aquarium.Decorations

fun main(){
    makeDecorations()
}

fun makeDecorations(){
    val d1 = Decorations("granite")
    val d2 = Decorations("slate")
    val d3 = Decorations("slate")
    println(d1)
    println(d2)
    println(d3)

    println(d1.equals(d2))
    println(d2.equals(d3))

    val d4 = d3.copy()
    val d5 = Decorations2("cristal", "wood", "diver")
    println(d5)
}

data class Decorations(val rocks : String){}
data class Decorations2 (val rocks: String, val wood: String, val diver: String){}