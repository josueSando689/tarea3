package tarea3;
import java.util.Scanner;
public class DiveNumeros {
	int cociente=0;
	int resto=0;
	Scanner texto = new Scanner (System.in);
	

	public static void main(String[] args) {
		DiveNumeros Division = new DiveNumeros();
		Division.cos();
		Division.res();
		Division.real();
    }
	
	//17/3
    public void cos() {
        cociente=17/3;
        System.out.println("El cociente es " + cociente);
    }

    public void res() {
    	int verificar = 3 * cociente;
        resto = 17 - verificar;
        System.out.println("El resto es " + resto);
    }
    
    public void real() {
    	double respuestaReal = (double) 17 /3;
        System.out.println("La respuesta Real es " + respuestaReal);
    }
}
