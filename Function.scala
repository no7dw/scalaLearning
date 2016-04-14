class Calculator(brand: String){
	var color: String = brand match{
			case "TI" => "blue"
			case "HP" => "black"
			case _ => "white"
	 	}
	def add(m: Int, n: Int): Int = m + n
}

class ScientificCalculator(brand: String) extends Calculator(brand){
	def log(m: Double, base: Double) = math.log(m) / math.log(base)
	
}

class EvenMoreScientificCalculator(brand: String) extends ScientificCalculator(brand){
	def log(m: Double): Double = log(m, math.exp(1))
}

object Function {
	def main(args: Array[String]): Unit = {
	  var calc = new Calculator("HP")
	  println(calc.color)
	  println(calc.add(1,2))
	  var calcs = new ScientificCalculator("TI")
	  println(calcs.color)
	  println(calcs.log(1,2))
	  var calces = new EvenMoreScientificCalculator("TI")
	  println(calces.color)
	  println(calces.log(10))
	}
}