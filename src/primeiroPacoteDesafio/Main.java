package primeiroPacoteDesafio;

import java.time.LocalDate;

import primeiroPacoteDesafio.dominio.Curso;
import primeiroPacoteDesafio.dominio.Mentoria;
import primeiroPacoteDesafio.dominio.Forum;

public class Main {
    public static void main (String [] args){
       
        Mentoria mentoria1 = new Mentoria();
        mentoria1.setDescricao("Ensinando e orientado projetos do paradigma orientado a objetos");
        mentoria1.setTitulo("Mentoria de Java e Python");
        mentoria1.setData(LocalDate.now());
        System.out.println(mentoria1);

        Mentoria mentoria2 = new Mentoria();
        mentoria2.setDescricao("Manipulando dados no banco de dados com a API do facebook");
        mentoria2.setTitulo("API facebook");
        mentoria2.setData(LocalDate.now());
        System.out.println(mentoria2);

        Curso curso1 = new Curso("Testes unitários com JUnit","Aprendendo testes de unidade com JUnit", 3);
        System.out.println(curso1);

        Forum forum1 = new Forum();
        forum1.setDescricao("Ajuda no desafio 'Quantidade necessária'");
        forum1.setTecnologia("Java");
        forum1.setAssunto("Como montar o calculo para que seja retornado o número de pizas em int?");
        System.out.println(forum1);







    }
}
