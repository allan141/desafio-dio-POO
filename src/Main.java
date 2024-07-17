import br.com.fio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso1.setTitulo("Curso JS");
        curso1.setDescricao("Descrição curso JavaScript");
        curso1.setCargaHoraria(4);


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("descrição mentoria Java");
        mentoria.setData(LocalDate.now());

        //System.out.println(curso1);
        //System.out.println(curso2);
        //System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devAllan = new Dev();
        devAllan.setNome("Allan");
        devAllan.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Allan" + devAllan.getConteudosInscritos());

        devAllan.progredir();

        devAllan.progredir();

        System.out.println("Conteúdos Inscritos Allan" + devAllan.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Allan" + devAllan.getConteudoConcluidos());
        System.out.println("XP:" + devAllan.calcularTotalXp());

        System.out.println("-------");


        Dev devMarilia = new Dev();
        devMarilia.setNome("Marilia");
        devMarilia.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Marilia" + devMarilia.getConteudosInscritos());

        devMarilia.progredir();

        devMarilia.progredir();

        devMarilia.progredir();

        System.out.println("Conteúdos Inscritos Marilia" + devMarilia.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Marilia" + devMarilia.getConteudoConcluidos());
        System.out.println("XP:" + devMarilia.calcularTotalXp());

        System.out.println("-------");

    }
}