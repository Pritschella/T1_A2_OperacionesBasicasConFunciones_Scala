

object AlgoritmoDeNewton {
  
  var resultado = 0.0
  
    def raizCuadrada(x:Double, y:Double): Unit = {
    
      var cuociente = x/y
      var promedio = (cuociente + y) /2
      
      var estimacion = promedio * promedio
      var dif = x - estimacion
        
      if(dif<0.0001)
        resultado = promedio
      else
        raizCuadrada(x, promedio)
      }
    
    
    def main(args: Array[String]): Unit = {
      raizCuadrada(2,1)
      println("El resultado es: " + resultado)
    }
  
}
