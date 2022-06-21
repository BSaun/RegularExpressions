class FloatStart(detector: FloatDetector) : State(detector) {
    override val isAccepting: Boolean
        get() = false

    override fun consumeInput(string: String) {
        when {
            (string in "123456789") -> {
                detector.state = FloatDigitFound(detector as FloatDetector)
            }

            (string == "0") -> {
                detector.state = FloatZeroFirst(detector as FloatDetector)
            }

            (string == ".") -> {
                detector.state = FloatPointInNumber(detector as FloatDetector)
            }

            else -> {
                detector.state = InvalidState(detector)
            }
        }
    }
}