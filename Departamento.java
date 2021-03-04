//Jaime Fernando Martín Gil 	//Proyecto de departamentos y empleados con jerarquía y agregación
//2-03-2020
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
public class Departamento {
	
	static int dept_no;
	static String nombre;
	static String localizacion;
	public static int length;
	private Empleado[] empleados; //para crear la agregacion hacemos array empleados en departamentos

	
   	
	public Departamento(Empleado[] empleados) {
		super();
		this.empleados = empleados;
	}


	public Departamento(int dept_no, String nombre, String localizacion, String string) {
		this.dept_no = dept_no;
		this.nombre = nombre;
		this.localizacion = localizacion;
		this.empleados = empleados;	}


	@Override
	public String toString() {
		return "Departamento [dept_no=" + dept_no + ", nombre=" + nombre + ", localizacion=" + localizacion
				+ ", empleados=" + Arrays.toString(empleados) + "]";
	}

//----------GETTERS Y SETTERS DE LA CLASE DEPARTAMENTO.JAVA--------------
	public static int getDept_no() {
		return dept_no;
	}

	public static void setDept_no(int dept_no) {
		Departamento.dept_no = dept_no;
	}

	public static String getNombre() {
		return nombre;
	}

	public static void setNombre(String nombre) {
		Departamento.nombre = nombre;
	}

	public static String getLocalizacion() {
		return localizacion;
	}

	public static void setLocalizacion(String localizacion) {
		Departamento.localizacion = localizacion;
	}

	public Empleado[] getEmpleados() {
		return empleados;
	}

	public void setEmpleados(Empleado[] empleados) {
		this.empleados = empleados;
	}
//----------------FIN GETTERS Y SETTERS CLASE DEPARTAMENTO.JAVA-----------------------------------

	

	//------------MÉTODO MOSTRAR DATOS------------------------
	public static void MostrarDatos() {
		System.out.println("-----------Datos del departamento---------");
		System.out.println("dept_no=" + 12);
		System.out.println("nombre=" + "Envíos");	
		System.out.println("localizacion=" + "Zorita");	
		System.out.println("empleados=" + "2 empleados");	
	}
//------------FIN MÉTODO MOSTRAR DATOS------------------------
	

}


