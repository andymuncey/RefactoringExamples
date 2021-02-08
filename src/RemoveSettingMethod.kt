//A field should be set at creation time and never altered
//Remove any setting method for that field

//not quite the same in Kotlin as

class Thing(widget: String) {

    var widget: String

    init {
        this.widget = widget
    }
}




