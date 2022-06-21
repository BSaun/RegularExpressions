fun main() {
    val detector = EmailDetector()

//    email test
    println(detector.detectType("{}*$.&$*(@*$%&.*&*"))
    println(detector.detectType("a@b.c"))
    println(detector.detectType("joseph.ditton@usu.edu"))
    println(detector.detectType("@b.c"))
    println(detector.detectType("a@b@c.com"))
    println(detector.detectType("a.b@b.b.c"))
    println(detector.detectType("joseph ditton@usu.edu"))

//    binary test
//    println(detector.detectType("1000110100001"))
//    println(detector.detectType(""))
//    println(detector.detectType("1a0"))
//    println(detector.detectType("1.11"))
//    println(detector.detectType("111"))
//    println(detector.detectType("01"))
//    println(detector.detectType("10"))
//    println(detector.detectType("101"))

//    float test
//    println(detector.detectType(""))
//    println(detector.detectType("1.11"))
//    println(detector.detectType("111"))
//    println(detector.detectType("11.a1"))
//    println(detector.detectType(".012"))
//    println(detector.detectType("55165241.5216521524112"))
//    println(detector.detectType("01.2"))
//    println(detector.detectType("."))
//    println(detector.detectType("1023.031"))
}