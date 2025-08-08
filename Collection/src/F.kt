fun main(){
    val Price:Array<Int> = arrayOf(100,304,403,104)
    val maxPrice = Price.filter { it>300 }
    val total = Price.reduce{acc, prices -> prices + prices }
    println("Max price is $maxPrice")
    println("Total sum of array: $total")
}