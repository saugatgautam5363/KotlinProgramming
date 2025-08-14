fun main(){

    println("Enter the student name: ")
    val name = readln()
    println("Enter the student roll No: ")
    val rollNo = readln()

    println("Enter the number of  subject: ")
    val numSub = readln().toInt()
    val marks = mutableListOf<Int>()
    var total = 0
    for(i in 1.. numSub){
        println("Enter the subject marks: ")
        val maks = readln().toInt()
        marks.add(maks)
        total += maks
    }
    val average = total.toDouble() / numSub
    val grade = when{
        average >= 90 -> "A+"
        average >= 80 -> "A"
        average >= 70 -> "B+"
        average >= 60 -> "B"
        average >= 50 -> "C+"
        average >= 40 -> "C"
        average <= 35 -> "D"
        else -> "F"
    }
    println("----Student marks details--------\n")
    println("Name       : $name")
    println("Roll Number: $rollNo")
    println("Marks      : $marks")
    println("Average    : $average")
    println("Grade      : $grade")
}