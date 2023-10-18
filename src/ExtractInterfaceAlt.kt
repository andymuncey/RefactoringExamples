<<<<<<< HEAD


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

=======
import java.time.LocalDate
import java.time.temporal.ChronoUnit
import kotlin.math.abs

//book example uses employee with getRate and hasSpecialSkill as two properties
//which are extracted to a Billable interface

class Claim(val date: LocalDate, val costInPounds: Int, val type:Type ){
    enum class Type {FAULT, NO_FAULT, GLASS}
}

class Driver(val surname: String,
             val forename: String,
             val postcode: String,
             private val dateOfBirth: LocalDate,
             private val claims : MutableList<Claim>,
             val socialUse: Boolean,
             val mileage: Int,
             val businessMileage: Int) {

    fun faultClaimCount() : Int{
        return claims.count { claim -> claim.type == Claim.Type.FAULT }
    }

    fun age() : Long {
        return ChronoUnit.YEARS.between(dateOfBirth,LocalDate.now())
    }

    fun name() : String {
        return "$forename $surname"
    }

}

//riskPremium only requires something with a claim count and age
//extract RiskAssessable interface

fun riskPremium(driver: Driver) : Double {
    val ageRisk = abs(driver.age()-60)
    return ageRisk * (1 + driver.faultClaimCount()) / 100.0
>>>>>>> origin/master
}