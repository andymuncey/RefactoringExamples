class Contractor(var name: String, var grade: Int){

    fun chargeOutRate() : Int {
        return 10 + 2*grade
    }

}

class Room(val location: String, val capacity: Int){

    fun chargeOutRate() : Int {
        return 5 + capacity
    }
}

fun getCost(rooms: List<Room>, contractors: List<Contractor>) : Int{

    val roomCost = rooms.sumOf { room -> room.chargeOutRate() }
    val contractorCost = rooms.sumOf { person -> person.chargeOutRate() }

    return roomCost + contractorCost

}