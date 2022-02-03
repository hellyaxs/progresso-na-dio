package classDIO;

import java.util.*;

public class dev {
    private String nome;
    private Set<conteudo> conteudosInscritos = new LinkedHashSet<>();
    private Set<conteudo> conteudosConcluidos = new LinkedHashSet<>();


    public void inscreverBootcamp(bootcamp bootcamp){
          conteudosInscritos.addAll(bootcamp.getConteudo());
          bootcamp.getDevsInscrtos().add(this);
    }

    public void progredir(){
       Optional<conteudo> first = conteudosInscritos.stream().findFirst();
       if(first.isPresent()){
           conteudosConcluidos.add(first.get());
           conteudosInscritos.remove(first.get());
       }else{
           System.out.println("voce nao esta inscritor em nemhum bootcamp");
       }

    }

    public double calculartotalXp(){
        return this.conteudosConcluidos.stream().mapToDouble(conteudo::calcularXP).sum();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<conteudo> getConteudosInscritos() {
        return conteudosInscritos;
    }

    public void setConteudosInscritos(Set<conteudo> conteudosInscritos) {
        this.conteudosInscritos = conteudosInscritos;
    }

    public Set<conteudo> getConteudosConcluidos() {
        return conteudosConcluidos;
    }

    public void setConteudosConcluidos(Set<conteudo> conteudosConcluidos) {
        this.conteudosConcluidos = conteudosConcluidos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof dev)) return false;
        dev dev = (dev) o;
        return Objects.equals(getNome(), dev.getNome()) && Objects.equals(getConteudosInscritos(), dev.getConteudosInscritos()) && Objects.equals(getConteudosConcluidos(), dev.getConteudosConcluidos());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome(), getConteudosInscritos(), getConteudosConcluidos());
    }
}
