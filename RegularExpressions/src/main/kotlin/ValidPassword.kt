class ValidPassword(detector: PasswordDetector) : State(detector) {
    override val isAccepting: Boolean
        get() = true

    override fun consumeInput(string: String) {
        if (string in  "!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~")  {
            detector.state = PasswordHasCapitalEndsWithSpecial(detector as PasswordDetector)
            println("Ends with special")
        }
    }
}