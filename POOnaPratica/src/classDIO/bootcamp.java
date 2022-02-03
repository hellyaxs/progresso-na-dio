package classDIO;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class bootcamp {

    private String nome;
    private final LocalDate inicio = LocalDate.now();
    private final LocalDate dataFinal = inicio.plusDays(45);
    private String descricao;
    private Set<dev> devsInscrtos;

    public void devInscrito(dev dev){
        devsInscrtos = new HashSet<>();
        devsInscrtos.add(dev);
    }
}
