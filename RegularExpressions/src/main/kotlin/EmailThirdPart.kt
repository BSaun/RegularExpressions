class EmailThirdPart(detector: EmailDetector) : State(detector) {
    override val isAccepting: Boolean
        get() = true

    override fun consumeInput(string: String) {
        if (string == "@" || string == " " || string == ".") {
            detector.state = InvalidState(detector)
        }
    }
}