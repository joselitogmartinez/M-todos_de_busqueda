package Busqueda;

public class Main {
	public static void main(String[] args) {
		int Vec[]= {45, 1, 432, 213, 43, 98, 10, 9, 67, 21, 19};

		Busquedas Busqueda = new Busquedas();
		
		Busqueda.Busqueda_Binaria(Vec, 1);
		Busqueda.Busqueda_Secuencial(Vec, 10);
	}
}