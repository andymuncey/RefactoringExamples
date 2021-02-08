//You have a complicated expression

//Put the result of the expression, or parts of the expression,
// in a temporary variable with a name that explains the purpose

fun handleEnvironment(browser: String, platform: String, resize: Int) {

    if (platform.toUpperCase().contains("MAC") &&
            browser.toUpperCase().contains("Chrome") &&
                resize > 0 && wasInitialised() )
    {
        //do something
    }


}


fun wasInitialised() : Boolean {

    return true
}


