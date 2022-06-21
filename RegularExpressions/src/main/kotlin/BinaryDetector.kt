class BinaryDetector : Detector() {
    override var state: State = BinaryStart(this)

    override fun detectType(input: String): Boolean {
        val characters = stripString(input)

        for (character in characters) {
            state.consumeInput(character)
        }
        val isAccepting = state.isAccepting
        state = BinaryStart(this)
        return isAccepting
    }
}