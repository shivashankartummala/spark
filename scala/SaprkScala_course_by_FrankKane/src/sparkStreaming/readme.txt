#Spark streaming examples
######## These are from spark streaming course by Frank Kane   [https://www.udemy.com/taming-big-data-with-spark-streaming-hands-on/]

PrintTweets.scala : This need Utilities.scala. This shows the usage of steraming API to fetch tweets from a twitter app.
                      We need the jars dstream-twitter_2.11-2.3.0-SNAPSHOT, twitter4j-core-4.0.4.jar, twitter4j-stream-4.0.4.jar to  
                         be added to buildpath for streaming API nad twitter API that we use in this program.

Utilities.scala : this is the utlities class that is refrerred in all the other spark streaming applications here. It contains, utlity methods to parse input using regular expressions, logging routines, etc.

SaveTweets.scala : this saves the teweets from the streaming of rdd to to given output directory.

AverageTweetLength.scala :  this shows the usage of 

PopularHashtags.scala : this whows the usage of 

LogParser.scala : this whows the usage of 

LogAlarmer.scala : this whows the usage of 

LogSQL.scala  : this whows the usage of spark sql in streaming mode.

LogSQLToJson.scala : this whows the writing the streaming rdd data to a json file.

StructuredStreaming.scala : this whows the usage of spark 2.0 streaming api that uses datasets to do structured streaming.

KafkaExample.scala : this whows the usage of spark streaming integration to a kafka source.

Sessionizer.scala : this whows the usage of maintain and track state info to aggregate for a given window.

StreamingRegression.scala : this whows the usage of spark Machine learning model linear regression in streaming mode.

StreamingKMeans.scala : this whows the usage of spark machine learning model Kmeans clustering in streaming mode.
