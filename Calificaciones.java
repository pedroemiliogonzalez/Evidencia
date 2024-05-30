package calificaciones;
import java.util.*; 

public class Calificaciones {
	String nombre = "";
	int[] calif = new int[5];
	
	public void setName(String pNombre) {
		nombre = pNombre;
	};
	
	public float promedioCal() {
		float promedio = 0;
		int suma = 0;
		
		for (int i=0; i<calif.length;i++) {
			suma+=calif[i];
		}
		
		promedio = (suma/calif.length);
		
		System.out.println("Promedio final es: " + promedio);
		return promedio;
	};
	
	public void setCalificaciones() {
		try (Scanner s = new Scanner (System.in)) {
				System.out.println("Calificacion 1: ");
				calif[0] = s.nextInt();
				
				System.out.println("Calificacion 2: ");
				calif[1] = s.nextInt();
				
				System.out.println("Calificacion 3: ");
				calif[2] = s.nextInt();
				
				System.out.println("Calificacion 4: ");
				calif[3] = s.nextInt();
				
				System.out.println("Calificacion 5: ");
				calif[4] = s.nextInt();
			}
	};
	
	public char calificacion (float pPromedio) {
		char nota = ' '; 
		
		if(pPromedio >= 51.00 && pPromedio <= 60) nota = 'E';
		else if (pPromedio >= 61 && pPromedio <= 70) nota = 'D';
		else if (pPromedio >= 71 && pPromedio <= 80) nota = 'C';
		else if (pPromedio >= 81 && pPromedio <= 90) nota = 'B';
		else if (pPromedio >= 91 && pPromedio <= 100) nota = 'A';
		else nota = 'F';
		
		return nota;
	};	

	public void imprimeCalificaciones (String nombre, float pPromedio, char pNota) {
		
		System.out.println("Nombre del estudiante: " + nombre);
		
		
		for (int i=0; i<calif.length;i++) {
			System.out.println("Calificacion " + (i+1) + ": " + calif[i]);
		}
		
		System.out.println("Promedio: " + pPromedio);
		System.out.println("Calificacion: " + pNota);
	};
};
