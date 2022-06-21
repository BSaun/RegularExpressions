class FloatDetector : Detector() {
    override var state: State = FloatStart(this)

    override fun isProperType(input: String): Boolean {
        val characters = stripString(input)

        for (character in characters) {
            state.consumeInput(character)
        }
        val isAccepting = state.isAccepting
        state = FloatStart(this)
        return isAccepting
    }
}