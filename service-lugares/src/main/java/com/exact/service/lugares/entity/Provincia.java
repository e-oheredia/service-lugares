
package com.exact.service.lugares.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="provincia",
uniqueConstraints={
	    @UniqueConstraint(columnNames = {"departamento_id", "nombre"})
	})
public class Provincia implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="provincia_id")
	private Long id;
	
	@Column(nullable=false, length=50)
	private String nombre;
	
	@ManyToOne(fetch=FetchType.EAGER, optional=false)
	@JoinColumn(name="departamento_id")
	private Departamento departamento;
	
	@OneToMany(cascade=CascadeType.PERSIST, fetch=FetchType.LAZY, mappedBy="provincia")
	@JsonIgnore
	private Set<Distrito> distritos;
	
	@Column(nullable=false, unique=true)
	private String ubigeo;	

	public String getUbigeo() {
		return ubigeo;
	}

	public void setUbigeo(String ubigeo) {
		this.ubigeo = ubigeo;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public Set<Distrito> getDistritos() {
		return distritos;
	}

	public void setDistritos(Set<Distrito> distritos) {
		this.distritos = distritos;
	}

	
	
}
