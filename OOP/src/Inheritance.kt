open class Animal {
    open fun eat() {
        println("eating........")
    }

}
class Dog: Animal() {
    fun bark(){
        println("Braking.....")
    }
}
class Cat : Animal(){
    override fun eat(){
        println("Cat eat something")
    }
}
fun main(){
    val d = Dog()
    d.bark()
    val c = Cat()
    c.eat()
}