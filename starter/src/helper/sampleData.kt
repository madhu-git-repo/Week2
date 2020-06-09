package helper

import model.animals.Cat
import model.caffe.Product
import model.caffe.Receipt
import model.caffe.Sponsorship
import model.people.Employee
import model.people.Patron
import model.shelter.Shelter
import java.util.*

val firstShelter1 = Shelter("111")
var firstShelter2 = Shelter("222")

val firstShelterCats = setOf(
        Cat( "1","Spots","F","101", mutableSetOf(Sponsorship("99","1"))
        ),
       Cat("2","Spots","M","101", mutableSetOf(Sponsorship("90","2"))
       )
)
val testEmployees = setOf(
        Employee("111","John","peter","abc@xyz.com",123456.1"999999999","12/05/2010"),
        Employee("222","Robert","John","efg@abc.com",456789.1"123456","12/05/2000")
)
val testPatrons = setOf(
        Patron("jessica","eric","anc@sss.com","123456"),
        Patron("John","william","anc@sss.com","123456")
)
val cola = Product("1",6.0)
val coffee = Product("3",8.0)
val espresso = Product("5",10.0)
val cheeseCake = Product("9",9.0)

val testProducts = setOf(cola,coffee,espresso,cheeseCake)

val testReceiptsOne = mutableSetOf(
        Receipt("1",lisof(coffee, cola, cheeseCake),20.0,"123"),
        Receipt("2",lisof(cheeseCake, cola, espresso, cheeseCake),30.0,"34456")
)
val testReceiptsTwo = mutableSetOf(
        Receipt("9",lisof(coffee, cola),10.0,"8888"),
        Receipt("8",lisof(cheeseCake, cola, cheeseCake),25.0,"9999")
)