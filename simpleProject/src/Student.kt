fun main(){
    println("Enter the student name: ")
    val name = readln()
    println("Enter the roll Number: ")
    val rollNo = readln()
    println("Enter the number of subject:")
    val numSub = readln().toInt()

    val marks = mutableListOf<Int>()
    var total = 0;
    for(i in 1..numSub){
        println("Enter the subject marks: ")
       val mark = readln().toInt()
        marks.add(mark)
        total += mark
    }
    val average = total.toDouble() / numSub

    val grade = when{
        average >= 90 -> "A+"
        average >= 80 -> "A"
        average >= 70 -> "B+"
        average >= 60 -> "B"
        average >= 50 -> "C+"
        average >= 40 -> "C"
        average >=35 -> "D"
        else -> "F"
    }
    println("-----Student marks reports-----------")
    println("name       : $name")
    println("Roll number: $rollNo")
    println("Marks      : $marks")
    println("Average    : %.2f".format(average))
    println("Grade      : $grade")
}


