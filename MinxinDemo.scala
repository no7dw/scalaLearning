// MinxinDemo.scala
class Person

trait TTeacher extends Person {
	def teach //virtual method
}

trait TPainoPlayer extends Person {
	def playPiano = {
		println("I'm playing piano.")
	}
}

class PianoPlayingTeacher extends Person with TTeacher with TPainoPlayer{
	def teach = {println("I'm teaching students.")}
}

object MinxinDemo {
	def main(args: Array[String]){
		var t1 = new PianoPlayingTeacher
		t1.playPiano
		t1.teach
		var tanakaTaro = new Person with TTeacher with TPainoPlayer{
			def teach = {println("I'm happily teching students.")}
		}
		tanakaTaro.playPiano
		tanakaTaro.teach
	}
}
