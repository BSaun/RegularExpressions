class EmailFirstPart(detector: EmailDetector) : State(detector) {
    override val isAccepting: Boolean
        get() = false

    override fun consumeInput(string: String) {
        if(string == "@") {
            detector.state = EmailFirstTransition(detector as EmailDetector)
        }

        else if(string == " ") {
            detector.state = InvalidState(detector)
        }
    }
}