//mixin-class
abstract class AbsIterator{
	type T
	def hasNext : Boolean
	def next : T
}

trait RichIterator extends AbsIterator {
	def foreach(f: T => Unit) {
		while(hasNext)
			f(next)
	}
}

class StringInterator(s: String) extends AbsIterator{
	type T = Char
	private var i = 0
	def hasNext = i< s.length
	def next = {
		var ch = s charAt i; i+=1; ch 
	}
} 

object StringIteratorTest {
	def main(args: Array[String]){
		class Iter extends StringInterator(args(0)) with RichIterator
		var iter = new Iter
		iter foreach println
	}
	
}

//Array[]
//args[0] args(0)