class Mushroom (val size: Int, val isMagic: Boolean){
    constructor(isMagic_param: Boolean) : this(0, isMagic_param){

    }

    fun findRecipes(
        title: String = "",
        ingredient: String = "",
        isVegetarian: Boolean = false,
        difficulty: String = ""
    ): Array<Recipe>{
        return arrayOf(Recipe(title, ingredient, isVegetarian, difficulty))
    }

    fun addNumbers(a: Int, b: Int) : Int{
        return a + b
    }

    fun addNumbers(a: Double, b: Double) : Double{
        return a + b
    }
}