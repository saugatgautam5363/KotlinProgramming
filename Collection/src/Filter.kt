fun main(){
    val price: Array<Int> = arrayOf(160,122,400)
    val expensive = price.filter { it>150 }
    println("Expensive Items is: $expensive")
}