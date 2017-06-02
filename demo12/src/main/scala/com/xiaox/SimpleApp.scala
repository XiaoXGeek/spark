package com.xiaox

import org.apache.spark.SparkConf
import org.apache.spark.SparkContext

object SimpleApp {
    def main(args: Array[String]): Unit = {
      val logFile = "file:/home/hadoop01/data/test/logFile"
      val conf = new SparkConf().setAppName("Simple Application")
      val sc = new SparkContext(conf)
      val logData = sc.textFile(logFile,2).cache()
      val numAs = logData.filter { line => line.contains("a") }.count()
      val numBs = logData.filter { line => line.contains("b") }.count()
      println(s"Lines with a:$numAs, Lines with b:$numBs")
      sc.stop()
    }
}