spark code files in scala

RatingsCounter.scala
MinTemperatures.scala
MaxTemperatures.scala
MaxPrecipitation.scala
FriendsByName.scala
FriendsByAge.scala 

WordCount.scala : shos the basic sprak program, usage of flatmap and countByValue functions.
WordCountBetter.scala    : shows regular expression in text processing to improve the accuracy of results. also shows the usage of mao and reduceByKey methods.
WordCountBetterSorted.scala : shows sorting of the results by value, by using SortByKey method, after flipiing key, value
CustomerTotal.scala      :  
CustomerTotalSorted.scala : shows sorting of the results.
PopularMoviesNicer.scala :  shows the usage of broadcast variables
MostPopularSuperhero.scala : shows usage of scala options. Also demonstrates joining two RDDs using lookup method.
DegreesOfSeparation.scala : shows the usage of accumulator. Also demonstrates the implementation BFS alogorithm in spark code.
MovieSimilarities.scala : shows item based collaborative clustering to recommend movies similar to given movie that is passed as commandline agrument.
MovieSimilarities1M.scala : shows the suage of spark execution on a EMR cluster and it leverages partitioning an RDD to optimize parallelization to make use of the cluster resources.
