//A method returns a collection
//Make it return a read only view and provide add/remove methods

fun main() {

    val order = MealOrder()

    for (item in order.items!!) {
        //e.g. print receipt items
    }

}



class MealOrder {

    val items : MutableList<String>? = null

    var gratuity: Int = 0



}

//use Collections.unmodifiableList to convert to immutable