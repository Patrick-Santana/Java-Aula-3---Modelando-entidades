import java.util.Date

public class Filme{
    String nome; // nome do filme
    Date dataDeLancamento; // Data de Lançamento
    String genero; // tipo do filme (terror, comédia)
    Autor autor;


    public static void public static void main(String[] args) {

        Autor a1 = new Autor();

        a1.nome = "Van Dee";
        a1.dataDeNascimento = new Date();
        a1.pais = "Australia";


        Filme l1 = new Filme();

        l1.nome = "Temer Preso";
        l1.dataDeLancamento = new Date();
        l1.genero = "Ficcao";

        System.out.println("nome do filme: " + l1.nome);
        System.out.println("data de lancamento: " + l1.dataDeLancamento);
        System.out.println("Autor de l1: " + l1.autor.nome);
        
    }
}
