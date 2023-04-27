class Motorcycle(brand: String, model: String, year: Int) : Vehicle(brand, model, year) {
    private var engineCapacity: Int = 0

    fun setEngineCapacity(capacity: Int) {
        engineCapacity = capacity
    }

    override fun displayDetails() {
        super.displayDetails()
        println("Type: Motorcycle")
        println("Engine Capacity: $engineCapacity cc")
    }
}