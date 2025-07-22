import desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {



        Curso curso1 = new Curso();
        curso1.setCargaHoraria(8);
        curso1.setTitulo("curso Java");
        curso1.setDescricao("descrição curso Java");

        Curso curso2 = new Curso();
        curso2.setCargaHoraria(8);
        curso2.setTitulo("curso Java 2");
        curso2.setDescricao("descrição curso Java");

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setDescricao("Descrição mentoria Java");
        mentoria1.setTitulo("Mentoria Java");
        mentoria1.setData(LocalDate.now());


       /* System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Camila" + devCamila.getConteudosInscritos());
        devCamila.progredir();
        System.out.println("--");
        System.out.println("Conteudos Inscritos Camila" + devCamila.getConteudosInscritos());
        System.out.println("Conteudos concluídos Camila" + devCamila.getConteudosConcluidos());
        System.out.println("XP:" + devCamila.calcularTotalXp());



        System.out.println("--------------------------------------");


        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos João " + devJoao.getConteudosInscritos());
        devJoao.progredir();
        System.out.println("--");
        System.out.println("Conteudos Inscritos João " + devJoao.getConteudosInscritos());
        System.out.println("Conteudos concluídos João" + devJoao.getConteudosConcluidos());
        System.out.println("XP:" + devJoao.calcularTotalXp());


    }
}