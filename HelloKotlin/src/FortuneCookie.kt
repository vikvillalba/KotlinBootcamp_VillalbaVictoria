fun main(){
    var fortuneCookie = getFortuneCookie(getBirthday())
    println("Your fortune cookie: ${fortuneCookie}")
    var i = 0
    while(fortuneCookie != "Take it easy and enjoy life!" && i < 10){
        fortuneCookie = getFortuneCookie(getBirthday())
        println("Your fortune cookie: ${fortuneCookie}")
        i++
    }

}

fun getFortuneCookie(birthday : Int) : String {
    val fortunes = listOf(
        "You will have a great day!",
        "Things will go well for you today.",
        "Enjoy a wonderful day of success.",
        "Be humble and all will turn out well.",
        "Today is a good day for exercising restraint.",
        "Take it easy and enjoy life!",
        "Treasure your friends because they are your greatest fortune."
    )

    var index : Int = 0

    when(birthday){
        in 28..31 -> index = 0
        in 1..6 -> index = 1
        7 -> index = 3
        10 -> index = 2
        15 -> index = 4
        in 16..20 -> index = 5
        in 21..27 -> index = 6
     else -> index = 0
    }

    return fortunes[index]
}

fun getBirthday() : Int {
    print("Enter your birthday: ")
    val input = readlnOrNull()
    return input?.toIntOrNull() ?: 1

}