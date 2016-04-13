//trait like java interface

trait Simlilarity {
	def isSimilar(x: Any) : Boolean
	def isNotSimilar(x: Any) : Boolean = !isSimilar(x)
}

class Point(xc: Int, yc: Int) extends Simlilarity {
	var x: Int = xc;
	var y: Int = yc;
	def isSimilar (obj: Any) = {
		obj.isInstanceOf[Point] && 
		obj.asInstanceOf[Point].x == x
	}
		
}

object TraitsTest extends App {
	var p1 = new Point(2, 3)
	var p2 = new Point(2, 4)
	var p3 = new Point(3, 3)
	println(p1.isNotSimilar(p2));
	println(p1.isNotSimilar(p3));
	println(p1.isNotSimilar(2));
}

//asInstanceOf[T]
// 将对象类型强制转换为T类型, return as possible


//http://docs.scala-lang.org/tutorials/tour/traits