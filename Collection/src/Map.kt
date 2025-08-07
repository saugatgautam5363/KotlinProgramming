fun main(){
    val students = mapOf(
        101 to "Sandesh",
        104 to "Saugat",
        105 to "Sadiksha"
    )
//    students.apply {
//        106 to "sumit"
//    }
    println(students)
    students.forEach { (rollNum, names) ->
       println("Student roll $rollNum and students name is $names")
    }
    println(students.get(104))

    println(students.size)
}