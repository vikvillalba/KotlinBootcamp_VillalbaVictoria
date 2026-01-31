class SimpleSpice {
    var name : String = "curry"
    var spiciness : String = "mild"

    fun getHeat() : Int{
        when(spiciness){
            "mild" -> return 5
            else -> return 0
        }
    }
}