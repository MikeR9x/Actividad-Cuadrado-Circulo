
//Programa de Miguel Angel Reyes Contreras ID:178139

public class Circulo {
	public int radio = 178139;
	public double circunferencia;
	public double area;
	public String nombre = "hello";
	
	public double calcularArea(){
		return area = Math.PI*(Math.pow(radio, 2));
	}
	
	public double calcularCircunferencia() {
		return circunferencia = 2*Math.PI*radio;
	}
	
	public int cambiarRadio(int radio) {
		return this.radio = radio;
	}
	 
}
