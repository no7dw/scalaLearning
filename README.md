# scalaLearning

###run
like java
	
	javac xxx.java
	java xxx

run in scala

	scalac xxx.scala
	scala xxx


otherwise , [code not work][1]

## 注:
	calling method does not need the () when without parameters
	

## synx

### trait

	trait like interface
	multi inheri : extends someClass with traitA with traitB with traitC

### Unit


## be careful

### 负数

	scala> var a=- 1
     | 

	scala> var a=1
	a: Int = 1

	scala> var a= - 11
	a: Int = -11

## function

### Scala Class Hierarchy

The superclass of all classes scala.Any has two direct subclasses scala.AnyVal and scala.AnyRef
![此处输入图片的描述][2]
   Any
  |   \
AnyVa AnyRef

### trait vs abstract

	什么时候应该使用特质而不是抽象类？ 如果你想定义一个类似接口的类型，你可能会在特质和抽象类之间难以取舍。这两种形式都可以让你定义一个类型的一些行为，并要求继承者定义一些其他行为。一些经验法则：

	优先使用特质。一个类扩展多个特质是很方便的，但却只能扩展一个抽象类。
	如果你需要构造函数参数，使用抽象类。因为抽象类可以定义带参数的构造函数，而特质不行。例如，你不能说trait t(i: Int) {}，参数i是非法的。

### extends AnyRef with xTrait 用法释义：
    extends 某个class 实现 xTrait 定义的接口

### object

### 返回值：
   scala 可以返回多个值:

    def addTransactions(ktMap: Map[Int, KTransaction]): (List[Long], Map[Int, FinportfolioException]) = {
        (ktIdList.toList, exceptionMap.toMap)
       }


### case: match Some None



[REF][3]


  [1]: http://stackoverflow.com/questions/3332751/why-the-hello-world-is-not-output-to-the-console
  [2]: http://docs.scala-lang.org/resources/images/classhierarchy.img_assist_custom.png
  [3]: https://twitter.github.io/scala_school/zh_cn/basics.html
