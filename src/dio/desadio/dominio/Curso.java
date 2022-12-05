package dio.desadio.dominio;

public class Curso extends Conteudo {
    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    private int cargaHoraria;

    @Override
    public String toString() {
        return "Curso: " + getTitulo() + "\n\t\t\t" +
                "Descrição: " + getDescricao() + "\n\t\t\t" +
                "Carga horária(em horas): " + getCargaHoraria() + "\n\t";
    }

    @Override
    protected double calcularXp() {
        return XP_PADRAO + getCargaHoraria();
    }
}
