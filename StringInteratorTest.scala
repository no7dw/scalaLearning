// minxin.scala
//范型
abstract class AbsIterator{
	type T 
	def hasNext: Boolean
	def next:T
}

trait RichIterator extends AbsIterator{
	def foreach(f:T => Unit){
		while(hasNext) f(next)
	}
}

class StringInterator(s: String) extends AbsIterator {
	type T = Char
	private var i = 0
	def hasNext = i < s.length
	def next = {var ch = s charAt i; i+=1; ch}
	
}

object StringInteratorTest {
	def main(args: Array[String]){
		class Iter extends StringInterator(args(0)) with RichIterator
		if(args.length<=0)
			return println("must has input string")

		var iter = new Iter
		iter foreach println
	}
}

//scala StringInteratorTest 'aaassc'