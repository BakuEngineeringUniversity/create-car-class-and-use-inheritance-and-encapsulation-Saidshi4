open class Vehicle(var brand: String, val model: String, val year: Int) {
    open fun displayDetails() {
        println("Brand: $brand")
        println("Model: $model")
        println("Year: $year")
    }
}