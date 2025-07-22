import desafio.dominio.Curso;
import desafio.dominio.Mentoria;

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


        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);


    }
}