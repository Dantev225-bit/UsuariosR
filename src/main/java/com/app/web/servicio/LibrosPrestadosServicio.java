package com.app.web.servicio;

import java.util.List;

import com.app.web.entidad.LibrosPrestados;

public interface LibrosPrestadosServicio {

	public List<LibrosPrestados> listarloslibrosPrestados();
	
	//método para guardar el estudiante 2da. parte
		public LibrosPrestados guardarLibrosPrestados(LibrosPrestados libroP);
		
		public LibrosPrestados obtenerLibrosPrestadosPorId(Long id);
		
		public LibrosPrestados actualizarLibrosPrestados(LibrosPrestados libroP);
		
		public void eliminarLibroPrestado(Long id);

	
}