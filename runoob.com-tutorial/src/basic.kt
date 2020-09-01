package basic

fun main() {
    println(sum(1, 2))
    println(sum1(1, 2))
    println(sum2(1, 2))
    println(sum3(1, 2))
    println(sum4(1, 2, 3, 4, 5, 6, 7))
    println(sum5(1, 2))
}

fun sum(a: Int, b: Int): Int {
    return a + b
}

fun sum1(a: Int, b: Int) = a + b

public fun sum2(a: Int, b: Int): Int = a + b

fun sum3(a: Int, b: Int): Int {
    val f1 = fun(a: Int): Int {
        return a - 1
    }
    val f2 = fun(b: Int): Int {
        return b + 1
    }

    return f1(a) + f2(b)
}

fun sum4(vararg args: Int): Int {
    var ret = 0
    for (arg in args) {
        ret = ret + arg
    }
    return ret
}

fun sum5(a: Int, b: Int): Int {
    val sumLambda: (Int, Int) -> Int = { x, y -> x + y }
    return sumLambda(a, b)
}
