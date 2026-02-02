import kotlin.math.absoluteValue

class Location(val width: Int = 4, val height: Int = 4) {
    val map = Array(width) { arrayOfNulls<String>(height) }

    var currentRow = 0
    var currentCol = 0

    fun updateLocation(direction: Direction) {
        when (direction) {
            Direction.NORTH -> currentCol = (currentCol + 1).rem(height)
            Direction.SOUTH -> currentCol = (currentCol - 1).rem(height)
            Direction.EAST -> currentRow = (currentRow + 1).rem(width)
            Direction.WEST -> currentRow = (currentRow - 1).rem(width)
            else -> {}
        }

        currentRow = (currentRow % width + width) % width
        currentCol = (currentCol % height + height) % height

        val description = map[currentRow][currentCol] ?: "Unknown Territory"
        println(description)
    }
}

enum class Direction {
    NORTH, SOUTH, EAST, WEST, START, END
}

class Game {
    var path = mutableListOf(Direction.START)
    val location = Location()

    val north = {
        path.add(Direction.NORTH)
        location.updateLocation(Direction.NORTH)
    }
    val south = {
        path.add(Direction.SOUTH)
        location.updateLocation(Direction.SOUTH)
    }
    val east =  {
        path.add(Direction.EAST)
        location.updateLocation(Direction.EAST)
    }
    val west =  {
        path.add(Direction.WEST)
        location.updateLocation(Direction.WEST)
    }

    val end = {
        path.add(Direction.END)
        println("Game Over: $path")
        path.clear()
        false
    }

    fun move(where: () -> Any) {
        where.invoke()
    }

    fun makeMove(input: String?) {
        when (input) {
            "n" -> move(north)
            "s" -> move(south)
            "e" -> move(east)
            "w" -> move(west)
            else -> move(end)
        }
    }
}

fun main() {
    val game = Game()

    while (true) {
        print("Enter a direction: n/s/e/w: ")
        val input = readLine()

        game.makeMove(input)

        if (input !in listOf("n", "s", "e", "w")) {
            break
        }
    }
}