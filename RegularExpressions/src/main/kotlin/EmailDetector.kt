class EmailDetector : Detector() {
    override var state: State = EmailStart(this)

    override fun isProperType(input: String): Boolean {
        val characters = stripString(input)

        for (character in characters) {
            state.consumeInput(character)
        }
        val isAccepting = state.isAccepting
        state = EmailStart(this)
        return isAccepting
    }
}