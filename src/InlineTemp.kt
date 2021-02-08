//You have a temporary variable that is assigned once with a simple expression,
// and it is getting in the way of other refactorings

//Replace all references to that temporary variable with the expression

val order = Order()

fun isExpensive() : Boolean{
    val basePrice = order.basePrice();
    return basePrice > 1000
}



