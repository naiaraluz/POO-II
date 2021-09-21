
package asae3;

/**
 *
 * @author ASUS
 */
public class ASAE3 {

    
    public static void main(String[] args) throws Exception {
        
        Carta carta = new Carta(2,"ouros");
        
        carta.mostraCarta();
        
        //carta.setNumero(20);
        //carta.setNaipe("bolinhas");
        
        Baralho baralho = new Baralho();
        
        baralho.embaralhar();
        
        System.out.println(baralho);
        
    }
    
}
