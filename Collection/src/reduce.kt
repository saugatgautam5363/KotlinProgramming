fun main(){
    val price : Array<Int> = arrayOf(100,345,56,400)
    val total = price.reduce{acc, prices -> prices + prices }
    println("Total bill $total")
}