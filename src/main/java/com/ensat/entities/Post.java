package com.ensat.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "posts")
public class Post {

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(nullable = false)
	private int id;
	@Column(nullable = false)
	private String comentario;
	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "dni")
	@Column(nullable = false)
	private Usuario usuario;
	
	public Post(String comentario, Usuario usuario) {
		super();
		this.comentario = comentario;
		this.usuario = usuario;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}