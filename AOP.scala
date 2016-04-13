// AOP.scala
trait TAction{
	def doAction
}

trait TBeforeAfter extends TAction{
	abstract override def doAction{
		println("=== entry before-action")
		super.doAction
		println("=== exit after-action")
	}
}

class RealAction extends TAction{
	def doAction = {println("** this is the real shit get done **")}
}

trait TTwiceAction extends TAction {
	abstract override def doAction{
		for(i <- 1 to 2){
			super.doAction
			println("===>Done No." + i)
		}
	}
}

object AOP {
	def main(args: Array[String]): Unit = {
	  var act1 = new RealAction with TBeforeAfter
	  act1.doAction
	  println("---------\n")
	  var act2 = new RealAction with TTwiceAction with TBeforeAfter
	  act2.doAction
	  println("---------\n")
	  var act3 = new RealAction with TBeforeAfter with TTwiceAction
	  act3.doAction
	}
}