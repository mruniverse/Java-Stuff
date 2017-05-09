package biblioteca;

public class Livro{
  String titulo;
  int anoPub;
  String editora;
  Autor autor;
  boolean emprestado;

  public Livro(String titulo, int ano, String editora, Autor autor, Boolean emprestado){
    this.titulo = titulo;
    this.anoPub = ano;
    this.editora = editora;
    this.autor = autor;
    this.emprestado = emprestado;
  }

  void emprestarLivro(Livro livro){
    livro.emprestado = true;
  }

}
