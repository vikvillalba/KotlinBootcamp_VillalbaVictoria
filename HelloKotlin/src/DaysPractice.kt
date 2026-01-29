import java.util.Calendar

fun dayOfWeek(){
    println("What day is today?")

    val today = Calendar.getInstance().get(Calendar.DAY_OF_WEEK)
    when(today){
        1 ->  println("Today is Sunday")
        2 ->  println("Today is Monday")
        3 ->  println("Today is Tuesday")
        4 ->  println("Today is Wednesday")
        5 ->  println("Today is Thursday")
        6 ->  println("Today is Friday")
        7 ->  println("Today is Saturday")
    }

}

fun main(args : Array<String>) {
    dayOfWeek()
}

