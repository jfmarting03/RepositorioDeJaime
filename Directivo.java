import java.time.LocalDate;

public class Directivo extends Empleado {
	double comision;
	//Empleado empleado1= new Empleado (12, "pérez", "programador", "12-03-20", 2300);//creacion de objeto empleado1
	private Empleado empleado;
	

	public Directivo() {//CONSTRUCTOR DIRECTIVO SIN PARAMETROS
		super();
		this.comision= comision;
		System.out.println("La comision de directivo es " + comision);
		}



		public Directivo(int emp_no, String apellido, String oficio, LocalDate fecha_alt, double salario) {
		super(emp_no, apellido, oficio, fecha_alt, salario);
		this.comision= comision;
		System.out.println("La comision de directivo es " + comision);
	}



		//----------GETTER Y SETTERS-----------------
		public double getComision() {
			return comision;
		}

		public void setComision(int comision) {
			this.comision = comision;
		}

		public Empleado getEmpleado1() {
			return getEmpleado1();
		}

		public void setEmpleado1(Empleado empleado1) {
			this.empleado= empleado;
		}
//------------FIN GETTERS Y SETTERS-----------------
		
//------------TO STRING-------------------
		
		@Override
		public String toString() {
			return super.toString() + "Directivo" + this.comision;
		
//------------FIN TO STRING-----------------
		
		
	}

}
