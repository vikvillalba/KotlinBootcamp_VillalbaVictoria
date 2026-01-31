class Spice1(val name: String, val spiciness: String = "mild") {

    val heat: Int
        get() {
            return when (spiciness) {
                "mild" -> 5
                "spicy" -> 7
                "wild" -> 10
                else -> 0
            }
        }

    init {
        println("Spice created: $name ($spiciness) -> Heat Level: $heat")
    }
}

fun makeSalt(): Spice1 {
    return Spice1("Salt", "sweet")
}

fun main() {
    val myCurry = Spice1("Curry", "mild")

    val spiceList = listOf(
        Spice1("Cayenne", "spicy"),
        Spice1("Jalapeno", "wild"),
        Spice1("Paprika", "mild"),
        Spice1("Vanilla", "sweet"),
        makeSalt()
    )

    val mildSpices = spiceList.filter { it.heat <= 5 }

    println("\nSpices with heat <= 5:")
    mildSpices.forEach { println(it.name) }
}