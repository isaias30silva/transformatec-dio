package me.dio;

import me.dio.entidades.Contato;
import me.dio.entidades.Telefone;
import me.dio.entidades.Usuario;

public class Main {

	/**
	 * Classe para execução dos cenários de testes.
	 */
	public static void main(String[] args) {
		
		Usuario isaias = new Usuario();
		isaias.setNome("Isaias");
		isaias.setEmail("isaias30silva@gmail.com");
		isaias.setSenha("123456");
		
		Contato contatoMaria = new Contato();
		contatoMaria.setNome("Maria Amélia");
		contatoMaria.getTelefones().add(new Telefone(13, 988657456));
		
		Contato contatoIsaias = new Contato();
		contatoIsaias.setNome("Isaias");
		contatoIsaias.getTelefones().add(new Telefone(12, 981232708));
		contatoIsaias.getTelefones().add(new Telefone(12, 988456786));
		contatoIsaias.getEmails().add("isaias383@hotmail.com");
		contatoIsaias.getGrupos().add("Estudos");
		contatoIsaias.getGrupos().add("Trabalho");
		
		isaias.getContatos().add(contatoMaria);
		isaias.getContatos().add(contatoIsaias);
		
		//Estrutura de repetição com foreach
		for (Contato contato : isaias.getContatos()) {
			System.out.println(contato.getNome());
			for (Telefone telefone:contato.getTelefones()) {
				System.out.println(telefone.toString());
			}
		}
		
		//Estrutura de repetição Stream API do Java
		isaias.getContatos().stream().forEach(contato -> {
			System.out.println(contato.getNome());
			contato.getTelefones().stream().forEach(telefone -> {
				System.out.println(telefone.toString());
			});
		});
		
		//Estrutura de repetição Stream API do Java com Map
		isaias.getContatos().stream().forEach(contato -> {
			System.out.println(contato.getNome());
			contato.getTelefones().stream().map(Telefone::toString).forEach(System.out::println);
		});
	}

}
