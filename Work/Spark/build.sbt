name := "spark-module"
version := "1.0"
scalaVersion := "2.13.11"

// 使用阿里云 Maven 仓库源
resolvers += "Aliyun" at "https://maven.aliyun.com/repository/public/"

// 添加Spark依赖
libraryDependencies += "org.apache.spark" %% "spark-core" % "3.4.1"
libraryDependencies += "org.apache.spark" %% "spark-sql" % "3.4.1"

// 添加Hadoop依赖
libraryDependencies += "org.apache.hadoop" % "hadoop-client" % "3.3.4"

// 添加Hive依赖
libraryDependencies += "org.apache.hive" % "hive-exec" % "3.1.3"
