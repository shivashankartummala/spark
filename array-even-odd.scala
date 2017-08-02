#execute this on spark-shell
# spark script to find and display all even number in a parallelized array 1to 1000
val data=(1 to 1000).toArray
val distdata=sc.parallelize(data)
#distdata.count()
# Filter all the even numbers of the array into val even
val even=distdata.filter((x: Int) => x % 2 == 0)
even.show()
# Filter all the odd numbers of the array into val odd
val odd=distdata.filter((x: Int) => x % 2 == 1)
odd.show()
