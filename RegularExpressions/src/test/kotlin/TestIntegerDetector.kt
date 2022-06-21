import org.junit.jupiter.api.Test
import kotlin.test.assertFalse

class TestIntegerDetector {
    @Test
    fun invalidCharacters() {
        val detector = IntegerDetector()
        assertFalse(detector.isProperType(""))
        assertFalse(detector.isProperType("fdsa"))
        assertFalse(detector.isProperType("123.123fdsa"))
        assertFalse(detector.isProperType("@0312"))
        assertFalse(detector.isProperType("123.4321"))
    }

    @Test
    fun validIntegers() {
        val detector = IntegerDetector()
        assertFalse(detector.isProperType("0"))
        assert(detector.isProperType("1"))
        assert(detector.isProperType("2"))
        assert(detector.isProperType("132451246521642164218624651246164"))
    }
}