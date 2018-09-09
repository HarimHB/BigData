
import org.apache.spark.sql.SparkSession

val spar = SparkSession.builder().getOrCreate()

val df = spark.read.option("header", "true").option("inferSchema","true")csv("CitiGroup2006_2008")

/// 15 Agreggate Functions

// 1. Count regresa el numero de items en un grupo o columna

df.select(count("High")).show()

// 2. countDistinct regresa el numero de items distintos en un grupo o columna

df. select(countDistinct("High")).show()

//3. first regresa el primer valor de un grupo o columna

df.select(first("High")).show()

//4. avg regresa un valor promedio de un grupo o columna

df.select(avg("High")).show()

//5. collect_list regresa una lista de objetos duplicados eliminados

df.select(collect_list("High")).show()

//6.  covar pop devuelve la covarianza de población para dos columnas.

df.select(covar_pop("High" ,"Low" )).show()

//7.  covar samp devuelve la covarianza de muestra para dos columnas.


df.select(covar_samp("High" ,"Low" )).show()

//8. kurtosis regresa el valor de curtosis  de un grupo o columna

df.select(kurtosis("High")).show()

//9. Last regresa el ultimo valor de un grupo o columna

df.select(last("Low")).show()

// 10. min regresa el valor mas pequeño de un grupo o columna

df.select(min("Low")).show()

//11. max regresa el valor mas grande de un grupo o columna

df.select(max("Low")).show()

//12 skewness devuelve la asimetria de un grupo o columna

df.select(skewness("Low")).show()

//13 stddev devuelve la desviacion estandar de un grupo o columna

df.select(stddev("Low")).show()

//14 sum devuelve la suma total de todos los elementos del grupo o columna

df.select(sum("Low")).show()

//15 Variance devuelve la varianza imparcial de los valores en un grupo.

df.select(variance("Low")).show()
