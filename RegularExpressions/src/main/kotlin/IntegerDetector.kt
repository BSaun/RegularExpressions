class IntegerDetector : Detector() {
    override var state: State = IntegerStart(this)

    override fun detectType(input: String) : Boolean {
        val characters = stripString(input)

        for (character in characters) {
            state.consumeInput(character)
        }
        val isAccepting = state.isAccepting
        state = IntegerStart(this)
        return isAccepting
    }


}