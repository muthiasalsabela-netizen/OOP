package id.ac.polbeng.muthia.test_kelas

class GreeterTest {
    var text: String = ""
    fun greet() {
        println("Hello object world!")
    }
    fun greet(name: String) {
        println("$text $name")
    }
    fun with_ret_val(name: String): String {
        return "$text $name"
    }
}
fun main() {
    val greeter = GreeterTest()
    greeter.greet()
    greeter.text = "Hi"
    greeter.greet("Anton")
    greeter.greet("Budi")
    greeter.text = "Hello programmer"
    println(greeter.with_ret_val("Dono"))
}
