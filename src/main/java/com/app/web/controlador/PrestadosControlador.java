package com.app.web.controlador;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


import com.app.web.entidad.LibrosPrestados;
import com.app.web.servicio.LibrosPrestadosServicio;


@Controller


public class PrestadosControlador<JasperReport, jasperReport> {
	
	@Autowired
	private LibrosPrestadosServicio servicio;
	
	
	
	
	@GetMapping({"/libroPre","/"})
	
	
	public String listarLibrosPre(Model modelo) {
		modelo.addAttribute("libroPre",servicio.listarloslibrosPrestados());
		
		return "Prestamos";//retorna archivo html estudiantes
	}
	@GetMapping("/libroPre/nuevo")

	public String crearLibrosFormularioPre(Model modelo) {
		LibrosPrestados libroP=new LibrosPrestados();
		modelo.addAttribute("libroP", libroP);
		return "crear_prestaL";// retorna archivo html crear_estudiante
	}
	
	
	@PostMapping("/libroPre")

	public String guardarLibrospre(@ModelAttribute("libroP")LibrosPrestados libroP) {
		servicio.guardarLibrosPrestados(libroP);
		return "redirect:/libroPre";
	}
	
	@GetMapping("/libroPre/editar/{id}")
	
	public String mostrarFormularioDeEditarpre(@PathVariable Long id,Model modelo) {
		modelo.addAttribute("libroP",servicio.obtenerLibrosPrestadosPorId(id));
		return "editar_prestaL";
	}

	@PostMapping("/libroPre/{id}")
	
	public String actualizarLibrospre(@PathVariable Long id,@ModelAttribute("libroP")LibrosPrestados librosP ,Model modelo){
		LibrosPrestados LibroExistenteP =servicio.obtenerLibrosPrestadosPorId(id);

		LibroExistenteP.setId(id);
		LibroExistenteP.setLibro_prestamo(librosP.getLibro_prestamo());
		LibroExistenteP.setUsuario_prestamo(librosP.getUsuario_prestamo());
		LibroExistenteP.setFecha_prestamo(librosP.getFecha_prestamo());
		LibroExistenteP.setFecha_vencimiento(librosP.getFecha_vencimiento());
		
		
		servicio.actualizarLibrosPrestados(LibroExistenteP);
		
		return "redirect:/libroPre";
	}
	
@GetMapping("/libroPre/{id}")
	
	public String eliminarLibro(@PathVariable Long id) {
		servicio.eliminarLibroPrestado(id);
		return "redirect:/libroPre";
	}



}







