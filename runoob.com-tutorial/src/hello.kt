package hello

fun main() {
    println("Hello world!")
    Greeter("World").greet()
}

class Greeter(val name: String) {
    fun greet() {
        println("Hello, $name")
    }
}