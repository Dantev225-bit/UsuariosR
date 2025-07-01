package com.app.web.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.web.entidad.LibrosPrestados;
import com.app.web.repositorio.PrestadosRepositorio;

@Service
public class LibrosPrestadosServicioImplem implements LibrosPrestadosServicio{

	@Autowired
	private PrestadosRepositorio repositorio2;
	
	
	
	
	
	@Override
	public List<LibrosPrestados> listarloslibrosPrestados() {
	
		return repositorio2.findAll();
	}
	
	@Override
	public LibrosPrestados guardarLibrosPrestados(LibrosPrestados libroP) {
		// TODO Auto-generated method stub
		return repositorio2.save(libroP);
	}

	@Override
	public LibrosPrestados obtenerLibrosPrestadosPorId(Long id) {
		// TODO Auto-generated method stub
		return repositorio2.findById(id).get();
	}

	@Override
	public LibrosPrestados actualizarLibrosPrestados(LibrosPrestados libroP) {
		// TODO Auto-generated method stub
		return repositorio2.save(libroP);
	}

	@Override
	public void eliminarLibroPrestado(Long id) {
		// TODO Auto-generated method stub
		repositorio2.deleteById(id);
	}


}



