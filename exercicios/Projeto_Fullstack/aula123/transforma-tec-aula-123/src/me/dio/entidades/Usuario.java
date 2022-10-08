package me.dio.entidades;

import java.util.ArrayList;
import java.util.List;

/**
 * Entidade responsável pelos dados do usuário e autenticação no sistema
 * Além disso, possui uma {@link List} de {@link Contato}s.
 *
 */

public class Usuario {

	private String nome;
	private String email;
	private String senha;
	private List<Contato> contatos = new ArrayList<>();
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public List<Contato> getContatos() {
		return contatos;
	}
	public void setContatos(List<Contato> contatos) {
		this.contatos = contatos;
	}
	
	
	
}
