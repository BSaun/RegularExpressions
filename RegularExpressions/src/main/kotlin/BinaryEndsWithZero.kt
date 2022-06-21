class BinaryEndsWithZero(detector: BinaryDetector) : State(detector) {
    override val isAccepting: Boolean
        get() = false

    override fun consumeInput(string: String) {
        if(string == "1") {
            detector.state = ValidBinary(detector as BinaryDetector)
        }
    }
}