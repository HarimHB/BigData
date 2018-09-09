import org.apache.spark.sql.SparkSession

val spar = SparkSession.builder().getOrCreate()

val df = spark.read.option("header", "true").option("inferSchema","true")csv("CitiGroup2006_2008")

//Timestamps

//1. weekofyear extrae el numero de la semana como un Integer dado desde el  date/timestamp/string.

df.select(weekofyear(df("Date"))).show()

//2. dayofweek extrae el dia de la semana como un Integer dado desde el  date/timestamp/string.

df.select(dayofweek(df("Date"))).show()

//3. dayofmonth extrae el dia del mes como un Integer dado desde el  date/timestamp/string.

df.select(dayofmonth(df("Date"))).show()

//4.last_day da la fecha de la columna , regresando el ultimo dia del mes de la fecha dada

df.select(last_day(df("Date"))).show()

//5.to_date convierte la columna en un data type
df.select(to_date(df("Date"))).show() 
