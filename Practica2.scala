val st = ("This is a long string")
st.slice(10,15)

//1.- Lista
val lista = List("Rojo","Blanco","Negro")

//2.- Añadir elementos
val p1 = "Verde" :: lista
val p2 = "Amarrillo" :: lista
val p3 = "Azul" :: lista
val p4 = "Naranja" :: lista
val p5 = "Perla" :: lista
//3.-Traer los elementos verde,Amarrillo y Azul

p4.slice(1,4)

//4.- Crea un arreglo de numero en rango del 1-1000 en pasos de 5 en 5
Array.range(1,1000,5)

//5.-Cuales son los elementos unicos de la lista Lista(1,3,3,4,6,7,3,7) utilice conversion a conjuntos

val milista = List(1,3,3,4,6,7,3,7)
milista.toSet
val newset = milista.toSet

// 6.- Crea una mapa mutable llamado nombres que contenga los siguiente
//     "Jose", 20, "Luis", 24, "Ana", 23, "Susana", "27"

val mutmap = collection.mutable.Map(("Jose", 20), ("Luis", 24), ("Ana", 23),("Susana",27))

// 6 a . Imprime todas la llaves del mapa
mutmap.keys
// 7 b . Agrega el siguiente valor al mapa("Miguel", 23)
mutmap += ("Miguel"-> 23)
