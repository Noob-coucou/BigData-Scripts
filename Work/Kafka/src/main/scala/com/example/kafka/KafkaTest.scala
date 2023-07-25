package com.example.kafka

import java.util.Properties
import org.apache.kafka.clients.producer._

object KafkaTest {
  def main(args: Array[String]): Unit = {
    // 创建一个Properties对象，用于配置Kafka连接参数
    val props = new Properties()
    // 设置Kafka的连接地址，格式为“hostname:port”，这里使用虚拟机的IP地址和Kafka的默认端口9092
    props.put("bootstrap.servers", "192.168.18.131:9092")
    // 设置键的序列化器，这里使用String类型的序列化器
    props.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer")
    // 设置值的序列化器，这里同样使用String类型的序列化器
    props.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer")

    // 创建一个KafkaProducer对象，用于发送消息到Kafka
    val producer = new KafkaProducer[String, String](props)
    // 指定要发送消息的主题名称
    val topic = "test_topic"
    // 创建一个ProducerRecord对象，表示要发送的消息，包括主题、键和值
    val message = new ProducerRecord[String, String](topic, "key", "Hello, Kafka!")

    // 使用KafkaProducer的send方法将消息发送到Kafka服务器
    producer.send(message)

    // 关闭KafkaProducer
    producer.close()
  }
}
