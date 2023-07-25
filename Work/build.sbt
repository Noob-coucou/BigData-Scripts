lazy val root = (project in file("."))
  .aggregate(kafka)

lazy val kafka = (project in file("Kafka"))
lazy val spark=(project in file("Spark"))
