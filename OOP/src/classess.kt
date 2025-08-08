class Student(val name: String,val age: Int){

    fun greet(){
        println("Student name is $name and $age years old..")
    }
}
fun main(){
    val person = Student("santosh",20)
    person.greet()
}