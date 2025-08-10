open class Animalss(val name: String) { 
    open fun names() {
        println("Animal name is $name")
    }
}

open class Cats(name: String) : Animalss(name) {
    override fun names() {
        println("Cat name is $name")
    }
}

open class Dogs(name: String) : Animalss(name) {
    override fun names() {
        println("Dog name is $name")
    }
}

fun main() {
    val animal = Cats("Cattu")
    val dog = Dogs("Daggu")

    animal.names()
    dog.names()
}
