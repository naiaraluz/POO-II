
package asae1;


public class ASAE1 {

    public static void main(String[] args) {
        
        Livro livro1 = new Livro("565");
        Biblioteca biblio1 = new Biblioteca("IFSC Caçador");
        Autor autor1 = new Autor("Naiara Luz");
        Capitulo cap2 = new Capitulo(2, livro1);
     
        livro1.setAutor(autor1);
        livro1.setBiblioteca(biblio1);
        
        livro1.setCapitulo(0, cap2);
        autor1.setLivros(0, livro1);
        biblio1.setLivros(0, livro1);
        
        
        
    }
    
}
