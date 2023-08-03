package SeleccionFutbol;

public class Entrenador extends SeleccionFutbol{
	public String idfederacion;
public Entrenador() {
		super();
		this.idfederacion="";		
	}
public  Entrenador(int id, String nombre, String apellido,int Edad,String idfederacion) {
	super(id,nombre,apellido,Edad);
	this.idfederacion=idfederacion;
}
public String getIdfederacion() {
	return idfederacion;
}
public void setIdfederacion(String idfederacion) {
	this.idfederacion = idfederacion;
}

}
