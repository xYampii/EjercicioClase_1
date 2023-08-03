package SeleccionFutbol;

public class Masajista extends SeleccionFutbol{
	public int aniosexperiencia ;
	public String titulacion;
public Masajista()
{
	super();
	this.aniosexperiencia=0;
	this.titulacion="";
}
public Masajista(int id, String nombre, String apellido,int Edad,int aniosexperiencia,String titulacion)
{
	super(id,nombre,apellido,Edad);
	this.aniosexperiencia=aniosexperiencia;
	this.titulacion=titulacion;
}
public int getAniosexperiencia() {
	return aniosexperiencia;
}
public void setAniosexperiencia(int aniosexperiencia) {
	this.aniosexperiencia = aniosexperiencia;
}
public String getTitulacion() {
	return titulacion;
}
public void setTitulacion(String titulacion) {
	this.titulacion = titulacion;
}

}
