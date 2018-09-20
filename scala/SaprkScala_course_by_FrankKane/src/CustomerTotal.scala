package com.sstummala.sparkscalacourse

import org.apache.spark._
import org.apache.spark.SparkContext._
import org.apache.log4j._


// Count the total amount spent by a each customer on various orders/products.
object CustomerTotal {
  
    def parseLine(line:String)= {
    val fields = line.split(",")
    val customerid = fields(0).toInt
    val amount = fields(2).toFloat
    
    (customerid, amount)
  }
  
    /** Our main function where the action happens */
  def main(args: Array[String]) {
   
    // Set the log level to only print errors
    Logger.getLogger("org").setLevel(Level.ERROR)
    
    val sc = new SparkContext("local[*]", "CustomerTotals")
    
    val lines = sc.textFile("../SparkScala_Data/customer-orders.csv");
    
    val orders = lines.map(parseLine)
    
    val customerTotals = orders.reduceByKey((x,y) => x+y)
    
    val results = customerTotals.collect();
    
    results.foreach(println)
   
    
    
  }
  
}