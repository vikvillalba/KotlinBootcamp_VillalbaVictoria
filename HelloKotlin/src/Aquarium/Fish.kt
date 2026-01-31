package Aquarium

class Fish(val friendly: Boolean = true, volumeNeeded: Int) {
    val size : Int
    init{
        println("frist init block")
    }
    constructor() : this(friendly = true, volumeNeeded = 9){
        println("running secondary constructor")
    }
    init{
        if(friendly){
            size = volumeNeeded
        } else {
            size = volumeNeeded * 2
        }
    }
    init {
        println("constructed fish of size $volumeNeeded final size ${this.size}")
    }

    init {
        println("last init block")
    }
}

fun makeDefaultFish() = Fish(friendly = true, volumeNeeded = 50)
fun fishExample() {
    val fish = Fish(friendly = true, volumeNeeded = 20)
    println("is the fish friendly? ${fish.friendly}, it needs volume ${fish.size}")
}