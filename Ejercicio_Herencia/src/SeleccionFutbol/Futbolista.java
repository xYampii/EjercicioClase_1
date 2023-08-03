package SeleccionFutbol;

public class Futbolista extends SeleccionFutbol {
public int numerojugador;
public String posicion;
public Futbolista(){
	super();
	this.numerojugador=0;
	this.posicion="";
}
public Futbolista(int id, String nombre, String apellido,int Edad,int numerojugador,String posicion)
{
	super (id, nombre, apellido, Edad);
	this.numerojugador=numerojugador;
	this.posicion=posicion;
}
public int getNumerojugador() {
	return numerojugador;
}
public void setNumerojugador(int numerojugador) {
	this.numerojugador = numerojugador;
}
public String getPosicion() {
	return posicion;
}
public void setPosicion(String posicion) {
	this.posicion = posicion;
}
public void JugarPartido(){
    System.out.println("El jugador " + this.nombre +" "+ this.apellido +" esta jugando un partido");

}
 
  public void Entrenar(){
    System.out.println("El jugador " + this.nombre +" "+ this.apellido +" esta entrenando antes del partido");

}
}
