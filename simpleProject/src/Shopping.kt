fun main() {
    val shoppingList = mutableListOf<String>()

    while (true) {
        println("\n--- Shopping List Menu ---")
        println("1. Add Item")
        println("2. View Items")
        println("3. Remove Item")
        println("4. Exit")
        print("Choose an option: ")

        when (readln().toInt()) {
            1->{
                println("Enter the items to add: ")
                val items = readln();
                shoppingList.add(items)
                println("$items to added...")
            }
            2->{
                if(shoppingList.isEmpty()){
                    println("Your shopping list is empty....")
                }
                println("Your shopping list is: ")
                shoppingList.forEachIndexed { index, it ->
                    println("${index+1}. $it")
                }
            }
            3->{
                if(shoppingList.isEmpty()){
                    println("Your shopping list is empty....")
                }
                println("Enter the numbers to removed items: ")
                val remove = readln().toInt()
                if(remove in 1..shoppingList.size){
                    val removed = shoppingList.removeAt(remove -1)
                    println("$removed is removed from shopping list>>!!")
                }else{
                    println("Invalid Items number!!")
                }
            }
            4->{
                println("Thank You, show much>>...")
                break
            }
            else -> println("Invalid numbers>>!!")
        }
    }
}