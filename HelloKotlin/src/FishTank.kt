fun canAddFish(tankSize: Int, currentFish: List<Int>, fishSize: Int = 2, hasDecorations: Boolean = true): Boolean {
    val maxCapacity = if (hasDecorations) tankSize * 0.8 else tankSize.toDouble()
    val totalLength = currentFish.sum() + fishSize
    return totalLength <= maxCapacity
}

fun main() {
    println(canAddFish(10, listOf(3, 3)))
    println(canAddFish(tankSize = 10, currentFish = listOf(3, 3)))
    println(canAddFish(10, listOf(3, 3), fishSize = 3))
    println(canAddFish(10, listOf(3, 3), fishSize = 3, hasDecorations = false))
}