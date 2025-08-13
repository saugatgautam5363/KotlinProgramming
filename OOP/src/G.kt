open class people{
   open fun name(name: String){
        println("My name is $name")
    }
}
class Mans(name: String) : people(){
    override fun name(name: String) {
        println("My name is $name")
    }
}

fun main(){
    val nameList = mutableListOf<String>()
    println("how many name you want to store?: ")
    val count = readln().toInt()

    for(i in 1..count){
        println("Enter the names: ")
        val name = readln()
        nameList.add(name)
    }
    for(n in nameList){
        val mane = Mans(n)
        mane.name(n)
    }
}


