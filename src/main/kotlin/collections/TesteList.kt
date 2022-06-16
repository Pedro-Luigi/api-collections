package one.digitalinnovation.collections

fun main() {
    val joao = Funcionarios("João",3000.0, "CLT")
    val maria = Funcionarios("Maria",2000.0, "CLT")
    val lucas = Funcionarios("Lucas",1500.0, "PJ")

    val funcionarios = listOf(joao, maria, lucas)

    funcionarios.forEach { println(it)}

    println("--------------------------")
    println(funcionarios.find { it.nome == "Maria" })

    println("--------------------------")
    funcionarios
        .sortedBy { it.salario  }
        .forEach { println(it) }

    println("--------------------------")
    funcionarios
        .groupBy { it.tipo  }
        .forEach { println(it) }
}
