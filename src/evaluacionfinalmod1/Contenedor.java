package evaluacionfinalmod1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 
 * Esta clase contiene las listas de Asesoria y Capacitancion, junto a los
 * metodos para almacenar cliente, almacenar profesional, almacenar
 * administrativo, almacenar capacitacion, eliminar usuario, listar Usuario,
 * listar ususario por tipo, listar capacitacion
 * 
 * @authores: Mauricio Sepulveda, Mauricio Marin, Nicolas Bonilla, Marcos Hanson
 * 
 * @version: 8/02/2021A
 * 
 */
public class Contenedor {

	// Metodo de validacion para entero
	public static Integer condicion() {
		Integer runu;
		try {
			Scanner leer = new Scanner(System.in);
			runu = leer.nextInt();
		} catch (Exception e) {
			System.out.println("ingrese solo numeros, por favor nuevamente,");
			runu = null;
		}
		return runu;
	}

	private List<Asesoria> lista1;// delcaracion de lista de asesoria
	private List<Capacitacion> lista2;// declaracion de lista capacitacion

	public Contenedor() {
		lista1 = new ArrayList<Asesoria>();// arraylist asesoria
		lista2 = new ArrayList<Capacitacion>();// arraylista capacitacion
	}

	ArrayList<Cliente> listaCliente = new ArrayList<Cliente>();// arraylist qu almacena datos de cliente para ser usados
																// junto con lista capacitacion
	ArrayList<Profesional> listaProfesional = new ArrayList<Profesional>();// arraylist usado en listado por tipo
	ArrayList<Administrativo> listaAdministrativo = new ArrayList<Administrativo>();// arraylist usado en listado por
																					// tipo

	// metodo para validar ingreso de fechas
	public String fechaNac() {
		Scanner captura = new Scanner(System.in);// captura dato ingresados por teclado

		int dia = 0;
		int mes = 0;
		int ano = 0;
		System.out.println("Ingrese el dia en formato DD");// ingreso de seccion dia
		dia = captura.nextInt();
		while (dia < 1 || dia > 31) {// validacion
			System.out.println("Dia invalido");
			System.out.println("------------");
			System.out.println("Ingrese el dia en formato DD");
			dia = captura.nextInt();
		}
		System.out.println("Ingrese el mes en formato MM");// ingreso de seccion mes
		mes = captura.nextInt();
		while (mes < 1 || mes > 12) {// validacion
			System.out.println("Mes invalido");
			System.out.println("------------");
			System.out.println("Ingrese el mes en formato MM");
			mes = captura.nextInt();
		}
		System.out.println("Ingrese el año en formato AAAA");// ingreso de seccion año
		ano = captura.nextInt();
		while (ano < 1900 || ano > 2012) {// validacion
			System.out.println("año invalido");
			System.out.println("------------");
			System.out.println("Ingrese el año en formato AAAA");
			ano = captura.nextInt();
		}
		String fechanac = dia + "/" + mes + "/" + ano;
		return fechanac;// retorna fecha con parametros solicitados
	}

	// almacena Cliente
	public void almacenarCLiente() {
		Cliente client = new Cliente();

		System.out.println("__________________");
		System.out.println(" ");
		System.out.println("Datos de CLIENTE");
		System.out.println("__________________");
		System.out.println(" ");
		Scanner captura = new Scanner(System.in);// captura dato ingresados por teclado

		// ingreso de datos tipo usuario
		System.out.println("Ingrese nombre de Usuario");
		String nombreu = captura.nextLine();
		while (nombreu.length() < 10 || nombreu.length() > 50) {// validacion
			System.out.println("Nombre ingresado invalido, minimo 10 carateres");
			System.out.println("------------");
			System.out.println("Ingrese nombre de Usuario");
			nombreu = captura.nextLine();
		}
		client.setNombre(nombreu);// sobreescribe Nombre de usuario con dato capturado

		System.out.println("Ingrese fecha de nacimiento de Usuario ");
		client.setFechaNacimiento(fechaNac());// llama a metodo ingreso y validacion de fecha y sobresescribe
												// fechaNacimiento de clase Usuario

		Integer runu;// variable run cliente
		// validar run con metodo condicion( que se ingrese solo enteros ) y validar que
		// sea menor a 99999999
		do {

			do {
				System.out.println("Ingrese run Usuario (sin puntos ni digito verificador) ");
				runu = condicion();
			} while (runu == null);
			if (runu >= 99999999) {
				System.out.println("run es invalido, por favor nuevamente,");
			}
		} while (runu >= 99999999);

		
		client.setRun(runu);// sobreescribe run de clase usuario con dato capturado

		Integer rutc; // variable rut cliente

		// validar rut con metodo condicion( que se ingrese solo enteros ) y validar que
		// sea menor a 99999999
		do {

			do {
				System.out.println("Ingrese rut Cliente (sin puntos ni digito verificador) ");
				rutc = condicion();
			} while (rutc == null);
			if (rutc >= 99999999) {
				System.out.println("rut es invalido, por favor nuevamente,");
			}

		} while (rutc >= 99999999);
		client.setRut(rutc);// sobreescribe rut de la clase cliente con dato capturado

		System.out.println("Ingrese nombre del Cliente");
		String nombrec = captura.nextLine();
		while (nombrec.length() < 5 || nombrec.length() > 30) { // validacion
			System.out.println("Largo del nombre Incorrecto");
			System.out.println("------------");
			System.out.println("ingrese nombre del cliente");
			nombrec = captura.nextLine();
		}
		client.setNombres(nombrec);// sobreescribe Nombre de clase cliente con dato capturado

		System.out.println("Ingrese apellido del Cliente");
		String apellidoc = captura.nextLine();

		while (apellidoc.length() < 5 || nombrec.length() > 30) { // validacion
			System.out.println("Largo del nombre Incorrecto");
			System.out.println("------------");
			System.out.println("ingrese apellido del CLiente");
			apellidoc = captura.nextLine();
		}
		client.setApellidos(apellidoc);// sobreescribe Apellido de clase cliente con dato capturado

		System.out.println("Ingrese telefono del Cliente");
		String telefonoc = captura.nextLine();

		while (telefonoc.length() < 8 || telefonoc.length() > 12) { // validacion
			System.out.println("Numero de telefono incorrecto");
			System.out.println("------------");
			System.out.println("Ingrese telefono del Cliente");
			telefonoc = captura.nextLine();
		}
		client.setTelefono(telefonoc);// sobreescribe telefono de clase cliente con dato capturado

		System.out.println("Ingrese AFP del Cliente");
		String afpc = captura.nextLine();

		while (afpc.length() < 4 || afpc.length() > 30) {
			System.out.println("AFP incorrecta");
			System.out.println("------------");
			System.out.println("Ingrese AFP del Cliente");
			afpc = captura.next();
		}
		client.setAfp(afpc);// sobreescribe afpde clase cliente con dato capturado

		System.out.println("Ingrese Sitema de Salud del Cliente");
		System.out.println("1.FONASA");
		System.out.println("2.ISAPRE");
		Integer saludc = captura.nextInt();

		while (saludc != 1 && saludc != 2) {
			System.out.println("Sistema de salud incorrecto");
			System.out.println("------------");
			System.out.println("Ingrese Sitema de Salud del Cliente");
			System.out.println("1.FONASA");
			System.out.println("2.ISAPRE");
			saludc = captura.nextInt();
		}
		client.setSalud(saludc);// sobreescribe sistema de salud de clase cliente con dato capturado
		String vacio=" ";
		vacio = captura.nextLine();
		System.out.println("Ingrese direccion del Cliente");
		String direccionc = captura.nextLine();

		while (direccionc.length() > 70) {
			System.out.println("Supera el largo permitido");
			System.out.println("------------");
			System.out.println("Ingrese direccion del Cliente");
			direccionc = captura.next();
		}
		client.setDireccion(direccionc);// sobreescribe direccion cde clase cliente con dato capturado

		System.out.println("Ingrese comuna del CLiente");
		String comunac = captura.nextLine();

		while (comunac.length() > 50) {
			System.out.println("Supera el largo permitido");
			System.out.println("------------");
			System.out.println("Ingrese comuna del Cliente");
			comunac = captura.next();
		}
		client.setComuna(comunac);// sobreescribe comuna de clase cliente con dato capturado

		System.out.println("Ingrese edad del Cliente");
		Integer edadc = captura.nextInt();

		while (edadc <= 0 || edadc > 150) {
			System.out.println("Edad ingresada incorrecta");
			System.out.println("------------");
			System.out.println("Ingrese edad del Cliente");
			edadc = captura.nextInt();
		}
		client.setEdad(edadc);// sobreescribe edad de clase cliente con dato capturado

		listaCliente.add(client);// agrega informacion capturada a arraylist Cliente
		lista1.add(client);// agrega informacion capturada a arraylist Asesoria

	}

	// Metodo almacena Profesinal
	public void almacenarProfesional() {
		Profesional pro = new Profesional();
		System.out.println("__________________");
		System.out.println(" ");
		System.out.println("Datos de PROFESIONAL");
		System.out.println("__________________");
		System.out.println(" ");

		Scanner captura = new Scanner(System.in);// captura dato ingresados por teclado

		System.out.println("Ingrese nombre de Usuario");
		String nombreu = captura.nextLine();
		while (nombreu.length() < 10 || nombreu.length() > 50) {// validacion
			System.out.println("Nombre ingresado invalido, minimo 10 carateres");
			System.out.println("------------");
			System.out.println("Ingrese nombre de Usuario");
			nombreu = captura.nextLine();
		}
		pro.setNombre(nombreu);// sobreescribe nombre de clase usuario con dato capturado

		System.out.println("Ingrese fecha de nacimiento de Usuario ");
		pro.setFechaNacimiento(fechaNac());// llama a metodo ingreso y validacion de fecha y sobresescribe
											// fechaNacimiento de clase Usuario

		Integer runu;// variable run cliente
		// validar run con metodo condicion( que se ingrese solo enteros ) y validar que
		// sea menor a 99999999
		do {

			do {
				System.out.println("Ingrese run (sin puntos ni digito verificador) ");
				runu = condicion();
			} while (runu == null);
			if (runu >= 99999999) {
				System.out.println("run es invalido, por favor nuevamente,");
			}
		} while (runu >= 99999999);

	
		pro.setRun(runu);// sobreescribe run de clase Usuario con dato capturado

		System.out.println("Ingrese Titulo del Profesional");
		String titulop = captura.nextLine();

		while (titulop.length() < 10 || titulop.length() > 50) {// validacion
			System.out.println("Titulo incorrecto");
			System.out.println("------------");
			System.out.println("Ingrese Titulo del Profesional");
			titulop = captura.nextLine();
		}
		pro.setTitulo(titulop);// sobreescribe titulo de clase Profesional con dato capturado

		System.out.println("Ingrese fecha de ingreso de Usuario ");
		pro.setFechaIng(fechaNac());// llama a metodo ingreso y validacion de fecha y sobresescribe fechaNacimiento
									// de clase Pofesional

		lista1.add(pro);// agrega informacion capturada a Arraylist Asesoria
		listaProfesional.add(pro);// agrega informacion capturada a Arraylist Pofesional

	}

	// Metodo almacena Administrativo
	public void almacenarAdministrativo() {
		Administrativo admin = new Administrativo();
		System.out.println("__________________");
		System.out.println(" ");
		System.out.println("Datos de ADMINISTRATIVO");
		System.out.println("__________________");
		System.out.println(" ");
		Scanner captura = new Scanner(System.in);// captura dato ingresados por teclado

		System.out.println("Ingrese nombre de Usuario");
		String nombreu = captura.nextLine();
		while (nombreu.length() < 10 || nombreu.length() > 50) {// validacion
			System.out.println("Nombre ingresado invalido, minimo 10 carateres");
			System.out.println("------------");
			System.out.println("Ingrese nombre de Usuario");
			nombreu = captura.nextLine();
		}
		admin.setNombre(nombreu);// sobreescribe nombre de clase usuario con dato capturado

		System.out.println("Ingrese fecha de nacimiento de Usuario ");
		admin.setFechaNacimiento(fechaNac());// llama a metodo ingreso y validacion de fecha y sobresescribe
												// fechaNacimiento de clase Usuario

		Integer runu; // variable run cliente
		// validar run con metodo condicion( que se ingrese solo enteros ) y validar que
		// sea menor a 99999999
		do {

			do {
				System.out.println("Ingrese run (sin puntos ni digito verificador) ");
				runu = condicion();
			} while (runu == null);
			if (runu >= 99999999) {
				System.out.println("run es invalido, por favor nuevamente,");
			}
		} while (runu >= 99999999);

		
		
		admin.setRun(runu);// sobreescribe run de clase Usuario con dato capturado
		System.out.println();
		System.out.println("Ingrese area del Administrativo");
		String area = captura.nextLine();

		while (area.length() < 5 || area.length() > 20) {// validacion
			System.out.println("Area ingresada invalida");
			System.out.println("------------");
			System.out.println("Ingrese area del Administrativo");
			area = captura.nextLine();
		}
		admin.setArea(area);// sobreescribe area de clase administrativo con dato capturado

		System.out.println("Ingrese experiencia previa del Administrativo");
		String expe = captura.nextLine();

		while (expe.length() > 100) {// validacion
			System.out.println("Excede largo maximo de caracteres");
			System.out.println("Ingrese experiencia previa del Administrativo");
			expe = captura.nextLine();
		}
		admin.setExperiencia(expe);// sobreescribe experiecnia de clase administrativo con dato capturado

		lista1.add(admin);// agrega informacion capturada a Arraylist Asesoria

		listaAdministrativo.add(admin);// agrega informacion capturada a Arraylist Administrativo

	}

	// 4.- Metodo almacenar capacitacion
	public void almacenarCapacitacion() {
		Scanner captura = new Scanner(System.in);// captura dato ingresados por teclado
		System.out.println("----- INGRESANDO NUEVA CAPACITACIÓN ----- ");
		Capacitacion capacitacion = new Capacitacion();
		String vacio = " ";

		System.out.println("ingresar ID de la Capacitación");
		Integer id = captura.nextInt();
		while (id < 0) {// validacion
			System.out.println("Debe ingresar un Identificador");
			System.out.println("ingresar ID de la Capacitación");
			id = captura.nextInt();
		}
		capacitacion.setIdentificador(id);// sobreescribe identificador de clase Capacitacion con dato capturado

		System.out.println("INGRESE RUT CLIENTE: ");
		Integer rutcliente = captura.nextInt();
		while (rutcliente < 1000000) {
			System.out.println("Debe ingresar un rut válido");
			System.out.println("INGRESE RUT CLIENTE: ");
			rutcliente = captura.nextInt();
		}
		int r = 0;// variable de salida
		for (int j = 0; j < lista1.size(); j++) {
            if (listaCliente.get(j).getRut().equals(rutcliente)) {
             System.out.println("---------rut encontrado-----------");
             capacitacion.setRutCliente(rutcliente);
             r=1;
            }
            else {
                if(listaCliente.get(j).getRut()==null) {
                    System.out.println("---------rut no existe en cliente-----------");
                }
                System.out.println("---------rut no existe en cliente-----------");
                r=0;
            }
         }


		while (r == 1) {
			vacio = captura.nextLine();// evitar salto de lectura despues de leer variable int
			System.out.println("Ingrese dia de la semana ");
			String dia = captura.nextLine().trim().toLowerCase();
			while (!dia.equals("lunes") && !dia.equals("martes") && !dia.equals("miercoles") && !dia.equals("jueves")// validacion
					&& !dia.equals("viernes") && !dia.equals("sabado") && !dia.equals("domingo")) {
				System.out.println("Ingrese un dia de la Semana válido");
				System.out.println("Ingrese dia de la semana ");
				dia = captura.nextLine();
			}
			capacitacion.setDia(dia);// sobreescribe dia de clase Capacitacion con dato capturado

			System.out.println("Ingrese hora en formato HH");
			int horas = 0;
			horas = captura.nextInt();
			while (horas > 23) {// validacion
				System.out.println("hora invalida");
				System.out.println("------------");
				System.out.println("Ingrese hora en formato HH");
				horas = captura.nextInt();
			}
			System.out.println("Ingrese minutos en formato MM");
			int minutos = 0;
			minutos = captura.nextInt();
			while (minutos > 59) {// validacion
				System.out.println("minutos invalidos");
				System.out.println("------------");
				System.out.println("Ingrese minutos en formato MM");
				minutos = captura.nextInt();
			}
			String hora = horas + ":" + minutos;// integra atributos para cumplir con formato solicitado
			capacitacion.setHora(hora);// sobreescribe hora de clase Capacitacion con dato capturado

			vacio = captura.nextLine();// evitar salto de lectura despues de leer variable int
			System.out.println("Ingrese Lugar de la Capacitacion ");
			String lugar = captura.nextLine();
			while (lugar.length() < 10 || lugar.length() > 50) {// validacion
				System.out.println("Lugar Inválido");
				System.out.println("Ingrese Lugar de la Capacitacion ");
				lugar = captura.nextLine();
			}
			capacitacion.setLugar(lugar);// sobreescribe lugar de clase Capacitacion con dato capturado

			System.out.println("Ingrese Duracion de la Capacitacion ");
			String duracion = captura.nextLine();
			while (duracion.length() > 70) {// validacion
				System.out.println("Duración inválida");
				System.out.println("Ingrese Duracion de la Capacitacion ");
				duracion = captura.nextLine();
			}
			capacitacion.setDuracion(duracion);// sobreescribe duracion de clase Capacitacion con dato capturado

			System.out.println("Ingrese cantidad de Asistentes");
			Integer cantidad = captura.nextInt();
			while (cantidad > 1000) {
				System.out.println("excede cantidad de asistentes");
				System.out.println("Ingrese cantidad de Asistentes");
				cantidad = captura.nextInt();
			}
			capacitacion.setCantidadAsistentes(cantidad);// sobreescribe rut cliente de clase Capacitacion con dato
															// capturado
			lista2.add(capacitacion);// agrega informacion capturada en Arraylist Capacitacion
			break;
		}
		
	}

	// Elimina Usuario segun run
	public void eliminarUsuario() {
		Scanner leerRun = new Scanner(System.in);
		System.out.println("ingrese run a eliminar: ");
		Integer runEliminar = leerRun.nextInt();

		for (int i = 0; i < lista1.size(); i++) {// ciclo para buscar rut dentro de Arraylist de Aseosria y eliminar
			if (lista1.get(i).getRun().equals(runEliminar)) {
				System.out.println("-------------------------");
				System.out.println("run encontrado: " + lista1.get(i).getRun());
				lista1.remove(i);
				System.out.println("Usuario ELIMINADO");
				break;
			}

		}
		for (int i = 0; i < listaCliente.size(); i++) {// ciclo para buscar rut en Arraylist Cliente y eliminar

			if (listaCliente.get(i).getRun().equals(runEliminar)) {
				listaCliente.remove(i);
				System.out.println("Cliente ELIMINADO");
			}

		}
		for (int i = 0; i < listaProfesional.size(); i++) {// ciclo para buscar rut en Arraylist Profesional y eliminar

			if (listaProfesional.get(i).getRun().equals(runEliminar)) {
				listaProfesional.remove(i);
				System.out.println("Profesional ELIMINADO");
			}

		}
		for (int i = 0; i < listaAdministrativo.size(); i++) {// ciclo para buscar rut en Arraylist administrativo y
																// eliminar

			if (listaAdministrativo.get(i).getRun().equals(runEliminar)) {
				listaAdministrativo.remove(i);
				System.out.println("administrativo ELIMINADO");
			}

		}

	}

	// Metodo Listar Usuario
	public void listarUsuario() {// metodo usado desde Asesoria que almacena informacion de cada tipo de usuario
									// con atributos de Usuario
		System.out.println("__________________________");
		for (Asesoria asesoria : lista1) {// ciclo que recorre Arraylist Asesoria y muestra usuarios
			asesoria.listarUsuario();
			System.out.println("__________________________");

		}

	}

	// Metrodo Listar Usuario por tipo
	/*
	 * Se realizo una interpretacion literal del enunciado:"recibe un tipo de
	 * usuario (cliente, administrador o profesional), y retorna los datos
	 * respectivos según el tipo de usuario."
	 */
	public void listarUsuariosPorTipo() {
		// Recibe un tipo de usuario ( cliente, administrador o profesional)
		Scanner captura = new Scanner(System.in);// captura dato ingresados por teclado
		System.out.println("------- LISTA DE USUARIO POR TIPO  DE PERFIL -------");// menu de seleccion de tipo de
																					// usuario
		System.out.println(" 1.- CLIENTE");
		System.out.println(" 2.- PROFESIONAL");
		System.out.println(" 3.- ADMINISTRATIVO");
		System.out.println("Ingrese el perfil deseado: ");
		Integer opcion = captura.nextInt();
		// y retorna los datos respectivos segun el tipo de usuario.
		switch (opcion) {// switch de seleccion segun opcion capturada
			case 1: // PERFIL CLIENTE
				for (Asesoria cliente : listaCliente) {// ciclo que recorre Arraylist Cliente
					System.out.println(cliente);// muestra Usuarios tipo Cliente
				}
				break;
			case 2:// PERFIL PROFESIONAL
				for (Profesional profesional : listaProfesional) {// ciclo que recorre Arraylist Profesional
					System.out.println(profesional); // muestra Usuarios tipo Profesional
				}
				break;
			case 3:// PERFIL ADMINISTRATIVO
				for (Administrativo administrativo : listaAdministrativo) {// ciclo que recorre Arraylist Administrativo
					System.out.println(administrativo);// muestra Usuarios tipo Administrativo
				}
				break;
			default:
				System.out.println(" Debe ingresar una opcion valida! ");
				break;
		}
	}

	// Metodo Listar capacitacion
	public void listarCapacitaciones() {

		Integer rut = 0;// variable rut cliente

		System.out.println("listado de capacitaciones: ");
		System.out.println("------------------------------");

		for (int i = 0; i < lista2.size(); i++) {// ciclo que recorre Arraylist Capacitacion y busca rut
			rut = lista2.get(i).getRutCliente();

			for (int j = 0; j < lista1.size(); j++) {// ciclo recorre lista de clientes

				if (listaCliente.get(j).getRut().equals(rut)) {// cuando hay coincidencia de rut, se despliega capacitacion
															// con cliente asociado
					System.out.println("---------rut encontrado-----------");
					System.out.println("capacitacion: " + i+1);
					System.out.print("Datos de la ");
					System.out.println(lista2.get(i));
					System.out.print("datos del ");
					System.out.println(listaCliente.get(j));

					System.out.println("------------------------------");

				}
			}

		}
	}
}
