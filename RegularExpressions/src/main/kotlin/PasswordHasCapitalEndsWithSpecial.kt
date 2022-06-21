class PasswordHasCapitalEndsWithSpecial(detector: PasswordDetector) : State(detector) {
    override val isAccepting: Boolean
        get() = false

    override fun consumeInput(string: String) {
        if (string !in  "!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~")  {
            detector.state = ValidPassword(detector as PasswordDetector)
        }
    }
}