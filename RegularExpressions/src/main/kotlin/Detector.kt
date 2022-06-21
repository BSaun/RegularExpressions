abstract class Detector {
    abstract var state : State

    abstract fun isProperType(input : String) : Boolean

    fun stripString(input: String): MutableList<String> {
        return input
            .trim()
            .split("")
            .dropLast(1)
            .drop(1)
            .toMutableList()
    }
}