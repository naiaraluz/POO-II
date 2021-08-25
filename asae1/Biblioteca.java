
package asae1;

public class Biblioteca {
    private String nome;
    private Livro livros[];

    public Biblioteca(String nome, Livro[] livros) {
        this.nome = nome;
        this.livros = livros;
    }

    public Biblioteca(String nome) {
        this.nome = nome;
    }
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Livro[] getLivros() {
        return livros;
    }

    public void setLivros(int pos, Livro livros) {
        this.livros[pos] = livros;
    }

    

    
    
    
}
