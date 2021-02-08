//A method’s body is just as clear as [or clearer than] its name
//Put the method’s body into the body of its callers and remove the method
fun main() {

    if (etCityValidation()) {

        //do something with City

    }

}

private fun etCityValidation() : Boolean {
    return etCity.text.isNotEmpty()
}





val etCity = EditText()




