import kotlin.system.measureTimeMillis


fun main(args: Array<String>) {


    val welcomeMessage = """:: Bienvenido a Recipe Maker ::
            
    Selecciona la opción deseada
    1. Hacer una receta
    2. Ver mis recetas
    3. Salir""".trimIndent()

    println(welcomeMessage)

    var answer:String? = readLine()

    answer?.length ?:""


    while (answer.equals("3").not()){
        println(checkAnswer(answer))
        println("")

        println(welcomeMessage)
        answer = readLine()
        answer?.length ?:""



    }

}//end of main

fun checkAnswer(ans: String?): String {
    val firstPartOfAnswer = "Tu respuesta fue: "
    if( ans.equals("1")){
        return firstPartOfAnswer.plus("1 Hacer una receta")
    }else if (ans.equals("2")){
        return firstPartOfAnswer.plus("Ver mis recetas")
    }else{
        return "no ingresaste una respuesta válida"
    }

}


fun makeRecipe(){
    val ingredients = listOf<String>("Agua", "Leche", "Carne", "Verduras", "Frutas", "Cereal", "Huevos", "Aceite")
    println("Selecciona por categoría el ingrediente que buscas: ")
    for ((index,ingredient) in ingredients.withIndex()){
        println("${index+1}. $ingredient ")
    }
}

fun viewRecipe(category: Int){
    when(category){
        1 -> println("Hacer una receta")
        2 -> println("Ver mis recetas")
        3 -> println("Salir")
    }

}

