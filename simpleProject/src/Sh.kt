fun main(){
    val shoppingList = mutableListOf<String>()

    while (true){
        println("\n--- Shopping List Menu---")
        println("1. Add Item")
        println("2. View Items")
        println("3. Remove Item")
        println("4. Exit")
        print("Choose an option: ")


        when(readln().toInt()){
            1->{
                println("Enter the add Item: ")
                val items = readln()
                shoppingList.add(items)
                println("$items added>>..")
            }
            2->{
                if (shoppingList.isEmpty()){
                    println("shopping list is empty>>...")
                }
                println("view the shopping list all items")
                shoppingList.forEachIndexed{ index, it ->
                    println("${index+1}. $it")
                }
            }
            3->{
                if (shoppingList.isEmpty()){
                    println("shopping list is empty>>...")
                }
                println("Enter the list to remove the items: ")
                val num = readln().toInt()
                if(num in 1..shoppingList.size){
                    val removed = shoppingList.removeAt(num -1)
                    println("$removed is removed form the shopping list>>!!")
                }else{
                    println("Invalid number!! enter the valid numbers:) ")
                }
            }
            4->{
                println("Thank you show much:)")
                break
            }
            else -> println("Invalid number please enter the valid numbers: ")
        }
    }
}