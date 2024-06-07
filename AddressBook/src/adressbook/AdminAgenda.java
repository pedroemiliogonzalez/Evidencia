package adressbook;
import java.util.HashMap;
//import java.util.ArrayList;
import java.io.*;

public class AdminAgenda{
	//private ArrayList<Agenda> contactos;

	public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

	HashMap<String, String> myContact = new HashMap<>();
	String [] arrayContacto;
	
	String inputFilename = "C:\\Users\\Lenovo\\java\\AddressBook\\src\\adressbook\\input.csv";
	String outputFilename = "C:\\Users\\Lenovo\\java\\AddressBook\\src\\adressbook\\output.csv";
	
	public AdminAgenda() {
		//contactos = new ArrayList<agenda>();
	}
	
	//(Load and Save) Cargar y guardar contactos del archivo
	public void CargarContactosFile() {
		
		BufferedReader bufferedReader = null;
		BufferedWriter bufferdWriter = null;
		
		System.out.println("\n Contactos: ");
		
		try {
			bufferedReader = new BufferedReader(new FileReader(inputFilename));
			bufferdWriter = new BufferedWriter(new FileWriter(outputFilename));
			
			String line; 
			while ((line = bufferedReader.readLine()) != null){
				System.out.println(line);
				bufferdWriter.write(line + "\n");
				arrayContacto = line.split(",");
				myContact.put((arrayContacto[0]), arrayContacto[1]);
				
			}
		}
		catch(IOException e) {
			System.out.println("IOException catched while reading; " + e.getMessage());
		}
		finally {
			try {
				if (bufferedReader != null) {
					bufferdWriter.close();
				}
			}
			catch(IOException e) {
				System.out.println("IOException catched while closing; " + e.getMessage());
			}
		}
	}
	
	//Método para mostrar cpmtactos de la agenda
	public void Mostrar() {
		System.out.println("\n Listado en HashMap: ");
		for(HashMap.Entry<String,String> entry : myContact.entrySet()) {
			String key = entry.getKey();
			String value = entry.getValue();
			
			System.out.println("Listado: ");
			System.out.println(key + " " + value);
		}
	}
	
	//Método crear un nuevo contacto, se agrega a Juan Marquez: "4773956547","Juan Marquez".
	public void addContacto(String key, String value){
		System.out.println ("\n #### Metodo agregar contacto");
		BufferedReader bufferedReader = null;
		BufferedWriter bufferdWriter = null;
		
		
		try {
			bufferedReader = new BufferedReader(new FileReader(inputFilename));
			bufferdWriter = new BufferedWriter(new FileWriter(outputFilename));
			
			String line; 
			while ((line = bufferedReader.readLine()) != null){
				System.out.println(line);
				bufferdWriter.write(line + "/n");
				arrayContacto = line.split(",");
				myContact.put(key, value);
				myContact.put((arrayContacto[0]), arrayContacto[1]);
			}
		}
		catch(IOException e) {
			System.out.println("IOException catched while reading; " + e.getMessage());
		}
		finally {
			try {
				if (bufferedReader != null) {
					bufferdWriter.close();
				}
			}
			catch(IOException e) {
				System.out.println("IOException catched while closing; " + e.getMessage());
			}
		}
		System.out.println ("\n #### Se agrego un nuevo contacto! #### ");
		};
	
	
	//Método para actualizar contactos en el file
	public void actualizaContactoFile() {
		BufferedWriter bufferedWriter = null;
		
		try {
			bufferedWriter = new BufferedWriter(new FileWriter(outputFilename));
			
			String line;
			for (HashMap.Entry<String,String> entry : myContact.entrySet()){
				String key = entry.getKey();
				String value = entry.getValue();
				line = key + ", " + value;
				myContact.put(key,value);
				bufferedWriter.write(line + "\n");
			}
		}
		catch(IOException e) {
			System.out.println("IOException catched while reading; " + e.getMessage());
		}
		finally {
			try {
				if (bufferedWriter != null) {
					bufferedWriter.close();
				}
			}
			catch(IOException e) {
				System.out.println("IOException catched while closing; " + e.getMessage());
			}
		}
	}
	//Método para eliminar un contacto, se elimina a Juan Marquez.
		public void deleteContacto() {
			System.out.println ("\n #### Metodo eliminar contacto");
			myContact.remove("4773956547","Juan Marquez");
			System.out.println ("\n #### Se elimino Juan Marquez! #### \\n");
			BufferedReader bufferedReader = null;
			BufferedWriter bufferdWriter = null;
						
			try {
				bufferedReader = new BufferedReader(new FileReader(inputFilename));
				bufferdWriter = new BufferedWriter(new FileWriter(outputFilename));
				
				String line; 
				while ((line = bufferedReader.readLine()) != null){
					System.out.println(line);
					bufferdWriter.write(line + "n");
					arrayContacto = line.split(",");
					//myContact.remove((arrayContacto[0]), arrayContacto[valor]);
					myContact.put((arrayContacto[0]), arrayContacto[1]);
				}
			}
			catch(IOException e) {
				System.out.println("IOException catched while reading; " + e.getMessage());
			}
			finally {
				try {
					if (bufferedReader != null) {
						bufferdWriter.close();
					}
				}
				catch(IOException e) {
					System.out.println("IOException catched while closing; " + e.getMessage());
				}
			} 

		}
	};
