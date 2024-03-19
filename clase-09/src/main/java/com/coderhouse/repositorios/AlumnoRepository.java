package com.coderhouse.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.coderhouse.entidades.Alumno;

@Repository
public interface AlumnoRepository extends JpaRepository<Alumno, Integer>{

}
