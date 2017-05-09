package biblioteca;
import java.util.ArrayList;

public class Biblioteca{

  ArrayList<Livro> livros;

  public Biblioteca(){
    this.livros = new ArrayList<>();
  }

  void adicionaLivro(Livro livro){
    this.livros.add(livro);
  }

  void removeLivro(Livro livro){
      this.livros.remove(livro);
  }
}
