class IntegerStart(detector: IntegerDetector) : State(detector) {
    override val isAccepting: Boolean
        get() = false

    override fun consumeInput(string: String) {
        if (string in "123456789") {
            detector.state = ValidInteger(detector as IntegerDetector)
        }

        else {
            detector.state = InvalidState(detector)
        }
    }
}