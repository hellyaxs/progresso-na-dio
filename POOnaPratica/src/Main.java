import classDIO.*;

public class Main {
    public static void main(String[] args) {

        curso java = new curso("java","dominado a linguagem java",35);
        curso angular = new curso("Angular","dominado o frameWork js",45);

        Mentoria live = new Mentoria("live no youtube","consiga sua primeria vaga com estagiario");
        Mentoria liveI = new Mentoria("live no youtube","boas praticas de programção");


        bootcamp javaSpred = new bootcamp("javaSpred","aprenda java com a empresa Spred e torne-se um desenvolvedor de sucesso");
        javaSpred.getConteudo().add(java);
        javaSpred.getConteudo().add(angular);
        javaSpred.getConteudo().add(live);
        javaSpred.getConteudo().add(liveI);


        dev maria = new dev("maria");
        dev jose  = new dev("jose");

        maria.inscreverBootcamp(javaSpred);
        System.out.println("matriculas de maria:"+maria.getConteudosInscritos());
        jose.inscreverBootcamp(javaSpred);
        System.out.println("matriculas  de jose:"+jose.getConteudosInscritos());
     }
}
