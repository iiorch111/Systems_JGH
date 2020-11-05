enum EstadoSemaforo{

	ROJO,
	AMBAR,
	VERDE
}

public class Semaforo{
//propiedades de la clase
	EstadoSemaforo color = EstadoSemaforo.ROJO;
	boolean parpadea = false;
//no lleva constructor

public void MostrarSemaforo(){
	System.out.println("El semáforo esta en: " + color);
}
public static void main(String[] args) {
	Semaforo miSemaforo;
	miSemaforo = new Semaforo();
	miSemaforo.MostrarSemaforo();
	miSemaforo.color = EstadoSemaforo.AMBAR;

System.out.println("El estado del semáforo ahora es: " + miSemaforo.color);
}
