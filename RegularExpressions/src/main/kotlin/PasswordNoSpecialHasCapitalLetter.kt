class PasswordNoSpecialHasCapitalLetter(detector: PasswordDetector) : State(detector) {
    override val isAccepting: Boolean
        get() = false

    override fun consumeInput(string: String) {
        if (string in  "!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~")  {
            detector.state = PasswordHasCapitalEndsWithSpecial(detector as PasswordDetector)
        }
    }
}