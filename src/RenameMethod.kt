//The name of a method does not reveal its purpose
//Change the name of the method
import java.text.DecimalFormat
import java.time.LocalDateTime

fun main() {
    doSomething()
}

fun doSomething() {

    val date = LocalDateTime.now()
    val formatter = DecimalFormat("00")
    println(formatter.format(date.hour) + ":" + formatter.format(date.minute));

}
