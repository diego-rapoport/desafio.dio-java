package dio.desadio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {
    LocalDate data;

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Mentoria: \n\t\t\t" +
                "Título: " + getTitulo() + "\n\t\t\t" +
                "Descrição: " + getDescricao() + "\n\t\t\t" +
                "Data Inicial: " + getData();
    }

    @Override
    protected double calcularXp() {
        return XP_PADRAO + 20d;
    }
}
