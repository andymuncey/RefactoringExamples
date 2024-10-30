import java.util.*

//You have a complicated expression

//Put the result of the expression, or parts of the expression,
// in a temporary variable with a name that explains the purpose

fun handleEnvironment(browser: String, platform: String, resize: Int) {

    if (platform.uppercase(Locale.getDefault()).contains("MAC") &&
            browser.uppercase(Locale.getDefault()).contains("CHROME") &&
                resize > 0 && wasInitialised() )
    {
        //do something
    }


}


fun wasInitialised() : Boolean {
//example, would have more complex logic
    return true
}


