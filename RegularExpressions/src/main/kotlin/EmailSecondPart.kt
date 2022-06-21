class EmailSecondPart(detector: EmailDetector) : State(detector) {
    override val isAccepting: Boolean
        get() = false

    override fun consumeInput(string: String) {
        when {
            (string == "@" || string == " " || string == "") -> {
                detector.state = InvalidState(detector)
            }

            (string == ".") -> {
                detector.state = EmailSecondTransition(detector as EmailDetector)
            }
        }
    }
}