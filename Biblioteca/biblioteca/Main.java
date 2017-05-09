package biblioteca;

public class Main{

    public static void main(String[] args){
        Autor a = new Autor(123, "carlos");
        Livro l = new Livro("programando pacas", 2017, "rapariga", a, false);
        Livro l1 = new Livro("programando pacas VOLUME DOIS", 2017, "going out", a, false);
        Biblioteca b = new Biblioteca();

        b.adicionaLivro(l);
        b.adicionaLivro(l1);

    for(Livro aux : b.livros){
        System.out.println(aux.autor.nome);
        System.out.println(aux.titulo);
        System.out.println(aux.editora);
        System.out.println(aux.emprestado);
    }

    l.emprestarLivro(l);

    for(Livro aux : b.livros){
        System.out.println(aux.autor.nome);
        System.out.println(aux.titulo);
        System.out.println(aux.editora);
        System.out.println(aux.emprestado);
    }

  }
}
