package one.digitalinnovation.collections

fun main() {
    val salarios = DoubleArray(4)
    /**outro modo de fazer é **/
    //    val salarios = doubleArrayOf(1000.0, 2000.0, 2500.0)

    salarios[0] = 1000.0
    salarios[1] = 2000.0
    salarios[2] = 1500.0
    salarios[3] = 500.0

    salarios.forEach { println(it) }
    println("--------------------------")
    salarios.forEachIndexed{index, salario ->
        salarios[index] = salario * 1.1
    }
    salarios.forEach { println("R$%.2f".format(it)) }
}