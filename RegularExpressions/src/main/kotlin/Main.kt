fun main(args: Array<String>) {
    val intDetector = IntegerDetector()
    println(intDetector.detectType(""))
    println(intDetector.detectType("111"))
    println(intDetector.detectType("11a1"))
    println(intDetector.detectType("012"))
    println(intDetector.detectType("551652415216521524112"))
}