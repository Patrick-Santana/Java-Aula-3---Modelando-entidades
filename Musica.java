import java.util.Date;

public class Musica {
    String nome;
    String albumDeLancamento;
    String banda;
    Autor autor;

    public static void main(String[] args) {
        
        Autor a2 = new Autor();

        a2.nome = "Freddie Mercury";

        Musica a1 = new Musica();

        a1.nome = "Bohemian Rhapsody";
        a1.albumDeLancamento = "A Night of The Opera";
        a1.banda = "Queen";

        System.out.println("Nome do autor" + a2.nome);
        System.out.println("Nome de a1: " + a1.nome);
        System.out.println("Album de lancamento: " + a1.albumDeLancamento);
        System.out.println("Nome da Banda: " + a1.banda);
    }
}
