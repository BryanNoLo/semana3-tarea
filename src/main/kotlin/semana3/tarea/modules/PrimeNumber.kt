package semana3.tarea.modules

class PrimeNumber(override val numero: Int, val divisores: ArrayList<Int>) : IBaseNumber {
    init {
        printValue()
        printArray()
    }
   
    override fun printValue() {
        print(numero)
    }

    fun printArray () {
        print (" [")
        for (valor in divisores) {
            print(" $valor")
        }
        print(" ]\n")
    }
}
