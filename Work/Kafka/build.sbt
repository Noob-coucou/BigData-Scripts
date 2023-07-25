name := "kafka-module"
version := "1.0"
scalaVersion := "2.13.11"

// 使用阿里云 Maven 仓库源
resolvers += "Aliyun" at "https://maven.aliyun.com/repository/public/"

// 添加Kafka依赖
libraryDependencies += "org.apache.kafka" % "kafka-clients" % "3.5.0"

// 添加logback依赖
libraryDependencies += "ch.qos.logback" % "logback-classic" % "1.2.6"