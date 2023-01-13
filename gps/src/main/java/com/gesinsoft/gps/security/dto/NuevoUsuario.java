package com.gesinsoft.gps.security.dto;

import java.util.HashSet;
import java.util.Set;

import com.gesinsoft.gps.models.Persona;

public class NuevoUsuario extends Persona {
		
	private String email;
	
	private String password;
	
	private String estado;
	
	private Set<String> roles = new HashSet<>();

	
	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Set<String> getRoles() {
		return roles;
	}

	public void setRoles(Set<String> roles) {
		this.roles = roles;
	}

	
}
