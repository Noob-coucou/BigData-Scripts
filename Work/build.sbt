name := "BigData-scripts"
version := "1.0"
scalaVersion := "2.13.11"

// 使用阿里云 Maven 仓库源
resolvers += "Aliyun" at "https://maven.aliyun.com/repository/public/"

// 添加Kafka依赖
libraryDependencies += "org.apache.kafka" % "kafka-clients" % "3.5.0"

// 添加Zookeeper依赖
libraryDependencies += "org.apache.zookeeper" % "zookeeper" % "3.7.1"

// 添加Spark依赖
libraryDependencies += "org.apache.spark" %% "spark-core" % "3.4.1"
libraryDependencies += "org.apache.spark" %% "spark-sql" % "3.4.1"

// 添加Hadoop依赖
libraryDependencies += "org.apache.hadoop" % "hadoop-client" % "3.3.4"

// 添加Hive依赖
libraryDependencies += "org.apache.hive" % "hive-exec" % "3.1.3"

// 添加Scala依赖（Scala版本由上面的scalaVersion设置）
libraryDependencies += "org.scala-lang" % "scala-library" % scalaVersion.value

// 添加Pig依赖
libraryDependencies += "org.apache.pig" % "pig" % "0.17.0"

// 添加 Logback 依赖
libraryDependencies += "ch.qos.logback" % "logback-classic" % "1.2.6"
