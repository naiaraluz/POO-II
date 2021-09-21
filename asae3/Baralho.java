
package asae3;

import java.util.Random;

/**
 *
 *  @author ASUS
 */
public class Baralho {
   private Carta[] cartas;

    public Baralho() 
        throws Exception {
        cartas = new Carta[52];
        
        String[] naipes = {"espadas","paus","ouros","copas"};
        
        for(int i = 0; i<52; i++){
            cartas[i] = new Carta((i%13)+1, naipes[i/13]);
            
            //System.out.println("[" + i + "]" + cartas[i]);
        }
    }
   
    public void embaralhar(){
        Random embaralhando = new Random();
        int i = 0;
        int j = 0;
        for(int x = 0; x<100; x++){
            i = embaralhando.nextInt(52);
            j = embaralhando.nextInt(52);
            Carta tmp = cartas[i];
            cartas[i] = cartas[j];
            cartas[j] = tmp;
        }
    }
    
    @Override
    public String toString(){
        String str = "Cartas do baralho:\n";
        for(int i=0; i< 52; i++){
            str = str.concat("(" + (i+1) + ") " + cartas[i] + "\n");
        }
       return str;
    }
}
