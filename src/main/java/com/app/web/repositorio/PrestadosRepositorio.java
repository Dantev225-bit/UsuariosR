package com.app.web.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.web.entidad.LibrosPrestados;

@Repository
public interface PrestadosRepositorio extends JpaRepository<LibrosPrestados,Long>{

}
