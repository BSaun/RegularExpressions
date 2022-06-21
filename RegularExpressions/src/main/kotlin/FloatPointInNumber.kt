class FloatPointInNumber(detector: FloatDetector) : State(detector) {
    override val isAccepting: Boolean
        get() = false

    override fun consumeInput(string: String) {
        if (string in "0123456789") {
            detector.state = ValidFloat(detector as FloatDetector)
        }

        else {
            detector.state = InvalidState(detector)
        }
    }
}