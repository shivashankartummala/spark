#spark code files in scala [Please read the below notes before trying to run, examine the code]
### These are from spark scala course by Frank Kane . []
RatingsCounter.scala
MinTemperatures.scala
MaxTemperatures.scala
MaxPrecipitation.scala
FriendsByName.scala
FriendsByAge.scala 

WordCount.scala : shos the basic sprak program, usage of flatmap and countByValue functions.

WordCountBetter.scala    : shows regular expression in text processing to improve the accuracy of results. also shows the usage of mao and reduceByKey methods.

WordCountBetterSorted.scala : shows sorting of the results by value, by using SortByKey method, after flipiing key, value

CustomerTotal.scala      :  shows the basic metheods to parse inout data, create RDD and mapping the input and reducing it to get the required output.

CustomerTotalSorted.scala : shows sorting of the results.

PopularMoviesNicer.scala :  shows the usage of broadcast variables

MostPopularSuperhero.scala : shows usage of scala options. Also demonstrates joining two RDDs using lookup method.

DegreesOfSeparation.scala : shows the usage of accumulator. Also demonstrates the implementation BFS alogorithm in spark code.

MovieSimilarities.scala : shows item based collaborative clustering to recommend movies similar to given movie that is passed as commandline agrument.

MovieSimilarities1M.scala : shows the suage of spark execution on a EMR cluster and it leverages partitioning an RDD to optimize parallelization to make use of the cluster resources.

SparkSQL.scala  : shows the usage of spark sql , define schema , create table/view and query the dataset using sql.
DataFrames.scala  : shows the usage of dataframe methods for querying the dataset/dataframe. 
PopularMoviesDataSets.scala : shows the usage of datframes/datasets for sorting, groupby operations on the dataset.


LinearRegression.scala : shows the usage of MLlib , demonstrates Linear Regression using Stocastic Gradient Descent technique.

LinearRegressionDataFrame.scala : shows the usage of spark machine learning using dataframes/datasets. also demonstartes splitting the input data into training dataset and testing dataset to run the machine learning model. This uses org.apache.spark.ml package which is a new alternative to org.apache.spark.mllib, that it supports the datasets/Dataframes API.

PopularHashtags.scala : shows usage of spark streaming API to stream data from twitter and process it in a continous sliding window.
                         We need the jars dstream-twitter_2.11-2.3.0-SNAPSHOT, twitter4j-core-4.0.4.jar, twitter4j-stream-4.0.4.jar to  
                         be added to buildpath for streaming API nad twitter API that we use in this program.

GraphX.scala : shows the usage of GraphX library and pregel API to process data to analyze the data that cane be represented as graph [vertices, Edges]


                         
                         
