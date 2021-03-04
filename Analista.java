
public class Analista extends Empleado {
String herramienta;


public Analista() {//CONSTRUCTOR ANALISTA SIN PARÁMETROS
	super();
	this.herramienta = herramienta;
}


public Analista(String emp_no, String apellido, String oficio, String fecha_alt, String salario,
		Departamento departamento, String herramienta) {//CONSTRUCTOR ANALISTA CON PARÁMETROS
	super();
	this.herramienta = herramienta;
}


//----------TO STRING--------------
@Override
public String toString() {
	return "Analista [herramienta=" + herramienta + "]";
}

//------GETTER Y SETTER-----------
public String getHerramienta() {
	return herramienta;
}

public void setHerramienta(String herramienta) {
	this.herramienta = herramienta;
}

//--------FIN GETTER Y SETTER------------



}
