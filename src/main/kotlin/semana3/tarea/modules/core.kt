package semana3.tarea.modules

interface IBaseNumber {
    val numero: Int

    fun printValue()
}

enum class NumberType {
    PRIME,
    ODD,
    EVEN
}
