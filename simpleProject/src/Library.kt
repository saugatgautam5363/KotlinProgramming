data class Books(val title:String,val author: String)
fun main() {
    val library = mutableListOf<Books>()
    while (true) {
        println("\n===== Library Management System =====")
        println("1. Add Book")
        println("2. Search Book by Title")
        println("3. Search Book by Author")
        println("4. Remove Book")
        println("5. View All Books")
        println("6. Exit")
        print("Enter choice: ")

        when (readln().toInt()) {
            1 -> {
                println("Enter the Book Name: ")
                val Bname = readln()
                println("Enter the Author Name: ")
                val name = readln()
                library.add(Books(Bname, name))
                println("Book Add successfully:)")
            }

            2 -> {
                println("Enter the Book Name: ")
                val Bname = readln()
                val result = library.filter { it.title.contains(Bname, ignoreCase = true) }
                if (result.isEmpty()) {
                    println("Book is not Found:)")
                } else result.forEach {
                    println("${it.title} by ${it.author}")
                }

            }

            3 -> {
                println("Enter the Books Author Name: ")
                val Aname = readln()
                val result = library.filter { it.author.contains(Aname, ignoreCase = true) }
                if (result.isEmpty()) {
                    println("Book is not Found:)")
                } else result.forEach {
                    println("${it.title} by ${it.author}")
                }
            }

            4 -> {
                println("Enter title of book to remove: ")
                val Rtitle = readln()
                val result = library.removeIf { it.title.contains(Rtitle, ignoreCase = true) }
                if (result) {
                    println("Books is removed successfully:)")
                }
            }

            5 -> {
                println("-------Books List--------:)")
                val result = library.forEachIndexed { Index, it ->
                    println("${Index+1}. ${it.title} by ${it.author}")
                }
            }
            6->{
                println("Thank you :)")
                return
            }
            else -> println("Invalid choices chose valid choices!!:)")
        }
    }
}