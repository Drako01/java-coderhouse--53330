package com.coderhouse;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.coderhouse.entidades.Alumno;
import com.coderhouse.entidades.Curso;
import com.coderhouse.repositorios.AlumnoRepository;
import com.coderhouse.repositorios.CursoRepository;

@SpringBootApplication
public class Clase09Application implements CommandLineRunner{
	
	@Autowired
	private AlumnoRepository alumnoRepository;
	
	@Autowired
	private CursoRepository cursoRepository;

	public static void main(String[] args) {
		SpringApplication.run(Clase09Application.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		 mostraMenu();
	}

	public void mostraMenu() {
		try {
			Scanner scanner = new Scanner(System.in);
			
			int opcion = -1; //Inicializo con una Opcion Invalida
			do {
				try {
					System.out.println("Menu: \n "
							+ "1. Listar a todos los Alumnos\n "
							+ "2. Agregar Alumno\n "
							+ "3. Buscar Alumno por DNI\n "
							+ "4. Modificar Alumno por DNI\n "
							+ "5. Eliminar Alumno por DNI\n "
							+ "6. Agregar Cursos\n "
							+ "0. Salir\n ");
					System.out.println("Ingresar opcion: ");
					
					if(scanner.hasNextInt()) {
						opcion = scanner.nextInt();
						scanner.nextLine();
					} else {
						System.out.println("Entrada Invalida. "
								+ "Debe Ingresar un Numero del Menu");
						scanner.nextLine();
						continue;
					}
					
					switch (opcion) {
					case 1:
						listarTodosLosAlumnos();
						break;
					case 2:
						agregarAlumno();
						break;
					case 3:
						buscarAlumnoPorDNI();
						break;
					case 4:
						modificarAlumnoPorDNI ();
						break;
					case 5: 
						eliminarAlumnoPorDNI();
						break;
					case 6:
						agregarCursos();
						break;
					case 0:
						System.out.println("Saliendo del Programa...");
						break;
					default:
						System.err.println("Opcion invalida. Ingrese un Numero Valido.");
						break;
					}
					
				}catch(InputMismatchException e) {
					System.err.println("Error: Ingrese un Numero Valido.");
					scanner.nextLine();
					opcion = -1;
				}
				
			} while(opcion != 0);
			
			scanner.close();
			
		}catch(Exception e) {
			e.getMessage();
		}
	}
	
	public void listarTodosLosAlumnos() {
		List<Alumno> listaAlumnos = alumnoRepository.findAll();
		if(listaAlumnos.isEmpty()) {
			System.out.println("No existen Alumnos para mostrar.!");
		} else {
			System.out.println("Lista de Alumnos: ");
			for (Alumno alumno : listaAlumnos) {
				System.out.println("El Alumno con DNI: #" 
								+ alumno.getDni() 
								+ " se llama " + alumno.getNombre() + " "
								+ alumno.getApellido() + " y asiste al curso de "
								+ alumno.getCurso().getTitulo());
			}
		}
	}

	public void agregarAlumno() {
		List<Curso> cursos = cursoRepository.findAll();
		if(cursos.isEmpty()) {
			System.out.println("No existen Cursos para mostrar. "
					+ "Debe agregar al menos un Curso!");
		}
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		Alumno alumno = new Alumno();
		
		
		System.out.println("Ingrese el DNI del Alumno:");
		alumno.setDni(scanner.nextInt());
		
		scanner.nextLine();
		
		System.out.println("Ingrese el Nombre:");
		alumno.setNombre(scanner.nextLine());
		
		System.out.println("Ingrese el Apellido:");
		alumno.setApellido(scanner.nextLine());
		
		System.out.println("Cursos Disponibles: ");
		for (Curso curso : cursos) {
			System.out.println(" " + curso.getId_curso() + ". " + curso.getTitulo());
		}
		
		int cursoId;
		Curso cursoSeleccionado = null;
		boolean cursoValido = false;
		
		while(!cursoValido) {
			try {
				
			
			System.out.println("Seleccione el ID del Curso: ");
			cursoId = scanner.nextInt();
			cursoSeleccionado = cursoRepository.findById(cursoId).orElse(null);
			if (cursoSeleccionado != null) {
				cursoValido = true;
			} else {
				System.out.println("El ID del Curso seleccionado no es Valido");
			}
			
			} catch(InputMismatchException e) {
				System.err.println("Error: Ingrese un Numero Valido.");
				scanner.nextLine();
			}
		}
		
		//Asignamos el Curso seleccionado
		alumno.setCurso(cursoSeleccionado);
		
		alumno.setLegajo((int) (Math.random() * 10000));
		
		
		alumnoRepository.save(alumno);
		
		System.out.println("Alumno guardado: " + alumno.getNombre() + " "
				+ alumno.getApellido() + " y se inscribio en el Curso de "
				+ alumno.getCurso().getTitulo());	
		
		
	}
	
	public void buscarAlumnoPorDNI() {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese el DNI del Alumno a buscar:");		
		int dni = scanner.nextInt();
		
		Alumno alumno = alumnoRepository.findById(dni).orElse(null);
		
		if(alumno != null) {
			System.out.println("El Alumno seleccionado es: " + alumno.getNombre() + " "
					+ alumno.getApellido() + " y se inscribio en el Curso de "
					+ alumno.getCurso().getTitulo());	
		}else {
			System.out.println("Alumno con DNI " + dni + " no fue encontrado!");		
		}
		
	}
	
	public void modificarAlumnoPorDNI () {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese el DNI del Alumno a editar:");		
		int dni = scanner.nextInt();
		Alumno alumno = alumnoRepository.findById(dni).orElse(null);
		List<Curso> cursos = cursoRepository.findAll();
		if(cursos.isEmpty()) {
			System.out.println("No existen Cursos para mostrar. "
					+ "Debe agregar al menos un Curso!");
		}
		if(alumno != null) {
			System.out.println("El Alumno encontrado es: " + alumno.getNombre() + " "
					+ alumno.getApellido() + " y se inscribio en el Curso de "
					+ alumno.getCurso().getTitulo());
			
			System.out.println("Ingrese el nuevo Nombre: ");
			String nuevoNombre = scanner.next();
			alumno.setNombre(nuevoNombre);
			System.out.println("Ingrese el nuevo Apellido: ");
			String nuevoApellido = scanner.next();
			alumno.setApellido(nuevoApellido);
			System.out.println("Cursos Disponibles: ");
			for (Curso curso : cursos) {
				System.out.println(" " + curso.getId_curso() + ". " + curso.getTitulo());
			}
			
			int cursoId;
			Curso cursoSeleccionado = null;
			boolean cursoValido = false;
			
			while(!cursoValido) {
				try {
					
				
				System.out.println("Seleccione el ID del Curso: ");
				cursoId = scanner.nextInt();
				cursoSeleccionado = cursoRepository.findById(cursoId).orElse(null);
				if (cursoSeleccionado != null) {
					cursoValido = true;
				} else {
					System.out.println("El ID del Curso seleccionado no es Valido");
				}
				
				} catch(InputMismatchException e) {
					System.err.println("Error: Ingrese un Numero Valido.");
					scanner.nextLine();
				}
			}
			
			//Asignamos el Curso seleccionado
			alumno.setCurso(cursoSeleccionado);
			
			alumnoRepository.save(alumno);
			System.out.println("Alumno modificado Correctamente");
			
			
		}else {
			System.out.println("Alumno con DNI " + dni + " no fue encontrado!");		
		}
	}
	
	public void eliminarAlumnoPorDNI() {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese el DNI del Alumno a editar:");		
		int dni = scanner.nextInt();
		Alumno alumno = alumnoRepository.findById(dni).orElse(null);
		
		if(alumno != null) {
			alumnoRepository.delete(alumno);
			System.out.println("El Alumno fue Eliminado Exitosamente.!");		
		}else {
			System.out.println("Alumno con DNI " + dni + " no fue encontrado!");		
		
		}
	}
	
	public void agregarCursos() {
		Curso curso = new Curso();
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese el Titulo del Curso:");	
		curso.setTitulo(scanner.nextLine());
		
		System.out.println("Ingrese la Descripcion del Curso:");	
		curso.setDescripcion(scanner.nextLine());
		
		cursoRepository.save(curso);
		System.out.println("El Curso " + curso.getTitulo() 
							+ " fue Guardado Exitosamente.!");
		
	}
	
}
