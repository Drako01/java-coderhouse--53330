package com.coderhouse;

import com.coderhouse.controlador.JavaDataBaseController;
import com.coderhouse.entidades.Alumno;
import com.coderhouse.entidades.Curso;

public class MainTest {

	public static void main(String[] args) {
		JavaDataBaseController controller = new JavaDataBaseController();
		
		controller.getConnection();		
			
		Curso curso1 = new Curso();
		Curso curso2 = new Curso();
		
		curso1.setTitulo("Introduccion a JAVA");
		curso1.setDescripcion("Java esta muy bueno!");
		
		curso2.setTitulo("Spring Boot");
		curso2.setDescripcion("Spring Boot la rompe");
		controller.insertarCurso(curso1);
		controller.insertarCurso(curso2);
		
		Alumno alumno = new Alumno();
		
		for (int i = 0; i < 100 ; i++) {
			alumno.setDni(10000000 + i);
			alumno.setNombre("Nombre" + i);
			alumno.setApellido("Apellido" + i);
			alumno.setLegajo(alumno.hashCode());
			alumno.setIdCurso(1);
			controller.insertarAlumno(alumno);
		}
		
		
		//controller.modificarAlumno(10000099, "Hector", "Ramirez");
		
		//controller.eliminarAlumno(10000098);
		controller.mostrarAlumnos();
		
		controller.closeConnection();
	}

}
