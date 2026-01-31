package Aquarium

class Aquarium (var lenght: Int = 100, var width: Int = 20, var height: Int = 40){

    var volume : Int
        get() = width * height * lenght / 1000
        set(value) {height = (value * 1000) / (width*lenght)}

    var water = volume * 0.9

    constructor(numberOfFish: Int) : this(){
        val water: Int = numberOfFish * 2000
        val tank : Double = water + water * 0.1
        height = (tank / (lenght * width)).toInt()
    }

}