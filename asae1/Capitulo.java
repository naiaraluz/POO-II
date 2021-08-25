
package asae1;


public class Capitulo {
   private int numero;
   private Livro livro;

    public Capitulo(int numero, Livro livro) {
        this.numero = numero;
        this.livro = livro;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }
   
    
}
