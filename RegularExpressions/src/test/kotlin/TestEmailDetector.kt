import org.junit.jupiter.api.Test
import kotlin.test.assertFalse

class TestEmailDetector {
    @Test
    fun testInvalidCharacters() {
        val detector = EmailDetector()
        assertFalse(detector.isProperType(""))
        assertFalse(detector.isProperType(" "))
    }

    @Test
    fun testEmailFirstPart() {
        val detector = EmailDetector()
        assertFalse(detector.isProperType("@@gmail.com"))
        assertFalse(detector.isProperType("@ gmail.com"))
        assertFalse(detector.isProperType("@gmail.com"))
        assert(detector.isProperType("daksdgbaskhjdb@hotmail.com"))
        assert(detector.isProperType("khzvkhbvkbh....@hotmail.com"))
    }

    @Test
    fun testEmailSecondPart() {
        val detector = EmailDetector()
        assertFalse(detector.isProperType("ab@gm.ail.com"))
        assertFalse(detector.isProperType("ab@gm ail.com"))
        assertFalse(detector.isProperType("ab@gm@ail.com"))
        assertFalse(detector.isProperType("ab@.com"))
        assert(detector.isProperType("daksdgbaskhjdb@hotmail.com"))
        assert(detector.isProperType("khzvkhbvkbh....@hotmail.com"))
    }

    @Test
    fun testEmailThirdPart() {
        val detector = EmailDetector()
        assertFalse(detector.isProperType("ab@gmail.co@m"))
        assertFalse(detector.isProperType("ab@gmail.co m"))
        assertFalse(detector.isProperType("ab@gmail.co.m"))
        assertFalse(detector.isProperType("ab@gmail."))
        assert(detector.isProperType("daksdgbaskhjdb@hotmail.com"))
        assert(detector.isProperType("khzvkhbvkbh....@hotmail.com"))
    }
}