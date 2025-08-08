open class Persons{
    open fun eat(){
        println("Eat a food...")
    }
}
open class Man : Persons(){
    fun run(){
        println("Running......")
    }
}
class Woman : Man(){
    override fun eat(){
        println("Woman eat a food...")
    }
}
fun main(){
    val man = Man()
    val woman = Woman();
    man.eat()
    woman.eat()
    woman.run()
    man.run()
    woman.eat()
}