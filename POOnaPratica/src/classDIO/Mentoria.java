package classDIO;

import java.time.LocalDate;

public class Mentoria  extends conteudo{
    private LocalDate data;

    public Mentoria(String titulo,String descricao) {
        this.data = LocalDate.now();
        this.titulo = titulo;
        this.descricao = descricao;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public double calcularXP() {
        return XP_padrao +20d;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "data=" + data +
                ", titulo='" + titulo + '\'' +
                ", descricao='" + descricao + '\'' +
                '}';
    }
}
