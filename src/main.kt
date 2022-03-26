fun main(){
    var banker = Person.Banker("sarah",21)
    var farmer = Person.Farmer("Effence",22)
    var doctor = Person.Doctor("Suu",23)

    banker.talk("Show me your ID")
    banker.eat()
    banker.sleep()
    banker.countMoney(arrayOf(1,2,3,4))

    farmer.talk("Bring me my equipments")
    farmer.eat()
    farmer.sleep()
    farmer.cultivation()


    doctor.talk("Take her to ICU")
    doctor.eat()
    doctor.sleep()
    doctor.treatPatient("Suu","Ulcers")

    println(farmer is Person)
    println(banker is Person)
    println(doctor is Person)
    //println(farmer is Farmer)


}

open class Person(name: String, age: Int){
    fun talk(words: String) {
        println(words)
    }

   open fun eat() {
        println("yum")
    }

    fun sleep() {
        println("zzzz")

    }

    class Banker( name: String,  age: Int): Person(name, age) {

        fun countMoney(notes: Array<Int>): Int {
            var sum = 0
            notes.forEach { note ->
                sum += note
            }
            return sum

        }
    }

    class Doctor(name: String, age: Int):Person(name, age){

        fun treatPatient(patient: String, disease: String) {
            println("Treating $patient for $disease")
        }

    }

    class Farmer(name: String, age: Int):Person(name, age){

        fun cultivation() {
            println("dig dig dig")
        }

        override fun eat() {
            //super.eat()
            println("I am eating all the food that i have grown")
        }

    }
}