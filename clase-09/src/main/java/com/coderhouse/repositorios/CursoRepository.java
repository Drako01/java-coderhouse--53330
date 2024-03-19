package com.coderhouse.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.coderhouse.entidades.Curso;

@Repository
public interface CursoRepository extends JpaRepository<Curso, Integer>{

}
