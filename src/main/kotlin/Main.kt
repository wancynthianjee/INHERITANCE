fun main() {
    val car = Car("wargnler","jeep", "beige",4)
    car.carry(4)
    car.identity()
    car.fees(6)
    val bus= Bus("monta","mini bus","blue",24)
    bus.carry(22)
    bus.identity()
    bus.maxTripFare(100.0                                                                                                                          )
    bus.fees(5,)
}
open  class Car(var make:String, var model:String, var color:String, var capacity:Int){

    open fun carry(people:Int,){
        var x = people - capacity
        if(people <=capacity){
            println("Carrying $people passengers")
        }
        else{
            (people > capacity)
            println("Over capacity by $x poeple")


        }

    }

    open fun identity(){
        println("I am a $color $model $make")
    }

    open fun fees(hours:Int){
        var x = hours*20
        println(x)

    }
}
class Bus(make:String,model:String, color:String,capacity:Int):Car(make,model,color,capacity){
    override fun carry(people: Int,) {
        var x = people - capacity
        if(people <=capacity){
            println("Carrying $people passengers")
        }
        else{
            (people > capacity)
            println("Over capacity by $x poeple")


        }

    }

    override fun identity() {
        println("I am a $color $model $make")
    }

    override fun fees(hours: Int) {
        println(hours*capacity)
    }







    fun maxTripFare(fare: Double,):Double{
        println(fare*capacity)
        return (fare*capacity)
    }


}



