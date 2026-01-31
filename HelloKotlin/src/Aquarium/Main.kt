package Aquarium

fun main(args: Array<String>){
    buildAquarium()
}

fun buildAquarium(){
    val myAquarium = Aquarium()
    println("Lenght:${myAquarium.lenght} " +
            "Width:${myAquarium.width} " +
            "Height:${myAquarium.height} ")

    println("volume:${myAquarium.volume}")

    val smallAquarium = Aquarium(lenght = 20, width = 15, height = 30)
    println("Lenght:${smallAquarium.lenght} " +
            "Width:${smallAquarium.width} " +
            "Height:${smallAquarium.height} ")

    println("volume:${smallAquarium.volume}")

    val aquarium2 = Aquarium(numberOfFish = 9)
    println("Lenght:${aquarium2.lenght} " +
            "Width:${aquarium2.width} " +
            "Height:${aquarium2.height} ")

    println("volume:${aquarium2.volume}")
}
