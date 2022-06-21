import org.junit.jupiter.api.Test
import kotlin.test.assertFalse

class TestPasswordDetector {
    @Test
    fun testForEndSpecialCharacter() {
        val detector = PasswordDetector()
        assertFalse(detector.isProperType("Abbbbbbb!"))
        assertFalse(detector.isProperType("Abbbbbbb}"))
        assertFalse(detector.isProperType("Abbbbbbb]"))
        assertFalse(detector.isProperType("Abbbbbbb@"))
        assertFalse(detector.isProperType("Abbbbbbb%"))
        assertFalse(detector.isProperType("Abbbbbbb^"))
        assertFalse(detector.isProperType("Abbbbbbb&"))
        assertFalse(detector.isProperType("Abbbbbbb*"))
    }

    @Test
    fun testForCapitalLetters() {
        val detector = PasswordDetector()
        assert(detector.isProperType("Abbb^bbbb"))
        assertFalse(detector.isProperType("abb^bbbbb"))
        assert(detector.isProperType("abbb^bbbB"))
        assert(detector.isProperType("AAA^AAAAAAA"))
    }

    @Test
    fun testForSpecialCharacter() {
        val detector = PasswordDetector()
        assert(detector.isProperType("Abbb^bbbb"))
        assertFalse(detector.isProperType("abbbbMNbb"))
        assert(detector.isProperType("abbb%bbbB"))
        assert(detector.isProperType("AAA^AA%@$#%@$%#@$#%AAAAA"))
    }

    @Test
    fun testForLength() {
        val detector = PasswordDetector()
        assertFalse(detector.isProperType("Ab"))
        assertFalse(detector.isProperType(""))
        assertFalse(detector.isProperType("abb"))
        assertFalse(detector.isProperType("abbB"))
        assert(detector.isProperType("AAA^AA%@$#%@$%#@$#%AA%%%ASDFHNANDNAKSDKVJAKSDNFKNVKANSDKVNAKISDFVKNASKDNVKASAAA"))
    }
}