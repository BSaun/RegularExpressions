class PasswordDetector : Detector() {
    override var state: State = PasswordStart(this)

    override fun isProperType(input: String): Boolean {
        val characters = stripString(input)
        if (characters.size < 8) {
            return false
        }

        for (character in characters) {
            state.consumeInput(character)
        }
        val isAccepting = state.isAccepting
        state = PasswordStart(this)
        return isAccepting
    }
}