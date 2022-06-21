class PasswordStart(detector: PasswordDetector) : State(detector) {
    override val isAccepting: Boolean
        get() = false

    override fun consumeInput(string: String) {
        if (string in  "!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~")  {
            detector.state = PasswordNoCapitalEndsWithSpecial(detector as PasswordDetector)
        }

        else if (string[0].isUpperCase())  {
            detector.state = PasswordNoSpecialHasCapitalLetter(detector as PasswordDetector)
        }
    }
}