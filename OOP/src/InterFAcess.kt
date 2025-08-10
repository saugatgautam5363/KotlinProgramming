interface vehicle{
    val speed: Int
     fun drive()
    fun stop(){
        println("Vehicle is stop...")
    }
}
class Car(override val speed: Int): vehicle{
    override fun drive() {
        println("car is diving at $speed km/h")
    }

}
class Bike(override val speed: Int) : vehicle{
    override fun drive(){
        println("Bike is riding at $speed Km/h")
    }
}
fun main(){
    val car = Car(120);
    car.drive()
    car.stop()

    val bike = Bike(150)
    bike.drive()
    bike.stop()
}