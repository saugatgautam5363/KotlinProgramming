package Function

fun main(){
    println(sumAllNumber(1,3,4,6,7,7,8,9,3))
    printNumbers("Values: ", 1, 2, 3)

}
fun sumAllNumber(vararg numbers: Int):Int{
    return numbers.sum()
}
fun printNumbers(prefix: String, vararg numbers: Int) {
    println(prefix + numbers.joinToString())
}

