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


object AOP {
	def main(args: Array[String]): Unit = {
	  var act1 = new RealAction with TBeforeAfter
	  act1.doAction
	}
}