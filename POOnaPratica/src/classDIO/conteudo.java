package classDIO;

public abstract class conteudo {
    protected String titulo;
    protected String descricao;
    protected static final double XP_padrao = 10d;

    public abstract double calcularXP();

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
