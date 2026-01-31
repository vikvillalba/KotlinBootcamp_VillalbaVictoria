data class SpiceContainer(var spice: Spice) {
    val label = spice.name
}


fun main(){
    val spiceCabinet = listOf(SpiceContainer(Curry("Yellow Curry", "mild")),
        SpiceContainer(Curry("Red Curry", "medium")),
        SpiceContainer(Curry("Green Curry", "spicy")))
    println(spiceCabinet)
}