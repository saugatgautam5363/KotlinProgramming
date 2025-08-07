fun main() {
    println("How many names are to be stored?")
    val count = readln().toInt()

    val students = mutableListOf<String>()

    for (i in 1..count) {
        print("Enter the name of student $i: ")
        val name = readln()
        students.add(name)
    }
    val j =1
    println("\nList of students:")
    for (name in students) {
        println("${j + 1}. $name")
    }
}
