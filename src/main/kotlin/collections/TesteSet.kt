package one.digitalinnovation.collections

fun main() {
    val joao = Funcionarios("João",3000.0, "CLT")
    val maria = Funcionarios("Maria",2000.0, "CLT")
    val lucas = Funcionarios("Lucas",1500.0, "PJ")

    val funcionarios1 = setOf(joao, lucas)
    val funcionarios2 = setOf(maria)

    val resultUnion = funcionarios1.union(funcionarios2)
    resultUnion.forEach { println(it) }

    println("--------------------------")
    val funcionarios3 = setOf(joao,maria)
    val resultSubtract = funcionarios3.subtract(funcionarios1)
    resultSubtract.forEach { println(it) }

    println("------------O que tem no 3 e no 1 --------------")
    val resultIntersect = funcionarios3.intersect(funcionarios1)
    resultIntersect.forEach { println(it) }
}