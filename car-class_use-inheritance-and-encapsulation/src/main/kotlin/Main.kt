fun main() {
    val sedan = Sedan("Toyota", "Camry", 2022)
    val suv = SUV("Ford", "Explorer", 2021)
    val electricCar = ElectricCar("Tesla", "Model 3", 2023, 300)
    val motorcycle = Motorcycle("Harley-Davidson", "Sportster", 2022)

    sedan.displayDetails()
    println()

    suv.displayDetails()
    println()

    electricCar.displayDetails()
    println()

    motorcycle.setEngineCapacity(1200)
    motorcycle.displayDetails()
}