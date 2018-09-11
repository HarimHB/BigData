import org.apache.spark.sql.SparkSession

val spar = SparkSession.builder().getOrCreate()

val df = spark.read.option("header", "true").option("inferSchema","true")csv("FL_insurance_sample")

df.printSchema()

df.show()

df.select(avg("policyID")).show()

df.filter($"county"==="MIAMI DADE COUNTY").show()

df.filter("fr_site_limit < 0.50").show()

df.select(max("tiv_2011")).show()
