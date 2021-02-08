//A parameter is no longer used by the method body.
//Remove it.

fun main() {

    val introduction = salutation("Professor", "Stephen", "Green");
    println(introduction)

}



fun salutation(title: String, forename: String, surname: String) : String {

    return "Dear $title $surname,"

}