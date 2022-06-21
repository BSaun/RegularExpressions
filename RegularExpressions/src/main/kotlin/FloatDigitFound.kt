class FloatDigitFound(detector: FloatDetector) : State(detector) {
    override val isAccepting: Boolean
        get() = false

    override fun consumeInput(string: String) {
        if (string == ".") {
            detector.state = FloatPointInNumber(detector as FloatDetector)
        }

        else if (string !in "0123456789") {
            detector.state = InvalidState(detector)
        }
    }
}