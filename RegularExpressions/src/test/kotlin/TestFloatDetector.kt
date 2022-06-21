import org.junit.jupiter.api.Test
import kotlin.test.assertFalse

class TestFloatDetector {
    @Test
    fun invalidCharacters() {
        val detector = FloatDetector()
        assertFalse(detector.isProperType("fd.sa"))
        assertFalse(detector.isProperType("123.123fdsa"))
        assertFalse(detector.isProperType("@0.312"))
    }

    @Test
    fun testStartWithZero() {
        val detector = FloatDetector()
        assertFalse(detector.isProperType("0"))
        assert(detector.isProperType("0.124"))
        assertFalse(detector.isProperType("01.21"))
        assert(detector.isProperType("0.0000021"))
    }

    @Test
    fun testEmptySecondPart() {
        val detector = FloatDetector()
        assertFalse(detector.isProperType("0."))
    }

    @Test
    fun validFloats() {
        val detector = FloatDetector()
        assert(detector.isProperType("10.12"))
        assert(detector.isProperType("0.124"))
        assert(detector.isProperType("1.21"))
        assert(detector.isProperType("32168461613216463131684135135.685465134621"))
    }
}