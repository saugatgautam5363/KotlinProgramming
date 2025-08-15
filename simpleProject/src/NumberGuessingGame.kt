fun main(){
    val num: Int = 75;
    if( num > 100){
        println("Enter the number 1 to 100")
    }
    if(num < 1){
        println("Enter the number 1 yo 100")
    }
    while (true){
        println("Guss the number: ")
        val number = readln().toInt()
     when {
         number < num -> println("To Low")
         number > num -> println("To high")
         number == num ->{
             println("Correct:)")
             break
         }
         else -> println("Invalid number:)!!")
     }
    }


}