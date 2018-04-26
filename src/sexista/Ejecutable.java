package sexista;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejecutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Persona> listado = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		int eleccion = 0;
		int edad;
		String nombre;
		String ciudad;
		Persona p = null;
		
		do {
			
			System.out.println("Introduzca 1 para generar un hombre, 2 para una mujer, 3 para salir.");
			eleccion = Integer.valueOf(sc.nextLine());

			System.out.println("introduzca su nombre: ");
			nombre = sc.nextLine();
			System.out.println("introduzca su edad: ");
			edad = Integer.valueOf(sc.nextLine());
			System.out.println("introduzca su ciudad: ");
			ciudad = sc.nextLine();

			if (eleccion == 1) {

				p = new Hombre(edad, nombre, ciudad);

			} else if (eleccion == 2) {

				p = new Mujer(edad, nombre, ciudad);

			} else {

				System.out.println("adios");
				eleccion = 3;

			}
			listado.add(p);
		} while (eleccion != 3);

		sc.close();

		for (Persona o : listado) {

			if (o.getEdad() >= 18)
				System.out.println("Se llama: " + o.getNombre() + " y es mayor de edad.");
			else
				System.out.println("Se llama: " + o.getNombre() + " y es menor de edad.");

		}

	}
}