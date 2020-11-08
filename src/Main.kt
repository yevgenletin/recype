fun main(args: Array<String>){
    val r1 = Recipe("Thai Curry", "Chicken")
    val r2 = Recipe(title = "Thai Curry", mainIngredient = "Chicken")
    val r3 = r1.copy(title = "Chiken Bhuna")

    println("r1 hash code: ${r1.hashCode()}")
    println("r2 hash code: ${r2.hashCode()}")
    println("r3 hash code: ${r3.hashCode()}")
    println("r1 to String: ${r1.toString()}")

    println("r1 == r2? ${r1 == r2}")
    println("r1 === r2? ${r1 === r2}")
    println("r1 == r3? ${r1 === r3}")

    val (title, mainIngredient, vegetarian, difficulty) =  r1
    println("title: $title vegetarian: $vegetarian")

    val m1 = Mushroom(6, false)
    println("m1 size is ${m1.size} and isMagic is ${m1.isMagic}" )
    val m2 = Mushroom(true)

    println("m2 size is ${m2.size} and isMagic is ${m2.isMagic}")
    
    println(m2.addNumbers(2, 5))
    println(m2.addNumbers(1.6, 7.3))


    
}