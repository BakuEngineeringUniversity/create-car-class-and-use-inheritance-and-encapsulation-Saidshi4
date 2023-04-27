open class Sedan(brand: String, model: String, year: Int) : Car(brand, model, year) {
    override fun displayDetails() {
        super.displayDetails()
        println("Body Type: Sedan")
    }
}