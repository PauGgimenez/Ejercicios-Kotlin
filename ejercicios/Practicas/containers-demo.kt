package ejercicios.practicas

data class Person(val name: String, val age: Int)

val friends = arrayOf(
    Person("Raul", 29),
    Person("Ramón", 31)
)

fun Array<Person>.findOldest(): Person? {
    if (this.isEmpty()) return null

    var oldest: Person = this[0]



    for (person in slice(1 until size)) {
        if (person.age > oldest.age) {
            oldest = person
        }
    }
    return oldest
    /* for (i in 1 until people.size - 1)
        if (people[i].age > oldest.age) {
            oldest = people[i]
        }
    return oldest
    */
}

fun Array<Person>.findMax(comparator: Comparator<Person>): Person? {
    if (this.isEmpty()) return null
    var max: Person = this[0]
    for (person in slice(1 until size)) {
        if (comparator.compare(max, person) > 0) {
            max = person
        }
    }
    return max
}

fun testComparisonByAge() {
    val byAgeComparator = object : Comparator<Person> {
        override fun compare(p1: Person, p2: Person): Int {
            return compareValues(p1.age, p2.age)
        }
    }
    val maxPerson = friends.findMax(byAgeComparator)
    println(maxPerson)
}

fun testComparisonByName() {
    /* val byNameComparator = object : Comparator<Person> {
        override fun compare(p1: Person, p2: Person): Int {
            return compareValues(p1.name, p2.name)
        }
    }
    */
    val byNameComparator: Comparator<Person> = { p1, p2 ->
        compareValues(p1.name, p2.name)
    }
    val maxPerson = friends.findMax(byNameComparator)
    println(maxPerson)
}

fun main() {
    val person = Person("Alice", 29)
    println(person.name)
    println(person.age)
    println(person)

    val oldest = friends.findOldest()
    println(friends.contentToString())
    println(oldest)
}