package one.digitalinnovation.collections

fun main() {
    val salarios = doubleArrayOf(1000.0, 2250.0, 4000.0)

    println("-----------------")
    println("Maior Salario = R$${salarios.maxOrNull()}")
    println("Menor Salario = R$${salarios.minOrNull()}")
    val x = salarios.average()
    println("Média dos Salarios = R$%.2f".format(x))

    val salarioMais2K = salarios.filter { it > 2000.0 }
    println("-------Maior que 2 MIL----------")
    salarioMais2K.forEach { println("R$$it") }

    println("-------Maior que 2K e menor de 5K----------")
    println(salarios.count{it in 2000.0..5000.0})

    println("-------Usando Find----------")
    println(salarios.find { it == 2250.0 })
    println("-------Usando Any----------")
    println(salarios.any { it == 1000.0 })
}