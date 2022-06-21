class EmailFirstTransition(detector: EmailDetector) : State(detector) {
    override val isAccepting: Boolean
        get() = false

    override fun consumeInput(string: String) {
        if(string == "@" || string == " " || string == "" || string == ".") {
            detector.state = InvalidState(detector)
        }

        else {
            detector.state = EmailSecondPart(detector as EmailDetector)
        }
    }
}