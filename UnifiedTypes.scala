object UnifiedTypes extends App {
  val set = new scala.collection.mutable.LinkedHashSet[Any]
  set += "This is a string"  // add a string
  set += 732                 // add a number
  set += 'c'                 // add a character
  set += true                // add a boolean value
  set += main _              // add the main function
  val iter: Iterator[Any] = set.iterator
  while (iter.hasNext) {
    println(iter.next.toString())
  }
}

//App object 已经包含main 方法
// 所有里面的方法都会会在嗲用的时候立刻执行

// scala> UnifiedTypes.main(Array())
// This is a string
// 444
// true
// <function1>