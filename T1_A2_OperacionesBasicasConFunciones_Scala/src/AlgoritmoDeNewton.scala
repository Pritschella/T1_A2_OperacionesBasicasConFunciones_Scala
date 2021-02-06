

object AlgoritmoDeNewton {
  
  var resultado = 0.0
  
  def cuociente(x:Double, y:Double): Double = {
    x / y
  }
  
  def promedio(cuociente:Double, y:Double): Double = {
    (cuociente + y) / 2
  }
  
  def dif(promedio:Double, x:Double): Boolean = {
    var estimacion = promedio * promedio
    var dif = estimacion - x
    
    if(dif<0.0001)
      true
    else
      false
  }
  
  def raizCuadrada(x:Double, y:Double): Unit = {
    var prom = promedio(cuociente(x,y),y)
    
    if(dif(prom, x))
      resultado = prom
    else
      raizCuadrada(x,prom)
  }
  
    
  def main(args: Array[String]): Unit = {
    
    print("Ingrese x: ")
    val x = readInt()
    println("Ingrese y: ")
    val y = readInt()
    
    raizCuadrada(x, y)
    println("El resultado es: " + resultado)
    
  }
  
}
