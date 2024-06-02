package juegopoker;

// import java.io.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
// import java.util.ArrayList;
import java.io.IOException;

public class JuegoPoker{
	public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	
	
	public static void main(String[] args) throws NumberFormatException, IOException{
		Deck objDeck = new Deck(null, null, 0);
		//int control = 0;
		//String opt;
		
		//objDeck.mezclarDeck();
		objDeck.head();
		
		/*
		while (control == 0) {
			mostrarMenu();
			System.out.print("Selecciona una opcion: ");
			opt = in.readLine();
			
			switch (opt.toUpperCase()) {
			case "A":
				for(Card s : cllcCard) {
					s.mezclarDeck();
					System.out.println(s);
				}
				break;
			case "B":
				for(Card s : cllcCard) {
					s.head();
					System.out.println(s);
				}
				break;
			case "C":
				for (Card s : cllcCard) {
					s.pick();
					System.out.println(s);
				}
				break;
			case "D":
				for (Card s : cllcCard) {
					s.hand();
					System.out.println(s);
				}
				break;
			case "E":
				System.out.println("### Gracias por jugar poker con nosotros, hasta pronto! ###");
				control = 1;
				break;
			default:
				System.out.println("Seleccion incorrecta, por favor ingresar una opción del menu.");
			
			}
		}
	}
	
	private static String mostrarMenu() {
		String op = "u";
		System.out.println("#####Menu de opciones#####");
		System.out.println("A: Mezclar deck.");
		System.out.println("B: Tomar la primera carta.");
		System.out.println("C: Selecciona una carta al azar.");
		System.out.println("D: Mostrar mano.");
		System.out.println("E: Termina el programa");
		return op;
	}*/

	}
};
