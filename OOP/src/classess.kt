open class Student(val name: String, val age: Double){

    fun greet(){
        println("Student name is $name and $age years old..")
    }
}
fun main(){
    val person = Student("santosh",20.0)
    person.greet()
}