class FloatZeroFirst(detector: FloatDetector) : State(detector) {
    override val isAccepting: Boolean
        get() = false

    override fun consumeInput(string: String) {
        if(string == ".") {
            detector.state = FloatPointInNumber(detector as FloatDetector)
        }

        else {
            detector.state = InvalidState(detector)
        }
    }
}