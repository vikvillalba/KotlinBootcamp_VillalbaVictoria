fun whatShouldIDoToday(mood : String, weather : String = "sunny", temperature : Int = 24) : String {

    fun isHappyWalk (mood:String, weather: String) =  mood == "happy" && weather == "sunny"
    fun isTimeToMusic (mood:String, weather: String) =  mood == "happy" && weather == "clouded"
    fun isCoffee(mood:String, weather: String) = mood == "sad" && weather == "sunny"
    fun stayingInBed(mood:String, weather: String, temperature : Int) =  mood == "sad" && weather == "rainy" && temperature == 0
    fun isSwim(temperature: Int) =  temperature > 35

    return when {
        isHappyWalk("happy", "sunny") -> "go for a walk"
        isTimeToMusic("happy", "sunny") ->  "listen some music"
        isCoffee("sad", "sunny")-> "go for a coffee"
        stayingInBed("sad", "rainy", 0)-> "stay in bed"
        isSwim(37)-> "go swimming"
       else -> "listen to jcole !!!!"
    }
}

fun main(){
   print( whatShouldIDoToday("sad", "rainy"))
}