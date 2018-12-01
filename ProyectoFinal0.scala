import org.apache.spark.sql.SparkSession
import spark.implicits._
import org.apache.spark.sql.Column
import org.apache.spark.ml.feature.VectorAssembler
import org.apache.spark.ml.Pipeline
import org.apache.spark.ml.clustering.BisectingKMeans

import org.apache.log4j._
Logger.getLogger("org").setLevel(Level.ERROR)
val spark = SparkSession.builder.master("local[*]").getOrCreate()


val df = spark.read.option("inferSchema","true").csv("Iris").toDF(
  "SepalLength", "SepalWidth", "PetalLength", "PetalWidth","class"
)

val newcol = when($"class".contains("Iris-setosa"), 1.0).
  otherwise(when($"class".contains("Iris-virginica"), 3.0).
  otherwise(2.0))
val newdf = df.withColumn("etiqueta", newcol)
newdf.select("etiqueta","SepalLength", "SepalWidth", "PetalLength", "PetalWidth","class").show(150, false)

//Junta los datos
val assembler = new VectorAssembler()  .setInputCols(Array("SepalLength", "SepalWidth", "PetalLength", "PetalWidth","etiqueta")).setOutputCol("features")
//Transformar datos
val features = assembler.transform(newdf)
features.show(5)
val bkm = new BisectingKMeans().setK(10).setSeed(1)
val model = bkm.fit(features)

//11 Evaluar los grupos utilizando WSSSE
val WSSSE = model.computeCost(features)
println(s"Within set sum of Squared Errors = $WSSSE")
//12 Mostrar lso resultados
println("Cluster Centers: ")
//val centers = model.clusterCenters
model.clusterCenters.foreach(println)
