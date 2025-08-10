open class Studentss(val name: String, val marks: Double) {
    open fun showMarks() {
        println("$name marks is $marks")
    }
}

class Class1(name: String, marks: Double) : Studentss(name, marks) {
    override fun showMarks() {
        println("Student $name has scored $marks marks")
    }
}

fun main() {
    print("Enter how many students study in this class: ")
    val num = readln().toInt()

    val students = mutableListOf<Studentss>()

    for (i in 1..num) {
        print("Enter student name: ")
        val name = readln()

        print("Enter student marks: ")
        val marks = readln().toDouble()

        val st = Class1(name, marks)
        students.add(st)
    }

    println("\n--- Student Details ---")
    for (student in students) {
        student.showMarks()
    }
}
