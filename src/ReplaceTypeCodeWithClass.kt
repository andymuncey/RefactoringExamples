//A class uses a numeric type code (e.g. ints) to represent types
//Replace the number with a new class

class Employee (var name : String, var contractType: Int) {

    companion object {
        val PERMANENT = 1
        val FIXED_TERM = 2
        val TEMPORARY = 3
        val ZERO_HOURS = 4

    }


}

fun main() {
    val cher = Employee("Cher", Employee.PERMANENT)

    val state = when (cher.contractType){
        Employee.PERMANENT -> "Try not to fire"
        else -> "Easier to fire"
    }

}