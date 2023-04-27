open class Car(brand: String, model: String, year: Int) : Vehicle(brand, model, year) {
    override fun displayDetails() {
        super.displayDetails()
        println("Type: Car")
    }
}