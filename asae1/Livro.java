
package asae1;

public class Livro {
    private String ISBN;
    private Autor autor;
    private Biblioteca biblioteca;
    private Capitulo capitulo[];

    public Livro(String ISBN, Autor autor, Biblioteca biblioteca, Capitulo[] capitulo) {
        this.ISBN = ISBN;
        this.autor = autor;
        this.biblioteca = biblioteca;
        this.capitulo = capitulo;
    }

    public Livro(String ISBN) {
        this.ISBN = ISBN;
    }
    
    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public Biblioteca getBiblioteca() {
        return biblioteca;
    }

    public void setBiblioteca(Biblioteca biblioteca) {
        this.biblioteca = biblioteca;
    }

    public Capitulo[] getCapitulo() {
        return capitulo;
    }

    public void setCapitulo(int pos, Capitulo capitulo) {
        this.capitulo[pos] = capitulo;
        
    }


    

    
    
}
