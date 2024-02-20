//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    name()
    var z = remainder(20, 3)
    var x = add(50, 50, 50, 50)
    interestingFactABoutMyself()
    println(z)
    println(x)
}

fun name(){
    var name = "Hello Ada"
    println(name)
}

fun remainder(value1: Int, value2: Int): Int{
    var result2 = value1%value2
    return result2
}

fun add(num1: Int, num2: Int, num3: Int, num4: Int): Int{
    var result = num1+num2+num3+num4
    return result
}

fun interestingFactABoutMyself(){
    var sentence = "I like watching crime series"
    println(sentence)
}