package evaluacionfinalmod1;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
/**

 * Esta clase contiene el menú con las opciones a seleccionar por consola que
 * instancian los metodos para completar la informacion deseada
 * 
 * @authores: Mauricio Sepulveda, Mauricio Marin, Nicolas Bonilla, Marcos Hanson

 * @version: 8/02/2021A

 */


public class Principal {

	public static void main(String[] args) {

		Contenedor conten = new Contenedor();//instanciamiento de la clase Contenedor

		Scanner leer = new Scanner(System.in);//captura los datos ingresados por teclado
		boolean salir = false;
		int opcion; // Guarda la opcion del usuario

		while (!salir) {// condicional para repetir hasta que seleccione salir
			System.out.println(" ");
			System.out.println("SISTEMA DE INFORMACION");
			System.out.println(" ");

			System.out.println(" 1. Almacenar cliente: ");
			System.out.println(" 2. Almacenar profesional: ");
			System.out.println(" 3. Almacenar administrativo: ");
			System.out.println(" 4. Almacenar capacitacion: ");
			System.out.println(" 5. Eliminar Usuario: ");
			System.out.println(" 6. Listar Usuarios: ");
			System.out.println(" 7. Listar usuarios por tipo: ");
			System.out.println(" 8. Listar capacitaciones: ");
			System.out.println(" 9. Salir: ");

			try {//condicional para seleccionar solo los numeros del menu
				System.out.println(" ");
				System.out.println(" Elija una opcion: ");
				opcion = leer.nextInt();

				switch (opcion) {//switch que despliega el metodo invocado segun la opcion seleccionada
					case 1:
						conten.almacenarCLiente();
						break;
					case 2:
						conten.almacenarProfesional();
						break;
					case 3:
						conten.almacenarAdministrativo();
						break;
					case 4:
						conten.almacenarCapacitacion();
						break;
					case 5:
						conten.eliminarUsuario();
						break;
					case 6:
						conten.listarUsuario();
						break;
					case 7:
						conten.listarUsuariosPorTipo();
						break;
					case 8:
						conten.listarCapacitaciones();
						break;
					case 9:
						// salir del menu
						salir = true;
						break;
					default:
						System.out.println("Solo opciones entre 1 y 9");
				}
			} catch (InputMismatchException capturaExepcion) {
				System.out.println("Ingresar solo numeros entre 1 y 9");
				leer.next();
			}

		}

	}

}