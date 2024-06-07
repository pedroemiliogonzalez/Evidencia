package adressbook;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AgendaTelefonica_main {
	public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static AdminAgenda contactos = new AdminAgenda();
	
	public static void main(String[] args) throws IOException {
		int control = 0;
		String opt;
	
		while (control == 0) {
			mostrarMenu();
			System.out.print("Selecciona una opcion: ");
			opt = in.readLine();
			
			switch (opt.toUpperCase()) {
			case "A":
		        	contactos.CargarContactosFile();
		    		contactos.Mostrar();
				break;
			case "B":
					System.out.print("Agrega el numero de telefono: ");
					String key = in.readLine();
					System.out.print("Agrega su nombre: ");
					String value = in.readLine();
					contactos.addContacto(key, value);
					contactos.Mostrar();
					contactos.actualizaContactoFile();
		    		
				break;
			case "C":
					System.out.print("\n Eliminar un contacto: \n");
					// System.out.print("Agrega su telefono: ");
					// String nombre = in.readLine();
		            contactos.deleteContacto();
		    		contactos.Mostrar();
		    		contactos.actualizaContactoFile();
				break;
			case "D":
				System.out.println("### Salista de la agenda telefonica, hasta pronto! ###");
				control = 1;
				break;
			default:
				System.out.println("Seleccion incorrecta, por favor ingresar una opción del menu.");
			}		
		}
	};

			private static String mostrarMenu() {
				String op = "u";
				System.out.println("\n #####Menu de opciones#####");
				System.out.println("A: Mostrar Contactos.");
				System.out.println("B: Agregar un contacto.");
				System.out.println("C: Eliminar un contacto.");
				System.out.println("D: Salir de la agenda telefonica");
				return op;
			}
};
