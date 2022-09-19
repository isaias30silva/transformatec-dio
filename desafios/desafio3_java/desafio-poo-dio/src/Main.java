import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {

	public static void main(String[] args) {
		
		Curso curso1 = new Curso();
		curso1.setTitulo("Curso de Java");
		curso1.setDescricao("Descrição do Curso de Java");
		curso1.setCargaHoraria(8);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("Curso JS");
		curso2.setDescricao("Descrição do Curso JavaScript");
		curso2.setCargaHoraria(4);
		
		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("Mentoria de Java");
		mentoria.setDescricao("Mentoria de Java");
		mentoria.setData(LocalDate.now());
		
		//System.out.println(curso1);
		//System.out.println(curso2);
		//System.out.println(mentoria);
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("Descrição");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);
		
		Dev devIsaias = new Dev();
		devIsaias.setNome("Isaias");
		devIsaias.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos Inscritos Isaias" + devIsaias.getConteudosInscritos());
		
		devIsaias.progredir();
		System.out.println("-");
		System.out.println("Conteúdos Inscritos Isaias" + devIsaias.getConteudosInscritos());
		System.out.println("Conteúdos Concluídos Isaias" + devIsaias.getConteudosConcluidos());
		System.out.println("XP:" + devIsaias.calcularTotalXp());
	
		System.out.println("----------------------------------------------------------------");
		
		Dev devLucas = new Dev();
		devLucas.setNome("Lucas");
		devIsaias.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos Inscritos Lucas" + devLucas.getConteudosInscritos());
		
		devLucas.progredir();
		System.out.println("-");
		System.out.println("Conteúdos Inscritos Isaias" + devIsaias.getConteudosInscritos());
		System.out.println("Conteúdos Concluídos Lucas" + devLucas.getConteudosConcluidos());
		System.out.println("XP:" + devLucas.calcularTotalXp());
		
		
		
	}

}
