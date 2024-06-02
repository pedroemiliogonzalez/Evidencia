package juegopoker;

public class Card {
	protected	String palo;
	protected	String color;
	protected	int valor;
	
	String [] paloArr = {"CORAZONES","DIAMANTES","TREBOLES","PICAS"};
	String [] colorArr = {"ROJO","NEGRO"};
	String [] valorArr = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
	
	public Card (String pPalo,String pColor,int pValor) {
		this.palo =pPalo;
		this.color = pColor;
		this.valor = pValor;	
	}
	
	public String toString() {
		return "Numero: " + valor + "Palo:" + palo + "Color:" + color;
	}
	
	public String getPalo() {return palo;}

	public void setPalo(String palo) {this.palo = palo;}

	public String getColor() {return color;}

	public void setColor(String color) {this.color = color;}

	public int getValor() {return valor;}

	public void setValor(int valor) {this.valor = valor;}
	
};
