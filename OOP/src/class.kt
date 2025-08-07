class Person(val name: String,val age: Int){
    fun greet(){
        println("Hello my name is $name and I am $age year old.")
    }
}
fun main(){
    val person1 = Person("Saugat",19)
    person1.greet()
}