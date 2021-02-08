//A method is not used by any other class
//Make the method private

fun main() {
    val progII = Module("CO5225","Programming II")
    println("${progII.title} has ${progII.getHours()} hours")
}


/**
 * code always in format CONXXX where CO represents letters A-Z,
 * N represents digits 3-8 and XXX represents digits 0-9
 */
class Module (val code: String, val title: String) {

    fun getHours() : Int{
        return when (level()){
            3,4 -> 48
            5 -> 40
            6,7,8 -> 32
            else -> 0
        }
    }


    fun level() : Int {
        return Integer.parseInt(code.substring(2,3))
    }



}
