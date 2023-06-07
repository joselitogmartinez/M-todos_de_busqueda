package Busqueda;

public class Busquedas {

	public int  Busqueda_Binaria(int array[], int elemento){
		int primero, central, ultimo, Centroval;
		
		primero = 0;
		ultimo = array.length -1;
		while(primero <= ultimo) {
			central = (primero + ultimo)/2;
			Centroval = array[central];
			System.out.println("Comparacion de " + elemento + " con " + array[central]);
			
			if(elemento == Centroval) {
				return central;
			}else if(elemento < Centroval) {
				ultimo = central - 1;
			}else {
				ultimo = central + 1;
				}
			}
		return -1;	
	}
	
	public int Busqueda_Secuencial(int array[], int elemento) {
		for(int i=0; i < array.length; i++) {
			if(elemento == array[i]) {
				System.out.println("El elemento se pudo encontrar en la posicion " + i);
				return i;
			}
		}	
		return -1;	
	}
}
