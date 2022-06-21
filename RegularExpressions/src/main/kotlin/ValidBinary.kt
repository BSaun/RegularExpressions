class ValidBinary(detector: BinaryDetector) : State(detector) {
    override val isAccepting: Boolean
        get() = true

    override fun consumeInput(string: String) {
        if (string == "0") {
            detector.state = BinaryEndsWithZero(detector as BinaryDetector)
        }

        else if(string != "1") {
            detector.state = InvalidState(detector)
        }
    }
}