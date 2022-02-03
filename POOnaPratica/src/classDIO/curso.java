package classDIO;

import java.time.LocalDate;
import java.util.Locale;

public class curso extends conteudo{

    private int cargarHoraria;

    public curso(String titulo,String descricao,int cargarHoraria) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.cargarHoraria = cargarHoraria;
    }

    public int getCargarHoraria() {
        return cargarHoraria;
    }

    public void setCargarHoraria(int cargarHoraria) {
        this.cargarHoraria = cargarHoraria;
    }

    @Override
    public double calcularXP() {
        return XP_padrao * this.cargarHoraria;
    }

    @Override
    public String toString() {
        return "curso{" +
                "titulo='" + titulo + '\'' +
                ", descricao='" + descricao + '\'' +
                ", cargarHoraria=" + cargarHoraria +
                '}';
    }
}
