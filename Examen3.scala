//1 Importar una sesion spark
import org.apache.spark.sql.SparkSession


//2. Utilice las lineas de codigo para reportar errores reducidos
import org.apache.log4j._
Logger.getLogger("org").setLevel(Level.ERROR)

//3.Cree una instancia de la sesion spark

val spark = SparkSession.builder().getOrCreate()

//4 Importar la libreria de Kmeans para el algoritmo de entrenamiento
import org.apache.spark.ml.clustering.KMeans
//5 Cargar el dataset de Wholesale customers Data

val dataset = spark.read.option("header", "true").option("inferSchema","true")csv("Wholesale customers data")

//6 Seleccionar la siguientes columnas para el conjunto de entrenamiento
val df = dataset.drop("Channel","Region")

//7 Importar VectorAsembler and vector
import org.apache.spark.ml.feature.VectorAssembler

//8 Crear un nuevo objecto VectorAsembler para las columnas de caracteristicas como un conjunto de entrada, recordando que no hay eiquetas
val assembler = new VectorAssembler()  .setInputCols(Array("Fresh", "Milk", "Grocery", "Frozen","Detergents_Paper","Delicassen")).setOutputCol("features")
//9Utilice un objeto assembler para transformar feature_data
val features = assembler.transform(df)
//10 Crear un modelo KMeans
val kmeans = new KMeans().setK(3).setSeed(1L)
val model = kmeans.fit(features)

//11 Evaluar los grupos utilizando WSSSE
val WSSE = model.computeCost(df)
println(s"Within set sum of Squared Errors = $WSSE")
//12 Mostrar lso resultados
println("Cluster Centers: ")
model.clusterCenters.foreach(println)
