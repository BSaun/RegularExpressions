import org.junit.jupiter.api.Test
import kotlin.test.assertFalse

class TestBinaryDetector {
    @Test
    fun invalidCharacters() {
        val detector = BinaryDetector()
        assertFalse(detector.isProperType(""))
        assertFalse(detector.isProperType(" "))
        assertFalse(detector.isProperType("1231231"))
        assertFalse(detector.isProperType("1sad001"))
    }

    @Test
    fun testStartWithZero() {
        val detector = BinaryDetector()
        assertFalse(detector.isProperType("0111"))
        assertFalse(detector.isProperType("011100011101011001"))
    }

    @Test
    fun testEndWithZero() {
        val detector = BinaryDetector()
        assertFalse(detector.isProperType("0"))
        assertFalse(detector.isProperType("101111001010"))
        assertFalse(detector.isProperType("10111000111010110010"))
    }

    @Test
    fun testValidBinary() {
        val detector = BinaryDetector()
        assert(detector.isProperType("101"))
        assert(detector.isProperType("1"))
        assert(detector.isProperType("1011100011101011001011"))
        assert(detector.isProperType("111111111111111111111111111111111"))
    }
}