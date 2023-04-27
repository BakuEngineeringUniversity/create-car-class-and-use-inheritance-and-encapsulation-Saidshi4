class ElectricCar(brand: String, model: String, year: Int, val range: Int) : Car(brand, model, year) {
    override fun displayDetails() {
        super.displayDetails()
        println("Range: $range miles")
    }
}