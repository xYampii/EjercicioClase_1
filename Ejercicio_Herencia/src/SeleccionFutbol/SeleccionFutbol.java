package SeleccionFutbol;

public class SeleccionFutbol {
public int id;
public String nombre;
public String apellido;
public int Edad;
/*Constructor sin parameters*/
public SeleccionFutbol()
{
	this.id=0;
	this.nombre="";
	this.apellido="";
	this.Edad=0;
	
}
public SeleccionFutbol (int id, String nombre, String apellido, int Edad) {
	this.id=id;
	this.nombre=nombre;
	this.apellido=apellido;
	this.Edad= Edad;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getApellido() {
	return apellido;
}
public void setApellido(String apellido) {
	this.apellido = apellido;
}
public int getEdad() {
	return Edad;
}
public void setEdad(int edad) {
	Edad = edad;
}
public void Concentrarse(){
    System.out.println(this.nombre + " " + this.apellido + " en este momento esta realizando su concentración");
}

public void Viajar(){
System.out.println(this.nombre + " " + this.apellido + " en este momento esta viajando");

}

public void CalculoSalarioLiquido(int Salario){
    double igss=0.0483;
    double resultado;
    
    resultado = Salario - (Salario*igss);
    System.out.println("El salario liquido despues de impuestos es de : "  + resultado );
   
}
}