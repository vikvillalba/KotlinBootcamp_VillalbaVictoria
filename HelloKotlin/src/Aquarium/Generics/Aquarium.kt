package Aquarium.Generics

open class WaterSupply(var needsProcessed: Boolean)

class TapWater : WaterSupply(true) {
    fun addChemicalCleaners() {
        needsProcessed = false
    }
}

class FishStoreWater : WaterSupply(false)

class LakeWater : WaterSupply(true) {
    fun filter() {
        needsProcessed = false
    }
}

class Aquarium<T: WaterSupply>(val waterSupply: T){
    init {
        check(!waterSupply.needsProcessed) { "needs water bro" }
    }
}

fun genericExample(){
    val aquarium: Aquarium<TapWater> = Aquarium(TapWater())
    aquarium.waterSupply.addChemicalCleaners()


}