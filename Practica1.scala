

//1.-Radio de un circulo

//2.-Saber si un numero es primo
// These functions test for even and odd numbers.
def isEven(number: Int) = number % 2 == 0
def isOdd(number: Int) = !isEven(number)

// Generate a range of numbers to test.
val tests = List.range(-2, 10)

// Loop over numbers and indicate whether they are even or odd.
for (n <- tests) {
    print(n)
    if (isEven(n)) {
        println(" -> Even")
    }
    if (isOdd(n)) {
        println(" -> Odd")
    }
}

//3.- Tweet
var bird = "Tweet"
println = ("Estoy escribiendo un " + bird)

//4.-Slice

var text = "Hola Luke yo soy tu padre!"
text.slice(5,9)

//5. Cual es la diferencia en value y una variable en scala?
//  Res = las variables pueden ser modificables, mientras las de value son constantes
// y no se pueden modificar.

//6.Tupla de 3.1416
val tupla = ((2,4,5),(1,2,3),(3.1416,23))
