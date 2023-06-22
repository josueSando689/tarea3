package tarea3;
import java.util.Scanner;
public class Expresiones {
	int entero1=0;
	int entero2=0;
	int entero3=0;
	int entero4=0;
	Scanner texto = new Scanner (System.in);
	
	public static void main(String[] args) {
        Expresiones operaciones = new Expresiones();
        operaciones.primerDato();
        operaciones.segundoDato();
        operaciones.tercerDato();
        operaciones.cuartoDato();
    }
	
//-16 + 32 / 4:
    public void primerDato() {
        entero1=32/4;
        int resultado1= -16+entero1;
        System.out.println("El primer resultado es " + resultado1);
    }
//(48 - 7) % 11:
    public void segundoDato() {
        entero2 = 48-7;
        int resultado2= entero2 % 11;
        System.out.println("El segundo resultado es " + resultado2);
    }
//(18 + 2) / (17 - 12):
    public void tercerDato() {
    	entero3 = 18 + 2;
    	byte proceso = 17-12;
    	int resultado3 = entero3 / proceso;
    	System.out.println("El tercer resultado es " + resultado3);
    }
// 17 - 18 / 6 * 3 + 11 % 4:  
    public void cuartoDato() {
    	entero4 = 18/6;
    	int proceso1= entero4*3;
    	int proceso2 = 11%4;
    	int proceso3 = 17-proceso1;
    	int resultado4 = proceso3 + proceso2;
        System.out.println("El cuarto resultado es " + resultado4);
    }
}




