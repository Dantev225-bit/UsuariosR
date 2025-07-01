package com.app.web.entidad;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.GenerationType;

@Entity
@Table(name="libroPre")
public class LibrosPrestados {
	
	  @Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	  
	  private Long Id;
	  
	  @Column(name = "usuario_prestamo",nullable=false,length=50) 
	  private String usuario_prestamo;
	  
	  @Column(name = "libro_prestamo",nullable=false,length=50) 
	  private String libro_prestamo;
	  
	  @Column(name = "Fecha_prestamo",nullable=false,unique=true) 
	  private LocalDate Fecha_prestamo;
	  
	  @Column(name = "Fecha_vencimiento",nullable=false,unique=true) 
	  private LocalDate Fecha_vencimiento;
	  
	  public LibrosPrestados() {
		  
	  }

	  public LibrosPrestados(Long id, String usuario_prestamo, String libro_prestamo, LocalDate Fecha_prestamo,LocalDate Fecha_vencimiento) {
			super();
			Id = id;
			this.usuario_prestamo = usuario_prestamo;
			this.libro_prestamo = libro_prestamo;
			this.Fecha_prestamo = Fecha_prestamo;
			this.Fecha_vencimiento=Fecha_vencimiento;
		}

	  public LibrosPrestados( String usuario_prestamo, String libro_prestamo, LocalDate Fecha_prestamo,LocalDate Fecha_vencimiento) {
			super();
			
			this.usuario_prestamo = usuario_prestamo;
			this.libro_prestamo = libro_prestamo;
			this.Fecha_prestamo = Fecha_prestamo;
			this.Fecha_vencimiento=Fecha_vencimiento;
		}

	  
	  

	
	  
	  





	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getUsuario_prestamo() {
		return usuario_prestamo;
	}

	public void setUsuario_prestamo(String usuario_prestamo) {
		this.usuario_prestamo = usuario_prestamo;
	}

	public String getLibro_prestamo() {
		return libro_prestamo;
	}

	public void setLibro_prestamo(String libro_prestamo) {
		this.libro_prestamo = libro_prestamo;
	}

	public LocalDate getFecha_prestamo() {
		return Fecha_prestamo;
	}

	public void setFecha_prestamo(LocalDate fecha_prestamo) {
		Fecha_prestamo = fecha_prestamo;
	}

	public LocalDate getFecha_vencimiento() {
		return Fecha_vencimiento;
	}

	public void setFecha_vencimiento(LocalDate fecha_vencimiento) {
		Fecha_vencimiento = fecha_vencimiento;
	}

	@Override
	public String toString() {
		return "LibrosPrestados [Id=" + Id + ", usuario_prestamo=" + usuario_prestamo + ", libro_prestamo=" + libro_prestamo + ", Fecha_prestamo=" + Fecha_prestamo +",Fecha_vencimiento="+ Fecha_vencimiento + "]";
	}
	  
}
