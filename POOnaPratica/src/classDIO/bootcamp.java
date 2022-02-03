package classDIO;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class bootcamp {

    private String nome;
    private final LocalDate inicio = LocalDate.now();
    private final LocalDate dataFinal = inicio.plusDays(45);
    private String descricao;
    private Set<dev> devsInscrtos = new HashSet<>();
    private Set<conteudo> conteudo = new LinkedHashSet<>();

    public bootcamp(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getInicio() {
        return inicio;
    }

    public LocalDate getDataFinal() {
        return dataFinal;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Set<dev> getDevsInscrtos() {
        return devsInscrtos;
    }

    public void setDevsInscrtos(Set<dev> devsInscrtos) {
        this.devsInscrtos = devsInscrtos;
    }

    public Set<classDIO.conteudo> getConteudo() {
        return conteudo;
    }

    public void setConteudo(Set<classDIO.conteudo> conteudo) {
        this.conteudo = conteudo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof bootcamp)) return false;
        bootcamp bootcamp = (bootcamp) o;
        return Objects.equals(getNome(), bootcamp.getNome()) && Objects.equals(getInicio(), bootcamp.getInicio()) && Objects.equals(getDataFinal(), bootcamp.getDataFinal()) && Objects.equals(getDescricao(), bootcamp.getDescricao()) && Objects.equals(getDevsInscrtos(), bootcamp.getDevsInscrtos()) && Objects.equals(getConteudo(), bootcamp.getConteudo());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome(), getInicio(), getDataFinal(), getDescricao(), getDevsInscrtos(), getConteudo());
    }
}
