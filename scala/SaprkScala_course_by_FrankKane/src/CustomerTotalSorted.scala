package com.sstummala.sparkscalacourse

import org.apache.spark._
import org.apache.spark.SparkContext._
import org.apache.log4j._



object CustomerTotalSorted {
  
      
   def parseline(line:String)= {
     val fields = line.split(",")
     
     (fields(0).toInt, fields(2).toFloat)
          
   }
   
   def main(Args : Array[String])={
     
     Logger.getLogger("org").setLevel(Level.ERROR)
     
     val sc = new SparkContext("local[*]", "CustomerTotalSorted")
     
     val lines = sc.textFile("../SparkScala_Data/customer-orders.csv")
     
     val mapped = lines.map(parseline)
     
     val customerTotals = mapped.reduceByKey((x,y) => x+y)
     
     val flipped = customerTotals.map( x => (x._2,x._1))
     
     val sorted = flipped.sortByKey()
     
     val results = sorted.collect
     
     //results.foreach(println(_2 + "," +_1))
     
     results.foreach(println)
     
     
   }
   
}