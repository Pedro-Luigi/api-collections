package one.digitalinnovation.collections

data class Funcionarios(
    val nome:String,
    val salario:Double,
    val tipo:String
) {
    override fun toString(): String = """
        Nome = $nome
        Salário = $salario
    """.trimIndent()
}