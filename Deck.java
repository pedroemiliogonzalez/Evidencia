package juegopoker;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Deck extends Card{
	public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	String pPalo, pColor;
	int pValor;
	
	ArrayList <Card> cllcCard = new ArrayList<Card>();
	ArrayList <Card> deck = new ArrayList<Card>();
	
	public Deck(String pPalo, String pColor, int pValor) {
		super(pPalo, pColor, pValor);
		this.pPalo = pPalo;
		this.pColor = pColor;
		this.pValor = pValor;
		CrearBaraja();
	}

	//Crear Baraja
	public int CrearBaraja(){
		int i;
		
		System.out.println( "Creando Baraja de Poker: ");	
		for (i=0; i<13; i++) {
			cllcCard.add(new Card("CORAZONES","ROJO", i+1));
		}
		
		for (i=0; i<13; i++) {
			cllcCard.add(new Card("DIAMANTES","ROJO", i+1));
		}
		
		for (i=0; i<13; i++) {
			cllcCard.add(new Card("TREBOLES","NEGRO",i+1));
		}
		
		for (i=0; i<13; i++) {
			cllcCard.add(new Card("PICAS","NEGRO",i+1));
		}
		return i;
		
	};
	
	//Mezclar Baraja
	public void mezclarDeck() {
		for(Card c : cllcCard) {
			System.out.println("\n Se esta mezclando el Deck: ");
			Collections.shuffle(cllcCard);
			System.out.println(c + "\n Se mezclo Deck. ");
		}
		
	}
	
	//Mostrar primera carta del deck, luego debera removerse.
	public Card head() {
        System.out.println("Carta numero 1: " + cllcCard.get(0));
        cllcCard.remove(0);
        return null;
    };
	
	 // Mostrar una carta aleatorea del deck
	 public Card pick(){
		 System.out.println("Carta al azar: " + cllcCard);
		 return null; 
     }
	
	//Mostrar Mano
	 public void hand () {
		}
	 
	 public void despliegaBaraja() {
		 for (Card icard: cllcCard) {
			 System.out.print( icard.toString() + "\t" + "Palo: " + palo + "\t" + "Color: " + color + "\t" + "Numero: " + valor + "\t");
		 }
	 }
	
}
