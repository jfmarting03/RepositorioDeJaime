//Jaime Fernando Martín Gil 	//Proyecto de departamentos y empleados con jerarquía y agregación.
//2-03-2020
import java.util.Arrays;
import java.time.LocalDate;
public class Empleado {
	int emp_no;
	String apellido;
	String oficio;
	LocalDate fecha_alt;
	double salario;
	

	
	
	public Empleado(int emp_no, String apellido, String oficio, LocalDate fecha_alt, double salario) {
	
	}



	public Empleado() {
		super();
		this.emp_no = emp_no;
		this.apellido = apellido;
		this.oficio = oficio;
		this.fecha_alt = fecha_alt;
		this.salario = salario;
	}
	



	public Empleado(int emp_no2, String apellido2, String oficio2, String string, int salario2) {
		super();
		this.emp_no = emp_no;
		this.apellido = apellido;
		this.oficio = oficio;
		this.fecha_alt = fecha_alt;
		this.salario = salario;	
		}



	//------------SETTERS Y GETTERS CLASE EMPLEADO.JAVA------------------------
	public int getEmp_no() {
		return emp_no;
	}



	@Override
	public String toString() {
		return "Empleado [emp_no=" + emp_no + ", apellido=" + apellido + ", oficio=" + oficio + ", fecha_alt="
				+ fecha_alt + ", salario=" + salario + "]";
	}

	public void setEmp_no(int emp_no) {
		this.emp_no = emp_no;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getOficio() {
		return oficio;
	}

	public void setOficio(String oficio) {
		this.oficio = oficio;
	}

	public LocalDate getFecha_alt() {
		return fecha_alt;
	}

	public void setFecha_alt(LocalDate fecha_alt) {
		this.fecha_alt = fecha_alt;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public Departamento getDepartamento() {
		return getDepartamento();
	}


	
	//------------FIN SETTERS Y GETTERS CLASE EMPLEADO.JAVA------------------------

	public void MostrarDatos() {
		System.out.println("-----------Datos del empleado---------");
		 System.out.println("emp_no=" + 12);
		 System.out.println("apellido=" + "Pérez");
		 System.out.println("oficio=" + "programador");
		 System.out.println("fecha_alt=" + "12-03-20");
		 System.out.println("salario=" + 2200);
	}

	
	
}


