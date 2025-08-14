open class Persons{
    open fun eat(){
        println("Eat a food...")
    }
}
open class Man(name: Unit) : Persons(){
    fun run(){
        println("Running......")
    }
}
class Woman : Man(name) {
    override fun eat(){
        println("Woman eat a food...")
    }
}
fun main(){
    val man = Man(name)
    val woman = Woman();
    man.eat()
    woman.eat()
    woman.run()
    man.run()
    woman.eat()
}