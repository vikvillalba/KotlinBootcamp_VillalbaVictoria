fun rollDice(){
    val rollDice = { sides: Int ->
        if (sides == 0) 0
        else (1..sides).random()
    }

    val rollDice2: (Int) -> Int = { sides ->
        if (sides == 0) 0
        else (1..sides).random()
    }

    gamePlay(rollDice2)
}

fun gamePlay(diceRoll : (Int) -> Int){
    val result = diceRoll(6)
    print(result)

}
fun main(){
    rollDice()
}