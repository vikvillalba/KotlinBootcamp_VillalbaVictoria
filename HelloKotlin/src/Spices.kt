interface Grinder {
    fun grind()
}

enum class Color(val rgb: Int) {
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF),
    YELLOW(0xFFFF00);
}

interface SpiceColor{
    val color : Color
}

object YellowSpiceColor : SpiceColor{
    override val color = Color.YELLOW
}

sealed class Spice(val name : String, val spiciness: String = "mild", colorDelegate : SpiceColor) : SpiceColor by colorDelegate{
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
        println("Init: $name created. Color: $color")
    }

    abstract fun prepareSpice()
}

class Curry (name: String, spiciness: String, colorDelegate: SpiceColor = YellowSpiceColor) :
    Spice(name, spiciness, colorDelegate), Grinder {

    override fun prepareSpice() {
        grind()
    }

    override fun grind() {
        println("Grinding the $name into a fine powder...")
    }

}

fun main(args: Array<String>) {
    val myCurry = Curry("Madras Curry", "spicy")
    println("Color: ${myCurry.color}")

    println("Heat Level: ${myCurry.heat}")
    myCurry.prepareSpice()
}


