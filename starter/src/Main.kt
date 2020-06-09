import helper.CafeController

fun main() {

    val cafeController = CafeController() // print out the data here using CafeController functions

    cafeController.adoptCat("2",testEmployees.first())
    println("Adopted cats ${cafeController.getAdaptedCats()}")
}