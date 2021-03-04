//Jaime Fernando Mart�n Gil 	//Proyecto de departamentos y empleados con jerarqu�a y agregaci�n.
//2-03-2020

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Principal {
	static int dept_no=0; //INICIALIZO LA VARIABLE DEPT_NO A 0
	static Departamento[] departamentos= new Departamento[2]; //SE CREA UN ARRAY DE DEPARTAMENTOS
	static Empleado[] empleados= new Empleado[2]; //SE CREA UN ARRAY DE EMPLEADOS
	
	public static void main(String[] args) throws IOException {
		System.out.println("-----------MUESTRA DEL M�TODO AGREGACI�N-----------");
		AgregacionMetodo(); //LLAMO AL M�TODO DE AGREGACI�N
		System.out.println("-----------FIN MUESTRA DEL M�TODO AGREGACI�N-----------");
		System.out.println();
//----------------------------MEN�-----------------------------------------
		Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion; //Para guardar la opci�n del usuario
 
        while (!salir) { 
        	System.out.println("-----------MEN�-----------");
        	System.out.println("�Qu� men� de opciones desea seleccionar, departamentos o empleados?");
        	System.out.println("\s\s Opci�n 1 -Empleado");
        	System.out.println("\s\s Opci�n 2 -Departamento");
        	try {
        		 
                System.out.println("Escribe una de las opciones");
                opcion = sn.nextInt();
                
                switch (opcion) {
                case 1:
                    System.out.println("Has seleccionado la opcion para mostrar el men� de empleados."); submenu1();
                    System.out.println("");
                    break;
                case 2:
                	System.out.println("Has seleccionado la opcion para mostrar el men� de departamentos");submenu2();
                	break;
                default:
					System.out.println("Solo numeros del 1 al 2");
			}
		} catch (InputMismatchException e) {
			System.out.println("Tienes que insertar numeros del 1 al 2");
			sn.next();
	}

}
		
	}
        private static void submenu1() {  
	
        Scanner sn1 = new Scanner(System.in);
        boolean salir1 = false;
        int opcion1; //Para guardar la opci�n del usuario
 
        while (!salir1) { 
        	System.out.println("-----------MEN� DE EMPLEADOS-----------");
        	System.out.println("OPCIONES DEL MEN� EMPLEADO:");
        		System.out.println("\s\s 1. Mostrar existe empleado.");
        		System.out.println("\s\s 2. Mostrar datos empleado.");
        		System.out.println("\s\s 3. Mostrar array vacio.");
        		System.out.println("\s\s 4. Mostrar array completo."); 
        		System.out.println("\s\s 5. Mostrar salario maximo.");
        		System.out.println("\s\s 6. Buscar hueco.");
        		System.out.println("\s\s 7. Borrar un empleado a partir de su emp_no.");
        		System.out.println("\s\s 8. Salir");
    
        	try {
        		 
                System.out.println("Escribe una de las opciones anteriores");
                opcion1 = sn1.nextInt();
                
                switch (opcion1) {
                case 1:
                    System.out.println("Has seleccionado la opcion para mostrar existe empleado."); existeEmpleado(opcion1);
                    System.out.println("");
                    break;
                case 2:
                	 System.out.println("Has seleccionado la opcion para mostrar los datos de los empleados."); MostrarDatos();
                	 break;
                case 3:
                    System.out.println("Has seleccionado la opcion para mostrar array vacio."); arrayvacio( opcion1, opcion1);
                    break;
                case 4:
                    System.out.println("Has seleccionado la opcion para mostrar array completo."); arraycompleto(opcion1);
                   break;
                case 5:
                    System.out.println("Has seleccionado la opcion para mostrar salario maximo. "); salariomaximo(opcion1);
                    break;
                case 6:
                    System.out.println("Has seleccionado la opcion para buscar hueco."); buscaHueco();
                    break;
                case 7:
                    System.out.println("Has seleccionado la opcion para borrar un empleado a partir de su emp_no.");// borrarempleado(opcion);
                    break;
                case 8:
                  salir1 = true;
                    break;
                default:
					System.out.println("Solo numeros del 1 al 2");
			}
		} catch (InputMismatchException e) {
			System.out.println("Tienes que insertar numeros del 1 al 8");
			sn1.next();
	}
	
	
	}
        }
	private static void submenu2() {        		
    	
        Scanner sn2 = new Scanner(System.in);
        boolean salir2 = false;
        int subopcion = 0; //Para guardar la opci�n del usuario
 
        while (!salir2) {
        	System.out.println();
        	System.out.println("-----------MEN� DE DEPARTAMENTOS-----------");
        	System.out.println();
        	System.out.println("OPCIONES DEL MEN� DEPARTAMENTOS:");
        	System.out.println();
            System.out.println("\s\s 1. Mostrar todos los departamentos.");
            System.out.println("\s\s 2. Mostrar un departamento a partir de su dept_no.");
            System.out.println("\s\s 3. Insertar un departamento.");
            System.out.println("\s\s 4. Borrar un departamento a partir de su dept_no.");
            System.out.println("\s\s 5. Modificar atributo de departamentos a partir de su dept_no.");
            System.out.println("\s\s 6. Salir.");
            
            try {
 
                System.out.println("Escribe una de las opciones anteriores.");
                subopcion = sn2.nextInt();
 
                switch (subopcion) {
                    case 1:
                        System.out.println("Has seleccionado la opcion 1"); mostrardepartamentos();
                        break;
                    case 2:
                        System.out.println("Has seleccionado la opcion 2"); mostrardepartamentos();
                        break;
                    case 3:
                        System.out.println("Has seleccionado la opcion 3"); insertardepartamento(null);
                        break;
                    case 4:
                        System.out.println("Has seleccionado la opcion 4"); borrardepartamentopordeptno(subopcion, null);
                        break;
                    case 5:
                        System.out.println("Has seleccionado la opcion 5"); modificaratributos(null);
                    case 6:
                    	System.out.println("Has seleccionado la opcion 6"); 
                        salir2 = true;
                        break;
                    default:
                        System.out.println("Solo n�meros entre 1 y 6");
                }
            
            } catch (InputMismatchException e) {
                System.out.println("Debes introducir un n�mero");
                sn2.next();
    }
}
	//-------------------------FIN Menu---------------------------------

}
                

	//---------M�TODO DE AGREGACI�N-------------
		private static void AgregacionMetodo() {
			Empleado empleados= new Empleado(12, "perez", "programador", "12-05-2020", 2300);
			Departamento departamentos= new Departamento (5, "env�os", "zorita", "7 empleados");
				System.out.println(empleados);	
				System.out.println(departamentos);	
		}
		//---------FIN M�TODO DE AGREGACI�N-------------
        
      private static void modificaratributos(Object object) {
			// TODO Auto-generated method stub
			
		}
		//------------------------METODOS CLASE EMPLEADO.JAVA------------------------
        public static int existeEmpleado (int emp_no) { //busca en el array el n� de empleado y retorna -1.
			 int posicionDeNumeroEmp = emp_no;
			  if (posicionDeNumeroEmp == -1) {
			    System.out.println("El elemento NO existe en el array");
			  } else {
			    System.out.println("El elemento existe en la posici�n: " + posicionDeNumeroEmp);
			  } 
			return posicionDeNumeroEmp;
		}


    	public static void MostrarDatos() {
    		System.out.println("-----------Datos del empleado---------");
    		 System.out.println("emp_no=" + 12);
    		 System.out.println("apellido=" + "P�rez");
    		 System.out.println("oficio=" + "programador");
    		 System.out.println("fecha_alt=" + "12-03-20");
    		 System.out.println("salario=" + 2200);
    		
    	}
		
		public static void arrayvacio (int emp_no, int opcion) {
			 

			if(empleados == null || empleados.length == 0)
			{
			  System.out.println("El array esta vacio");
			}
			else{
				 System.out.println("El array contiene empleado");			}
		}
		public static void arraycompleto (int emp_no) {
			
			Empleado[] empleados= new Empleado[5];

			if(empleados == null || empleados.length == 0)
			{
			  System.out.println("El array no est� completo");
			}
			else{
				 System.out.println("El array est� completo");			
				 }
		}
			
		
		public static void salariomaximo (double salario) {
			
			int[] lista = new int[1]; 
			double salario1 = lista[1]; // Declaramos e inicializamos el m�ximo.
			
			for (int i = 0; i < 100; i++){
				if (salario1 < lista[i])
					salario1 = lista[i];
				
				// el bucle contiene las variables con el salario m�ximo
				System.out.println("El salario es " + salario1);
				
	}
		}
			public static void buscahueco(int[] Empleados) {
				boolean retornar;
				int posicion = Empleados [0];
				
					int i = 0;
					for ( posicion=0; i < 4; i++) {
						if (posicion > Empleados[i])
							posicion = Empleados [i];	
						
						System.out.println("la posicion del hueco libre es" + posicion);
					return;
						
					
			}
			
}
			 static boolean borrarempleado(Object emp_no) {
						if ((boolean) (emp_no == null) )
							
						return false;
						return false;
				
			}

      //------------------------FIN METODOS CLASE EMPLEADO.JAVA-----------------------	


//------------------------METODOS CLASE DEPARTAMENTO.JAVA------------------------

	private static void insertardepartamento(Object object) {
			// TODO Auto-generated method stub
			
		}


	private static void borrardepartamentopordeptno(int dept_no, Departamento[] departamentos) {
		// TODO Auto-generated method stub
		int indice = existedepartamentoInt(dept_no, departamentos);
		if (indice == -1) { //verifica si existe el departamento
			System.out.println("El departamento no existe, con lo cual no se puede borrar");
		} else {
			System.out.println("El departamento se ha borrado correctamente");
			departamentos[indice] = null;

		}
	}
	private static int existedepartamentoInt(int dept_no, Departamento[] departamentos) {
		for (int i = 0; i < departamentos.length; i++) {
			if (departamentos[i] != null && Departamento.getDept_no() == dept_no) {
					return i;
				}
			}
	
		return -1;
	}
	
	
	
	public static int buscaHueco() {
		int i;
		
		for (i = 0; i < departamentos.length; i++) {
			if (departamentos[i] == null) {
				return i;
			}
		}
		return -1;
	}

	
	




	private static void mostrardepartamentos() {
		for (int i = 0; i < departamentos.length; i++) {
			if (departamentos[i] != null) {
				System.out.println(departamentos[i]);
			}
		}
	}
		
		

//------------------------FIN METODOS CLASE DEPARTAMENTO.JAVA-----------------------	

}



