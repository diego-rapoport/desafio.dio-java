import dio.desadio.dominio.Bootcamp;
import dio.desadio.dominio.Curso;
import dio.desadio.dominio.Dev;
import dio.desadio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Curso de Java com POO");
        curso1.setCargaHoraria(10);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria  Java");
        mentoria1.setDescricao("Mentoria de Java POO");
        mentoria1.setData(LocalDate.now());

        Bootcamp bootcamp1 = new Bootcamp();
        bootcamp1.setNome("Bootcamp de Java");
        bootcamp1.setDescricao("Iniciando Java com POO");
        bootcamp1.getConteudosMinistrados().add(curso1);
        bootcamp1.getConteudosMinistrados().add(mentoria1);

        Dev dev1 = new Dev();
        dev1.setNome("Luiz");
        dev1.inscreverBootcamp(bootcamp1);

        System.out.println(dev1);
        System.out.println("Total de XP = " + dev1.calcularTotalXp());

        dev1.progredir();
        System.out.println(dev1);
        System.out.println("Total de XP = " + dev1.calcularTotalXp());

        dev1.progredir();
        System.out.println("Total de XP = " + dev1.calcularTotalXp());
    }
}
