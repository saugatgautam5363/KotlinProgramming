interface F {
    fun greet(name: String){
        println("Hello, My name is $name")
    }
}
interface T{
    fun greet(name: String){
        println("Hello,My name is $name")
    }
}
class C : F,T{
   override fun greet(name: String) {
       super<F>.greet(name)
    }
    fun greets(name: String){
        super<T>.greet(name);
    }

}
fun main(){
    println("Enter the name: ")
    val name = readln();
    println("Enter the name: ")
    val names = readln();
    C().greets(names)
    C().greet(name)
}