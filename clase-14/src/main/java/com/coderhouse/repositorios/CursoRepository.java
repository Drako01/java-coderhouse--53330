package com.coderhouse.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.coderhouse.modelos.Curso;

@Repository
public interface CursoRepository extends JpaRepository<Curso, Integer>{

}
