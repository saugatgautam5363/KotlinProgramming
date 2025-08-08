open class Animals{
    open fun eat(){
        println("Animal eat....")
    }
}
class A : Animals(){
    override fun eat() {
        super.eat()
    }
}

fun main(){
    val a = Animals()
    a.eat()
}