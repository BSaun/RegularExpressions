class PasswordNoCapitalEndsWithSpecial(detector: PasswordDetector) : State(detector) {
    override val isAccepting: Boolean
        get() = false

    override fun consumeInput(string: String) {
        if (string[0].isUpperCase())  {
            detector.state = ValidPassword(detector as PasswordDetector)
        }

        else if (string !in  "!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~")  {
            detector.state = PasswordNoCapitalHasSpecial(detector as PasswordDetector)
        }
    }
}