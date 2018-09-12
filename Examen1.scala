
//Ejercicio 1

def isEven(number: Int) = number % 2 == 0


def EJ1(number: Int) : Boolean = {

    if(isEven(number)) {
          return true
    }
        false

}
EJ1(4)
EJ1(7)


// Ejercicio 2

def isEven(number: Int) = number % 2 == 0
def isOdd(number: Int) = !isEven(number)

def EJ2(test:List[Int]) : String = {
val n = 0

for (n <- tests) {
    print(n)
    if (isEven(n)) {
        println(" -> Par" )

    }
    if (isOdd(n)) {

        println(" -> Impar"  )
    }

}
return "Listo"
}
val LISTA = List.range(-2, 10)
EJ2(LISTA)


//Ejercio 3
val milist = List(1,3,3,4,6,7,3,7)
def EJ3(lista:List[Int]) : Int = {

val x =  lista.map(e => if(e==7) 14 else e)
val TT = x.sum
return TT
}
EJ3(milist)


//Ejercicio 4

def EJ4(Listap:List[Int], Seccion:Int): Boolean = {
  var sup = 0
  var inf = 0
  var x = 0
  while(x< Listap.size){
    if(x <= Seccion-1){
    sup = sup + Listap(x)
    println(sup)
    }
    else{
    inf= inf + Listap(x)
    println(inf)
    }
    x = x+1
  }
  if(sup == inf){
    return true
  }else{
    return false
  }
}
var milista= List(1,3,3,4,6,7,3,7)
var partir = milista.size/2


EJ4(milista,partir)




//Ejercicio 5

def EJ5 (Cadena:String) : Boolean = {

val alreves=Cadena.reverse

if (Cadena == alreves)
  {
    return true
} else {
    return false
}
}
val texto = "popu"
EJ5(texto)
